package com.singleton;

public enum EnumSingletonClass {

	// by using enum only one instance will create in the jvm
	INSTANCE;
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}
