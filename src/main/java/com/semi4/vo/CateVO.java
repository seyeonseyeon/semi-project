package com.semi4.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CateVO {
	private int cid;
	private String name;
	private int cateid;
	
	public CateVO(int cid, String name) {
		this.cid = cid;
		this.name = name;
	}

	

	
	
}
