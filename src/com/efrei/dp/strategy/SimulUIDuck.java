package com.efrei.dp.strategy;

import java.util.List;

public class SimulUIDuck {

	public static void main(String[] args) {
		final Duck mallard = new MallardDuck();
		final Duck rubberDuck = new RubberDuck();
		final Duck readheapDuck = new ReadHeapDuck();

		final List<Duck> ducks = List.of(mallard, rubberDuck, readheapDuck);

		for (final Duck duck : ducks) {
			System.out.println("----------------");
			System.out.println(duck);
			System.out.println("----------------");
		}
	}

}
