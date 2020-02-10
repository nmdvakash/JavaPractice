package com.inheritance;
//

import com.interfaces.InterfaceMainClass;

//public class PostIncrement {
//
//	public static void main(String[] args) {
////		Y y = new Y();
////
////		Y1 y1 = new Y1();
//		
//		System.out.println(i);
//
//		System.out.println(j);
//	}
//}

class X {
	int m = 1111;

	{
		m = m++;

		System.out.println(m);
	}
}

class Y extends X {
	{
		System.out.println(methodOfY());
	}

	int methodOfY() {
		return m-- + --m;
	}
}

// Program 2

class X1 {
	int i = 101010;

	public X1() {
		i = i++ + i-- - i;
		System.out.println("get I value ::  " + i);
	}

	static int staticMethod(int i) {
		return --i;
	}
}

class Y1 extends X1 {
	public Y1() {
		System.out.println(staticMethod(i));
	}
}

class ClassOne {
	static int i, j = 191919;
	{
		--i;
		System.out.println("i 1 :: " + i);
	}

	{
		j++;
		System.out.println("j 1 :: " + j);
	}
}

public class PostIncrement extends ClassOne {
	static {
		i++;
		System.out.println("i 2 :: " + i);
	}

	static {
		--j;
		System.out.println("j 2 :: " + j);
	}

	public static void main(String[] args) {
		System.out.println("i :: " + i);
		System.out.println("j :: " + j);
		
//		InterfaceMainClass.value = 30L;
	}
}