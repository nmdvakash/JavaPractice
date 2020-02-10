package com.linkedlist;

public class SinglyLinkedList {

	public final static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.pringList();
		System.out.println();
		list.remove(5);
		list.pringList();

		System.out.println(list.getCountRec());
		System.out.println(list.search(7));
	}

	private Node head;

	public boolean search(int value) {
		return search(head, value);
	}

	public boolean search(Node head, int x) {

		if (head == null) {
			return false;
		}
		if (head.value == x)
			return true;

		return search(head.next, x);
	}

	public void add(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void remove(int value) {

		Node prev = null, temp = head;

		if (temp != null && temp.value == value) {
			head = temp.next;
			return;
		}

		while (temp != null && temp.value != value) {
			prev = temp;
			temp = temp.next;
		}

		if (temp == null)
			return;
		prev.next = temp.next;
	}

	public int getCount() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public int getCountRec() {
		return getCountRec(head);
	}

	public int getCountRec(Node temp) {
		if (temp == null) {

			return 0;
		}
		return 1 + getCountRec(temp.next);
	}

	public void pringList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println("get value  ::  " + tnode.value);
			tnode = tnode.next;
		}
	}

	public

	class Node {
		private int value;

		private Node next;

		public Node(int value) {
			this.value = value;
			this.next = null;
		}

		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
}
