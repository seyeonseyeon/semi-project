package com.semi4.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CateBiz;
import com.semi4.vo.CateVO;

@SpringBootTest
class CateUpdateTest {
	
	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		
		CateVO p = new CateVO(50,"ww",51);
		try {
			biz.modify(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
