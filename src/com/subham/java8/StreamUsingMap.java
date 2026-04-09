package com.subham.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> number = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

		ArrayList<Integer> Result = (ArrayList<Integer>) number.stream().map(A -> A * A).collect(Collectors.toList());

		System.out.println(Result);
	}

}
