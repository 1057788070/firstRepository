package com.acction;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	public String execute(){
		System.out.println("调用成功");
		return "success";
	}
	
	public String login(){
		
		return "success";
	}
	
	public String second(){
		
		
		return "2";
	}

}
