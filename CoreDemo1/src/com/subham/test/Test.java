package com.subham.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subham.sbeans.WishMessageGenerator;

public class Test {
	public static void main(String[] args) {
		 ClassPathXmlApplicationContext ctx =
		            new ClassPathXmlApplicationContext("com/subham/cfgf/NewFile.xml");
		        WishMessageGenerator generator =
		            ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		        System.out.println(generator.generateWishMessage("Subham"));
		        ctx.close();
	}
}
