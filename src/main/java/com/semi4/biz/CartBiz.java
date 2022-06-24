package com.semi4.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semi4.frame.Biz;
import com.semi4.mapper.CartMapper;
import com.semi4.vo.CartVO;

@Service
public class CartBiz implements Biz<Integer, CartVO> {
	@Autowired
	CartMapper dao;

	@Override
	public void register(CartVO v) throws Exception {
		dao.insert(v);
		
	}

	@Override
	public void modify(CartVO v) throws Exception {
		dao.update(v);
		
	}

	@Override
	public void remove(Integer k) throws Exception {
		dao.delete(k);
		
	}

	@Override
	public CartVO get(Integer k) throws Exception {
		return dao.select(k);
	}

	@Override
	public List<CartVO> get() throws Exception {
		return dao.selectall();
	}
	
	public List<CartVO> getID(String uid) throws Exception {
			return dao.selectID(uid);
	
	}
	public CartVO getcp(CartVO v) throws Exception {
		return dao.selectcp(v);
	}
	public void modifyucp(CartVO v) throws Exception {
		dao.updateucp(v);
	}
	public void getcnt(Integer k) throws Exception {
		dao.cartcnt(k);
	};
}
