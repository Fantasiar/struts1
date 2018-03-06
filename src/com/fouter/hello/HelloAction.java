package com.fouter.hello;

import org.omg.CORBA.UnknownUserException;

import com.fouter.domain.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.regexp.internal.recompile;

public class HelloAction extends ActionSupport implements ModelDriven<User> {
	private User user=new User();
	
	public String hello() {
		System.out.println(user);
		
		return "success";
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
}
