package com.subham.java8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> Names = new ArrayList<String>();
		Names.add("Rakesh");
		Names.add("Subham");
		Names.add("Nikhil");
		Names.add("Rajin");
		Names.add("Anutam");
		Names.add("Itturaj");
		Names.add("Sujit");

		ArrayList<String> updatedValue = Names.stream().sorted().map(String::toUpperCase).distinct()
				.collect(Collectors.toCollection(ArrayList::new));
	}

}
