package com.thread;

public class MyThread extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			System.out.print("" + i);
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {

		MyThread myThread = new MyThread();
		myThread.setName("test_Thread");
		System.out.println("get name of thread ::  " + myThread.getName());
		myThread.start();
		myThread.sleep(5000);
		myThread.setName("test_Thread_two");

		Thread t = Thread.currentThread();

		System.out.println(t.getName());

//		System.out.println("get thread name :: " + myThread.getName());
		

        Thread t1 = new Thread();
 
        t1.setPriority(12);    //This statement throws IllegalArgumentException at run time
 
        t1.start();

	}
}
