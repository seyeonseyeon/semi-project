package com.semi4.order;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.OrderBiz;
import com.semi4.vo.OrderVO;

@SpringBootTest
class orderselectteset {
	
	
	
	@Autowired
	OrderBiz biz;

	@Test
	void contextLoads() {		

		try {
			List<OrderVO> list = null;
			list = biz.selecdetail(null);
			System.out.println("list : " + list);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
