package com.semi4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CateBiz;
import com.semi4.biz.CustBiz;
import com.semi4.biz.ProductBiz;
import com.semi4.vo.CateVO;
import com.semi4.vo.ProductVO;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	
	@Autowired
	CustBiz custbiz;
	
	@Autowired
	ProductBiz productbiz;
	
	@Autowired
	CateBiz catebiz;
	
	//String path = "테스트입니다. 여긴 컨트롤러";

	@RequestMapping("")
	public String main(Model m) {
			List<ProductVO> plist = null;
			try {
				plist = productbiz.get();
				m.addAttribute("plist", plist);
				//m.addAttribute("path", path);
				m.addAttribute("center", "product/center");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			m.addAttribute("left", "product/left");
		
		
		return "main";
	}
	@RequestMapping("/detail")
	public String detail(Model m, int pid) {

		ProductVO obj = null;
		List<CateVO> list = null;
		try {
			list = catebiz.get();
			m.addAttribute("clist", list);
			obj = productbiz.get(pid);
			m.addAttribute("dp", obj);
			m.addAttribute("center", "product/detail");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
		return "main";
	}

	
}
