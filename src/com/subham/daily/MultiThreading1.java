package com.subham.daily;

public class MultiThreading1 {

	public static void main(String args[]) {

		Myclass cl = new Myclass();
		cl.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "i am in main thread.");
		}
	}
}

class Myclass extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i + "i am in Child thread.");
		}
	}

}
