package com.efrei.dp.strategy;

/**
 * Le Canard colvert, col-vert (Anas platyrhynchos), ou Canard malard au Canada,
 * est une espèce d'oiseaux de l'ordre des Ansériformes, de la famille des
 * Anatidés et de la sous-famille des Anatinés. C'est certainement le plus connu
 * et reconnaissable de tous les canards, du fait de l'existence de races de
 * canards domestiques issues de cette espèce.
 */

public class MallardDuck extends Duck {

	@Override
	public void display() {
		System.out.println("I'm a real mallard duck");
		quack();
		swim();
	}
}
