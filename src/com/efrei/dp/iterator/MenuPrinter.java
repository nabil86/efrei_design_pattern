package com.efrei.dp.iterator;

import java.util.Arrays;

public class MenuPrinter {

	static void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println();
	}

	public static void main(String[] args) {
		final var r1 = new Restaurant1();
		final var r2 = new Restaurant_2();

		r1.getMenuItems();
		final var iterable = convertWithStreamIterator(r1.getMenuItems());
		for (final MenuItem item : iterable) {
			System.out.println(item);
		}
		// printMenu(r1.createIterator());
		// printMenu(r2.createIterator());
	}

	static Iterable<MenuItem> convertWithStreamIterator(MenuItem[] array) {
		return () -> Arrays.stream(array).iterator();
	}
}
