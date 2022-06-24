package com.semi4.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.SerchBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class SearchTest {
	
	@Autowired
	SerchBiz biz;
	@Test
	void contextLoads() {
		List<ProductVO> list = null;
		try {
			list = biz.getTitle("일");
			if(list.size() != 0) {
				System.out.println(list);
				System.out.println("일지정보");
				System.out.println(list.get(0).getTitle());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	};

}
