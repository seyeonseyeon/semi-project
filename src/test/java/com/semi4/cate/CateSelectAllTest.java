package com.semi4.cate;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.CateBiz;
import com.semi4.vo.CateVO;

@SpringBootTest
class CateSelectAllTest {
	
	@Autowired
	CateBiz biz;
	@Test
	
	void contextLoads() {
		List<CateVO> list = null;
		try {
			list = biz.get();
			for (CateVO vo : list) {
				System.out.println(vo);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
