package com.semi4.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@SpringBootTest
class CustInsertTest {
     
	@Autowired
	CustBiz cbiz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id06", "pwd06", "ki", "newyork", "tel6", "1996");
		try {
			cbiz.register(cust);
			System.out.println("등록 완료되었습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
