package com.multithreading;

public class TwoThreadPrintSecunceNumber {

	static int i = 0;

	public static void main(String[] args) {

	}

	private Object lock = new Object();
	private volatile boolean isOdd = false;

	public synchronized void generateEvenNumbers(int number) throws InterruptedException {

		synchronized (lock) {
			while (isOdd == false) {
				lock.wait();
			}
			System.out.println(number);
			isOdd = false;
			lock.notifyAll();
		}
	}

	public synchronized void generateOddNumbers(int number) throws InterruptedException {

		synchronized (lock) {
			while (isOdd == true) {
				lock.wait();
			}
			System.out.println(number);
			isOdd = true;
			lock.notifyAll();
		}
	}

}
