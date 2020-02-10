package com.arrays;





public class TestImpl {

	public Node rotateList(Node head, int n) {
		if (head == null) {
			return head;
		}
		int len = 0;
		Node temp = head;
		while (temp != null) {
			len++;
			temp = temp.getNext();
		}
		if(len < n) {
			return head;
		}
		temp = head;
		while (n != 1) {
			temp = temp.getNext();
			n--;
		}
		Node newNode = temp.getNext();
		temp.setNext(null);
		temp = newNode;
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(head);
		return newNode;
	}

}

class Node {

	private String name;
	private Node next;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
