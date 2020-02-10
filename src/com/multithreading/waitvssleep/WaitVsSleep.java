package com.multithreading.waitvssleep;

public class WaitVsSleep extends Thread {

    public void printSleep() {
        synchronized (this) {
            try {
                while (true) {
                    System.out.println(" Thread :: " + this.currentThread().getName());


                    sleep(1000);
                    System.out.println(" Thread :: start sleep " + this.currentThread().getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printWait() {
        synchronized (this) {
            while (true) {
                try {
                    System.out.println(" Thread :: " + this.currentThread().getName());
                    wait();
                    System.out.println(" Thread :: start Wait " + this.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {


        WaitVsSleep waitVsSleep = new WaitVsSleep();
        WaitVsSleep waitVsSleep1 = new WaitVsSleep();


//        Thread t1 = new Thread(() -> waitVsSleep.printWait());

        Thread t2 = new Thread(() -> waitVsSleep.printSleep());
        Thread t1 = new Thread(() -> waitVsSleep.printSleep());
        t1.setName("test - name");

        t2.start();
        t1.start();

    }
}
