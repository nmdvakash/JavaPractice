package com.exception;

public class ExceptionCheck {

    public static void show() {
        System.out.println("show");
        throw new RuntimeException();
    }

    public void print() {
        try {
            System.out.println("try");
            show();
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        System.out.println("end");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
        super.finalize();
    }

    public static void main(String[] args) {
        ExceptionCheck exceptionCheck = new ExceptionCheck();
        exceptionCheck.print();
//        exceptionCheck = null;
        System.gc();

    }
}
