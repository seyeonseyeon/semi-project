package com.semi4.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semi4.biz.CartBiz;
import com.semi4.biz.CustBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@Controller
@RequestMapping("/cart")
public class CartController {
	@Autowired
	CartBiz biz;
	
	public void cartList(Model m, HttpSession session) {
		List<CartVO> list = null;
		CustVO cust = null;
		try {
			cust = (CustVO) session.getAttribute("logincust");
			
			
			list= biz.getID(cust.getUid());
			m.addAttribute("cartlist", list);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping("")
	public String center(Model m, HttpSession session) {
		cartList(m, session);
		

		m.addAttribute("center", "cart/center");
		return "main";
		

	}
	@RequestMapping("/delete")
	public String delete(Model m, HttpSession session, int[] sArray) {
		try {
			for (int i = 0; i < sArray.length; i++) {
				biz.remove(sArray[i]);
			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			return "redirect:center?sArray="+cartid;
		}
		cartList(m, session);
		return "redirect:/cart";
	}
	

}








