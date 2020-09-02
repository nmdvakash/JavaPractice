package com.thread;

/*Thread interference in java is a condition which occurs when more than one threads,
 * executing simultaneously,access same piece of data.When more than one threads have access
 *  to same data,it is possible that data may get corrupted or one may not get the desired output.
 *  Thread interference occurs when code written is not thread safe.*/
public class ThreadInterference {

    public static void main(String[] args) {
        final Shared s1 = new Shared();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                s1.SharedMethod();
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                s1.SharedMethod();
            }
        };

        t1.start();

        t2.start();
    }
}

class Shared {
    int i;

    void SharedMethod() {
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }
}