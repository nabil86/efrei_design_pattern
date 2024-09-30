package com.efrei.dp.strategy;

/**
 * Rubber Duck (littéralement Canard en caoutchouc) est une œuvre de Florentijn
 * Hofman, prenant la forme d'un énorme canard de bain gonflable.
 */
public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a fake duck");
		quack();
		swim();
	}
}
