package com.semi4.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@SpringBootTest
class CustSelectTest {
     
	@Autowired
	CustBiz cbiz;
	
	@Test
	void contextLoads() {
		CustVO cust = null;
		try {
			cust = cbiz.get("id01");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(cust);
	}
}
