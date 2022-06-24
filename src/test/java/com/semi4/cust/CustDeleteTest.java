package com.semi4.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CustBiz;

@SpringBootTest
class CustDeleteTest {
     
	@Autowired
	CustBiz cbiz;
	
	@Test
	void contextLoads() {
		try {
			cbiz.remove("id03");
			System.out.println("삭제 완료되었습니다!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
