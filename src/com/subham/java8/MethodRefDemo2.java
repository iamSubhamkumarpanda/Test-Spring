package com.subham.java8;

import java.util.ArrayList;

public class MethodRefDemo2 {
	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.forEach(System.out::println);
	}
}
