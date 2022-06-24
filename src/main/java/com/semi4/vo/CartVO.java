package com.semi4.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CartVO {
	private int cartid;
	private String uid;
	private int pid;
	private int num;
	private String title;
	private int price;
	private String writer;
	private int status;
	private String img0;
	
	public CartVO(int cartid, int num) {
		super();
		this.cartid = cartid;
		this.num = num;
	}

	public CartVO(int cartid) {
		super();
		this.cartid = cartid;
	}

	public CartVO(String uid, int pid, int num) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.num = num;
	}

	public CartVO(String uid) {
		super();
		this.uid = uid;
	}

	public CartVO(String uid, int pid) {
		super();
		this.uid = uid;
		this.pid = pid;
	}
	
	
	
}
