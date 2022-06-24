package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi4.frame.Biz;
import com.semi4.mapper.CateMapper;
import com.semi4.mapper.ProductMapper;
import com.semi4.vo.CateVO;

@Service
public class CateBiz implements Biz<Integer, CateVO> {

	@Autowired
	CateMapper dao;
	
	@Override
	public void register(CateVO v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void modify(CateVO v) throws Exception {
		dao.update(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
	}

	@Override
	public CateVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CateVO> get() throws Exception {
		return dao.selectall();
	}



}
