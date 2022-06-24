package com.semi4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi4.vo.OrderVO;

@Repository
@Mapper
public interface OrderMapper {

	public void insert(OrderVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(OrderVO obj) throws Exception;
	public OrderVO select(int obj) throws Exception;
	public List<OrderVO> selectall() throws Exception;
	
	public List<OrderVO> selectuser(OrderVO obj) throws Exception;
	public List<OrderVO> selecdetail(OrderVO obj) throws Exception;
	public int orderinsert(OrderVO obj) throws Exception;
	public void orderdetailinsert(OrderVO obj) throws Exception;
	
}
