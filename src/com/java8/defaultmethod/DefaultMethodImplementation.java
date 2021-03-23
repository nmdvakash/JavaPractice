package com.java8.defaultmethod;


 class Parent{
	 public void m() {
		 System.out.println("M Parene");
	 }
 }
 
 class Child extends Parent{
	 public void m() {
		 System.out.println("M Child");
	 } 
	 
 }


public class DefaultMethodImplementation extends Child implements DefaultMethod {

    @Override
    public void print() {
    }

     public void m() {
    	 super.m();
     }
    public static void main(String[] args) {
    	DefaultMethodImplementation defaultMethodImplementation = new DefaultMethodImplementation();
        DefaultMethod defaultMethod = () -> System.out.println("call print ");
        defaultMethod.test();
        defaultMethod.print();
        defaultMethodImplementation.m();
    }

}
