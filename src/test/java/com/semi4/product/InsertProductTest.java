package com.semi4.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semi4.biz.ProductBiz;
import com.semi4.vo.ProductVO;

@SpringBootTest
class InsertProductTest {
	
	@Autowired
	ProductBiz biz;

	@Test
	void contextLoads() {
		ProductVO obj = new ProductVO(42,"title","writer","pub",300,1,12,"img1.jpg","img2.jpg","img3.jpg");
		try {
			biz.register(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//INSERT INTO PRODUCT VALUES (NULL,#{cid},#{title},#{writer},#{pub},#{price},
	//		#{status},#{adult},#{img1},#{img2},#{img3})
	
}
