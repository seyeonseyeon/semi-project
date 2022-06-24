package com.semi4.cate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CateBiz;
import com.semi4.biz.ProductBiz;
import com.semi4.vo.CateVO;
import com.semi4.vo.ProductVO;

@SpringBootTest
class CateInsertTest {
	
	@Autowired
	CateBiz biz;

	@Test
	void contextLoads() {
		CateVO obj = new CateVO(41, "dd",0);
		try {
			biz.register(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
