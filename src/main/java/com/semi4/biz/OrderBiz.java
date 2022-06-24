package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi4.frame.Biz;
import com.semi4.mapper.OrderMapper;
import com.semi4.vo.OrderVO;

@Service
public class OrderBiz implements Biz<Integer, OrderVO> {

	@Autowired
	OrderMapper dao;
	
	@Override
	public void register(OrderVO v) throws Exception {
		dao.insert(v);	
	}

	@Override
	public void modify(OrderVO v) throws Exception {
		dao.update(v);
	}
	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}
	@Override
	public OrderVO get(Integer k) throws Exception {
		return dao.select(k);
	}
	@Override
	public List<OrderVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<OrderVO> selectuser(OrderVO v) throws Exception{
		return dao.selectuser(v);
	}

	public int orderregister(OrderVO v) throws Exception{
		return dao.orderinsert(v);
	}
	public void orderdetailregister(OrderVO v) throws Exception{
		dao.orderdetailinsert(v);
	}

	public List<OrderVO> selecdetail(OrderVO obj) throws Exception{
		return dao.selecdetail(obj);
	}
	
	
}
