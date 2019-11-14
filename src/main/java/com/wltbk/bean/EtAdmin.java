package com.wltbk.bean;

import java.io.Serializable;

public class EtAdmin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//银行卡账号
	private String name;
	//银行卡密码
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EtAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EtAdmin(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "EtAdmin [name=" + name + ", password=" + password + "]";
	}
	
}
