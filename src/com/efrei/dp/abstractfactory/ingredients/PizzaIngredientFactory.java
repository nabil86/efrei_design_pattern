package com.efrei.dp.abstractfactory.ingredients;

import com.efrei.dp.abstractfactory.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();

	Sauce createSauce();

	Cheese createCheese();

	Veggies[] createVeggies();

	Pepperoni createPepperoni();

	Clams createClams();
}
