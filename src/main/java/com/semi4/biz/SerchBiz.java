package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi4.frame.SerchBizFrame;
import com.semi4.mapper.SerchMapper;
import com.semi4.vo.ProductVO;


@Service
public class SerchBiz implements SerchBizFrame<String, ProductVO> {

	@Autowired
	SerchMapper dao;

	@Override
	public List<ProductVO> getAll(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.all(k);
	}

	@Override
	public List<ProductVO> getTitle(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.title(k);
	}

	@Override
	public List<ProductVO> getWriter(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.write(k);
	}

	@Override
	public List<ProductVO> getPub(String k) throws Exception {
		// TODO Auto-generated method stub
		return dao.pub(k);
	}
	
	public List<ProductVO> getCid(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return dao.cid(k);
	}


}
