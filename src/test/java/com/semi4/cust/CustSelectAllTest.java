package com.semi4.cust;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CustBiz;
import com.semi4.vo.CustVO;

@SpringBootTest
class CustSelectAllTest {
     
	@Autowired
	CustBiz cbiz;
	
	@Test
	void contextLoads() {
		List<CustVO> list = null;
		try {
			list = cbiz.get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (CustVO custVO : list) {
			System.out.println(custVO);
		}
	}
}
