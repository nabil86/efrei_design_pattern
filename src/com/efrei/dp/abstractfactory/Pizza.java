package com.efrei.dp.abstractfactory;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;

	void prepare() {
		System.out.println("Preparing " + name);
	}

	void bake() {
		System.out.println("Baking " + name);
	}

	void cut() {
		System.out.println("Cutting " + name);
	}

	void box() {
		System.out.println("Boxing " + name);
	}

	public String getName() {
		return name;
	}
}
