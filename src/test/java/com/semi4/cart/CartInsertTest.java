package com.semi4.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
public class CartInsertTest {
	@Autowired
	CartBiz biz;
	@Test
	void contextLoads() {
		CartVO c = new CartVO("id01",7,1 );
		try {
			biz.register(c);
			System.out.println("Registered OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
	};

}
