package com.practice.overridding;

import java.util.HashMap;
import java.util.Map;

class Customer {

	int id;

	String name;

	public Customer(int id, String name) {

		this.id = id;

		this.name = name;

	}

	public Customer(Customer c) {

		this.id = c.id;
		this.name = c.name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class MapTest {

	public static void main(String args[]) {

		String desg1 = "A";

		String desg2 = "B";

		Customer c1 = new Customer(1, "tom");

		Customer c2 = new Customer(1, "tom");

		Customer c3 = new Customer(1, "tom");

		Map<Customer, String> custMap = new HashMap<>();

		System.out.println(c1 == c2);

		custMap.put(c1, "Manager");

		custMap.put(c2, "Developer");

		custMap.put(c3, "tom");

		desg1 = custMap.get(c3);

		System.out.println("Size of map :: " + custMap.size());

	}
}