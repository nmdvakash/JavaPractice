package com.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SingletonSerializedTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializationSingleton instanceOne = SerializationSingleton.getInstance();

		ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("filename.ser"));

		objectOutput.writeObject(instanceOne);

		objectOutput.close();

		// Deserailize from file to Object

		ObjectInput objectInput = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializationSingleton instanceTwo = (SerializationSingleton) objectInput.readObject();

		System.out.println("get one ::  " + instanceOne);
		System.out.println("get two ::  " + instanceTwo);

	}
}
