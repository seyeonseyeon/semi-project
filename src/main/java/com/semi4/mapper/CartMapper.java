package com.semi4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi4.vo.CartVO;

@Repository
@Mapper
public interface CartMapper {

	public void insert(CartVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(CartVO obj) throws Exception;
	public CartVO select(int obj) throws Exception;
	public List<CartVO> selectall() throws Exception;
	public List<CartVO> selectID(String obj) throws Exception;
	public CartVO selectcp(CartVO obj) throws Exception;
	public void updateucp(CartVO obj) throws Exception;
	public CartVO cartcnt(int obj) throws Exception;
}