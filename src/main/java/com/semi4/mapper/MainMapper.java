package com.semi4.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.semi4.vo.CartVO;
import com.semi4.vo.ProductVO;

@Repository
@Mapper
public interface MainMapper {

	public void insert(ProductVO obj) throws Exception;
	public void delete(int obj) throws Exception;
	public void update(ProductVO obj) throws Exception;
	public ProductVO select(int obj) throws Exception;
	public List<ProductVO> selectall() throws Exception;
	public List<ProductVO> serchall(String obj) throws Exception;
}
