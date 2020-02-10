package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class JSetTest {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(null);// Null alow in HashSet

		/**
		 * 1 -> LinkedHashSet internally uses LinkedHashMap to store it’s elements just
		 * like HashSet which internally uses HashMap to store it’s elements.
		 * 
		 * 2 -> LinkedHashSet maintains insertion order. This is the main difference
		 * between LinkedHashSet and HashSet.
		 * 
		 * 3 -> LinkedhashSet also gives constant time performance for insertion,
		 * removal and retrieval operations. The performance of LinkedHashSet is
		 * slightly less than the Hashset as it has to maintain doubly linked list
		 * internally to order it’s elements.
		 * 
		 * 4 -> Iterator returned by LinkedHashSet is fail-fast. i.e if the
		 * LinkedHashSet is modified at any time after the Iterator is created, it
		 * throws ConcurrentModificationException.
		 * 
		 * 5 -> LinkedHashSet doesn’t allow duplicate elements and allows only one null
		 * element.
		 */
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
//		linkedHashSet.add(null);// Null alow in HashSet
		linkedHashSet.add(20);
		linkedHashSet.add(10);
		linkedHashSet.add(40);
		linkedHashSet.add(80);
		linkedHashSet.add(30);

		System.out.println(" LINKED HASH SET --- :: " + linkedHashSet); // output -> LINKED HASH SET --- :: [20, 10, 40,
																		// 80, 30]

		Iterator<Integer> linkedHashSetIt = linkedHashSet.iterator();
		// Modifying the LinkedHashSet after the Iterator is created
//		linkedHashSet.add(3);
		while (linkedHashSetIt.hasNext()) {
			// This statement will throw ConcurrentModificationException
			System.out.println(linkedHashSetIt.next());
		}

		linkedHashSet.add(30); // not gives any error
		System.out.println("  -- :: " + linkedHashSet);

		/*--------------- TreeSeet -------------------*/
		/**
		 * 1 -> TreeSet gives performance of order log(n) for insertion, removal and
		 * retrieval operations.
		 * 
		 * 2 -> Iterator returned by TreeSet is of fail-fast nature. That means, If
		 * TreeSet is modified after the creation of Iterator object, you will get
		 * ConcurrentModificationException.
		 * 
		 * 3 -> TreeSet internally uses TreeMap to store it’s elements just like HashSet
		 * and LinkedHashSet which use HashMap and LinkedHashMap respectively to store
		 * their elements.
		 * 
		 * 4 -> TreeSet does not allow even a single null element.
		 * 
		 * 5 -> Elements inserted in the TreeSet must be of Comparable type and elements
		 * must be mutually comparable. If the elements are not mutually comparable, you
		 * will get ClassCastException at run time.
		 */
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
//		treeSet.add(null);  //It will throw NullPointerException, not allow null in treeSet

		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(80);
		treeSet.add(30);

		System.out.println(" ----- :: " + treeSet);// O/p -> ----- :: [10, 20, 30, 40, 80]
		// Notice that elements are placed in the sorted order.

		Iterator<Integer> it = treeSet.iterator();

		// Modifying the TreeSet after getting Iterator object
		// treeSet.add(3);
		while (it.hasNext()) {
			// This statement will throw ConcurrentModificationException
			System.out.println(it.next());
		}

		/**
		 * Elements inserted in the TreeSet must be of Comparable type and elements must
		 * be mutually comparable. If the elements are not mutually comparable, you will
		 * get ClassCastException at run time.
		 */
		TreeSet<Object> set = new TreeSet<Object>();
		// Adding elements to TreeSet
		set.add("kkk"); // inserting String type element
		set.add(10); // inserting Integer type element
		set.add(new Object()); // inserting Object type element
		set.add(20.65);

	}

}
