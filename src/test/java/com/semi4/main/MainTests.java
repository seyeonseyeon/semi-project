package com.semi4.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.MainBiz;
import com.semi4.biz.ProductBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class MainTests {
	
	@Autowired
	MainBiz biz;

	@Test
	void contextLoads() {		
		List<ProductVO> list = null;
		
		try {
			list = biz.get();
			for (ProductVO obj : list) {
				System.out.println(obj);
				obj.getTitle();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
