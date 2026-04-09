package com.subham.java8;

public class MethodRefDemo {
    public static void main(String[] args) {

        Tred ob = new Tred();

        // Method reference (no parentheses)
        Runnable r = ob::m1;

        // Create a thread and start it
        Thread t = new Thread(r);
        t.start();

        System.out.println("I am in Main Thread");
    }
}

class Tred {
    public void m1() {
        System.out.println("I am in Child Thread");
    }
}