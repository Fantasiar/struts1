package com.fouter.hello;

import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

import org.junit.Test;

import com.fouter.domain.User;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class Demo01 {
	@Test
	public void fun1() throws OgnlException {
		User rootUser = new User("tom", 17);
		
		Map<String, User> context=new HashMap<String, User>();
		
		context.put("user1", new User("jack", 15));
		context.put("user2", new User("kobe", 25));
		
		OgnlContext oc=new OgnlContext();
		oc.setRoot(rootUser);
		oc.setValues(context);
		
		Ognl.getValue("name='ÍõË¼´Ï'", oc, oc.getRoot());
		String wname = (String) Ognl.getValue("name", oc, oc.getRoot());
		String name = (String) Ognl.getValue("#user1.name",oc ,oc.getRoot());
		Integer age = (Integer) Ognl.getValue("age",oc ,oc.getRoot());
		Double pi = (Double) Ognl.getValue("@@PI", oc, oc.getRoot());
		System.out.println(name+","+age);
		System.out.println(wname);
		System.out.println(pi);
	}
}
