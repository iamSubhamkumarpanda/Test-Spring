package com.subham.java8;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] demo) {
		// System.err.println("Ok");

		Consumer<Integer> value = A -> System.out.println(A * A);
		value.accept(2);
	}

}
