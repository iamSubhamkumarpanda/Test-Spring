package com.subham.java8;

import java.util.function.Function;

public class Function_Demo {
    public static void main(String[] args) {

        Function<Integer, String> getName = roll -> {
            if (roll == 1) return "Subham";
            else if (roll == 2) return "Rahul";
            else if (roll == 3) return "Ankit";
            else return "Unknown";
        };

        System.out.println(getName.apply(1)); // Subham
        System.out.println(getName.apply(4)); // Unknown
    }
}