package com.subham.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class predicateDemo {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		Predicate<Collection<Integer>> p = A -> (A.isEmpty());

		System.out.println(p.test(al));
	}
}
