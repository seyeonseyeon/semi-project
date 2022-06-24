package com.semi4.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.SerchBiz;
import com.semi4.vo.ProductVO;

@Controller
@RequestMapping("/cate")
public class CateController {
	
	@Autowired
	SerchBiz sbiz;
	
	@RequestMapping("")
	public ModelAndView main(ModelAndView mv, int cid) {
		List<ProductVO> list = new ArrayList<ProductVO>();
		System.out.println("asdfasdjfiajeflaijCID!!!!!!!11111111111111"+cid);
		if( cid != 0) {
			try {
				list = sbiz.getCid(cid);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		mv.addObject("plist", list);
		mv.addObject("left", "product/left");
		mv.setViewName("main");
		mv.addObject("center", "product/center" );
		return mv;
	}
}








