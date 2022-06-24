package com.semi4.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
class CartSelectIDTests {
	@Autowired
	CartBiz biz;
	
	
	@Test
	void contextLoads() {
		List<CartVO> list = null;
		
		try {
			list = biz.getID("id01");
			for (CartVO cartVO : list) {
				System.out.println(cartVO);
			}
			
			System.out.println("Select OK");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
