package com.semi4.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CateBiz;
import com.semi4.vo.CateVO;

@SpringBootTest
class CateSelectTest {
	
	@Autowired
	CateBiz biz;
	@Test
	
	void contextLoads() {
	
		CateVO obj = null;
		try {
			obj = biz.get(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(obj);
		
		
	}
	
}
