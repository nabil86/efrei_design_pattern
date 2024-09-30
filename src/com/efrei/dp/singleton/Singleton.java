package com.efrei.dp.singleton;

public class Singleton {

	private static volatile Singleton INSTANCE;
	private final String value;

	private Singleton(String value) {
		// Private constructor to restrict instantiation from other classes
		this.value = value;
		addDelay();
	}

	public static Singleton getInstance(String value) {

		if (INSTANCE == null) {
			synchronized (Singleton.class) {
				if (INSTANCE == null) {
					INSTANCE = new Singleton(value);
				}
			}
		}
		return INSTANCE;
	}

	public void display() {
		System.out.println("value is " + value);

	}

	private void addDelay() {
		try {
			Thread.sleep(1000);
		} catch (final InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
