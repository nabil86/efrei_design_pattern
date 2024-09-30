package com.efrei.dp.strategy;

public class Duck {
	public void quack() {
		System.out.println("Quack");
	}

	public void swim() {
		System.out.println("I'm swimming");
	}

	public void display() {
		System.out.println(this.getClass().getSimpleName());
		quack();
		swim();

	}

}
