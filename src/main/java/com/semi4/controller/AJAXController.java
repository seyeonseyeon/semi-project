package com.semi4.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.semi4.biz.CartBiz;
import com.semi4.biz.CustBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;

@RestController
public class AJAXController {

	@Autowired
	CustBiz custbiz;

	@Autowired
	CartBiz cartbiz;

	
	@RequestMapping("checkid")
	public String checkid(String id) {
		String result = "";
		CustVO cust = null;
		
		if(id.equals("") || id == null) {
			return "1";
		}
		try {
			cust = custbiz.get(id);
			if(cust == null) {
				result = "0";
			}else {
				result = "1";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
	
	@RequestMapping("mainAddCart")
	   public String mainAddCart(String id, HttpSession session) {
	      String result = "";
	      
	      if( session.getAttribute("logincust") != null ) {
	         CustVO cust;
	         cust = (CustVO) session.getAttribute("logincust");
	         
	         CartVO c = new CartVO(cust.getUid(), Integer.parseInt(id), 1);
	         CartVO cp = new CartVO(cust.getUid(), Integer.parseInt(id));
	         try {
	        	 CartVO ucp = cartbiz.getcp(cp);
	        	 if (ucp == null) {
	        		 cartbiz.register(c);
				} else {
					c.setUid(ucp.getUid());
					c.setPid(ucp.getPid());
					c.setNum(ucp.getNum()+1);
					cartbiz.modifyucp(c);
				}
	         } catch (Exception e) {
	            e.printStackTrace();
	         }
	         result = "1";
	         
	      } else {
	         result = "0";
	      }
	      return result;
	   }
	
		
	@RequestMapping("cartNum")
	public String cartNum(Model m, HttpSession session,  int cartid, int num) {
		String result = "";
		CartVO cv = null;
		CartVO cart = new CartVO(cartid, num);
		try {
			cartbiz.modify(cart);
			cv = cartbiz.get(cartid);
			result = Integer.toString(cv.getPrice());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	

}

