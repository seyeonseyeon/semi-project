package com.semi4.cart;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
class CartUpdateTests {

	@Autowired
	CartBiz biz;
	@Test
	void contextLoads() {
		CartVO p = new CartVO(4,1);
		try {
			biz.modify(p);
			System.out.println("Modify OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
