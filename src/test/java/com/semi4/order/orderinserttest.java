package com.semi4.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.OrderBiz;
import com.semi4.vo.OrderVO;

@SpringBootTest
class orderinserttest {
	
	
	
	@Autowired
	OrderBiz biz;

	@Test
	void contextLoads() {		

		try {
			int result = 0;
			OrderVO obj = new OrderVO("order44", "인설트테스트","대한민국","010");
			result = biz.orderregister(obj);
			System.out.println("obj.oid : " + obj.getOid());
			System.out.println("result : " + result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
