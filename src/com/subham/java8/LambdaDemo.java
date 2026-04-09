package com.subham.java8;

import java.util.ArrayList;

public class LambdaDemo {

    public static void main(String[] args) {
        System.out.println("i am in Main");

        ArrayList<Integer> number = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            number.add(i);
        }

        System.out.println("Adding to The ArrayList is Done.");

        demointer obj = (A) -> {
            if (A % 2 == 0) {
                System.out.println(A);
            }
        };

        for (Integer n : number) {
            obj.desply(n);
        }
    }
}

interface demointer {
    void desply(Integer a);
}