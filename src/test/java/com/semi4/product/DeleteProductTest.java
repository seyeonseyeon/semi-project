package com.semi4.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.ProductBiz;

@SpringBootTest
class DeleteProductTest {

	@Autowired
	ProductBiz biz;
	@Test
	void contextLoads() {
		try {
			biz.remove(42);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
