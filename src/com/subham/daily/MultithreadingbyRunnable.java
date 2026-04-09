package com.subham.daily;

public class MultithreadingbyRunnable {
    public static void main(String[] args) {
        myclassdemo obj = new myclassdemo();

        Thread t = new Thread(obj);
        t.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

class myclassdemo implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}