package com.practice.overridding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class pa {
	String name;

	public pa() {
	}

	public pa(String nm) {
		this.name = nm;
	}
}

class Child extends pa implements Serializable {
	String name2;

	public Child() {
	}

	public Child(String nm1, String nm2) {
		super(nm1);
		this.name2 = nm2;
	}
}

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child("A", "B");
		try {

			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File("F:\\serialize.ser")));
			os.writeObject(child);
			ObjectInputStream is = new ObjectInputStream(new FileInputStream(new File("F:\\serialize.ser")));
			Child childRead = (Child) is.readObject();

			System.out.println("Child name1 : " + childRead.name);
			System.out.println("Child name2 : " + childRead.name2);
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}