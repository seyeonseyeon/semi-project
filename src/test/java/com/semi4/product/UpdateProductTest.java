package com.semi4.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.ProductBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class UpdateProductTest {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		
		ProductVO p = new ProductVO(38,41,"a","a","a",55,0,18,"a","a","a");
		try {
			biz.modify(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
