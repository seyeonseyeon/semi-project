package com.semi4.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.ProductBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class SelectAllProductTest {
	
	@Autowired
	ProductBiz biz;
	@Test
	
	void contextLoads() {
		System.out.println("g한글출력");
		List<ProductVO> list = null;
		try {
			list = biz.get();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (ProductVO vo : list) {
			System.out.println(vo);
			
		}
	}
	
}
