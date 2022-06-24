package com.semi4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi4.vo.ProductVO;

@Repository
@Mapper
public interface SerchMapper {
	
	public List<ProductVO> all(String obj) throws Exception;
	public List<ProductVO> title(String obj) throws Exception;
	public List<ProductVO> write(String obj) throws Exception;
	public List<ProductVO> pub(String obj) throws Exception;
	public List<ProductVO> cid(Integer obj) throws Exception;
	
}
