package com.multithreading;

public class ThreadExecution {

    public static void main(String[] args) {

        ThreadExecution t = new ThreadExecution();
        Thread t1 = new Thread(() -> t.call(10000));
        Thread t2 = new Thread(() -> t.call(5000));

        t1.start();
        t2.start();

    }

    public void call(Integer value) {
//		synchronized (this) {
        while (true) {
            System.out.println("------ " + Thread.currentThread().getName());
            try {
                Thread.currentThread().wait(value);
            } catch (InterruptedException e) {
                System.out.println();
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
//			}

        }

    }

}
