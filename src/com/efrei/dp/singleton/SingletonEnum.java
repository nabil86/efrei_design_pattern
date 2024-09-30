package com.efrei.dp.singleton;

public enum SingletonEnum {
	INSTANCE;

	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public void display() {
		System.out.println("Hello from SingletonEnum ");
		System.out.println("Value: " + value);
	}
}
