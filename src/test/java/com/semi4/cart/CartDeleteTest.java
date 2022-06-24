package com.semi4.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;

@SpringBootTest
class CartDeleteTest {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		try {
			biz.remove(5);
			System.out.println("Remove OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
