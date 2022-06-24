package com.semi4.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.semi4.biz.CartBiz;
import com.semi4.biz.OrderBiz;
import com.semi4.vo.CartVO;
import com.semi4.vo.CustVO;
import com.semi4.vo.OrderVO;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	CartBiz cartbiz;
	
	@Autowired
	OrderBiz orderbiz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv, HttpSession session) {
		
		CustVO cust = (CustVO) session.getAttribute("logincust");
		List<OrderVO> list = new ArrayList<OrderVO>();
		if( cust.getUid() != null ) {
			try {
					
					list = orderbiz.selectuser(new OrderVO(cust.getUid())   );
					System.out.println(list.get(0).getDprice());
					System.out.println("465484645454aseadf" + list.get(0).getTitle());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

		mv.addObject("orderlist", list);
		mv.addObject("center", "order/center" );
		mv.setViewName("main");
		return mv;
	}
	

	@RequestMapping("/add")
	public ModelAndView add(ModelAndView mv, HttpSession session, int[] sArray) {
		CustVO cust = null;
		cust = (CustVO) session.getAttribute("logincust");
		
		List<CartVO> list = new ArrayList<CartVO>();
		int allprice = 0;
		try {
			for (int i = 0; i < sArray.length; i++) {
				
				list.add( cartbiz.get(sArray[i]) );		
				allprice += list.get(i).getPrice() * list.get(i).getNum();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.addObject("allprice", allprice );
		mv.addObject("cartlist", list );
		mv.addObject("cust", cust );
		mv.addObject("center", "order/add" );
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/addimpl")
	public ModelAndView addimpl(ModelAndView mv,HttpSession session, String oname, String oaddr, String ophon, int[] cartid, int[] pid, int[] dnum, int[] dprice) {

		CustVO cust = (CustVO) session.getAttribute("logincust");
		List<OrderVO> list = null;
		if( cust.getUid() != null ) {
			OrderVO orders = new OrderVO(cust.getUid(), oname, oaddr, ophon);
			try {
					orderbiz.orderregister(orders);
					
					
					for (int i = 0; i < pid.length; i++) {
						OrderVO orderdetail = new OrderVO( orders.getOid(), pid[i], dnum[i], dprice[i] );
						orderbiz.orderdetailregister(orderdetail);
						cartbiz.remove(cartid[i]);
					}
					
					
					list = orderbiz.selecdetail(new OrderVO(orders.getOid(), cust.getUid()));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
		mv.addObject("orderlist", list);
		mv.setViewName("main");
		mv.addObject("center", "order/center" );
		return mv;
	}
}








