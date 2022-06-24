package com.semi4.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.ProductBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class SelectProductTest {
	
	@Autowired
	ProductBiz biz;
	@Test
	void contextLoads() {
		ProductVO obj = null;
		try {
			obj = biz.get(4);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(biz.get(19));
	}
	
}
