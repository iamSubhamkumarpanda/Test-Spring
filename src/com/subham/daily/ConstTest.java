package com.subham.daily;

public class ConstTest {
	int phnum;
	String name;

	ConstTest() {
		this.phnum = 123;
		this.name = "subham";
	}

	public static void main(String[] args) {
		System.out.println("i am in the main method.");
		System.out.println("");
		try {
			ConstTest obj = new ConstTest();
	        obj.m1(obj.phnum, obj.name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void m1(int num1, String name1) {
		System.out.println("The name is :" + name1);
		System.out.println("The number is :" + num1);
	}

}
