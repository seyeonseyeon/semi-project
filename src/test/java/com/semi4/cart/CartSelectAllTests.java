package com.semi4.cart;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CartBiz;
import com.semi4.vo.CartVO;

@SpringBootTest
class CartSelectAllTests {

	@Autowired
	CartBiz biz;
	
	@Test
	void contextLoads() {
		List<CartVO> list = null;
		try {
			list = biz.get();
			for (CartVO obj : list) {
				System.out.println(obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


