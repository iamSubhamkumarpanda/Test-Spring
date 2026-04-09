package com.subham.Collecctions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arraylistDemo {

	public static void main(String[] args) {
		System.out.println("I am in the ArrayList Class..");

		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(12);
		num.add(13);
		num.add(14);
		num.add(15);
		System.out.println(num);

		num.set(2, 16);
		System.out.println(num);
		System.out.println(num.get(3));
		System.out.println(num.getFirst());
		List<String> cars = new LinkedList<>();
		System.out.println(num.equals(0) || num.equals(0));
		System.out.println("This value is ="+num+ " k"+2);
	}
}
