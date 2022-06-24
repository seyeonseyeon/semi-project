package com.semi4.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CateBiz;
import com.semi4.biz.ProductBiz;

@SpringBootTest
class CateDeleteTest {

	@Autowired
	CateBiz biz;
	@Test
	void contextLoads() {
		try {
			biz.remove(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
