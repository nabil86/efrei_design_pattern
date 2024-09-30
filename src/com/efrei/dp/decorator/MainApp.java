package com.efrei.dp.decorator;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Beverage beverage = new HouseBlend();
		final Beverage darkRoast = new DarkRoast();
		final Beverage decaf = new Decaf();
		final Beverage espresso = new Espresso();

	}

}
