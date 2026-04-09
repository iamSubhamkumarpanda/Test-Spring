package com.subham.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subham.Server.Wishmessage;

public class ClintClass {
	 public static void main(String[] args) {

	        ClassPathXmlApplicationContext ctx =
	            new ClassPathXmlApplicationContext("com/subham/cfg2/New2.xml");

	        // get the Wishmessage bean, NOT the LocalDateTime bean
	        Wishmessage wm = ctx.getBean("wishmessage", Wishmessage.class);

	        System.out.println(wm.Generater("Subham"));
	        ctx.close();
	    }
}
