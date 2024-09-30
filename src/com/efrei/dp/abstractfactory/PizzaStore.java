package com.efrei.dp.abstractfactory;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;

		if (type.equalsIgnoreCase("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equalsIgnoreCase("greek")) {
			pizza = new GreekPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
