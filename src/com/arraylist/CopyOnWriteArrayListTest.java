package com.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTest implements Runnable {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		System.out.println(LocalDate.now());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {

			String value = itr.next();
			if (value.equals("b")) {
				itr.remove();
			}
		}

		System.err.println("get value  ::  " + list);

//		Runnable thread1 = () -> {
//			while (true)
//				CopyOnWriteArrayListTest.getPrintSting();
//		};
//		thread1.run();
//		new Thread(new CopyOnWriteArrayListTest()).start();
	}

	public static synchronized void getPrintSting() {
		System.out.println("get pringted");
	}

	public synchronized void getPrint() {
		System.out.println("get funtion name");
	}

	@Override
	public void run() {
		while (true)
			getPrint();
	}

}
