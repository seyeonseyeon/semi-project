package com.semi4.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
class CartSelectTests {
	@Autowired
	CartBiz biz;
	
	
	@Test
	void contextLoads() {
		CartVO cart = null;
		
		try {
			cart = biz.get(2);
			
			System.out.println("Select OK");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println(cart);
	}

}
