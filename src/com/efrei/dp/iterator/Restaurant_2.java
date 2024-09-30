package com.efrei.dp.iterator;

import java.util.ArrayList;
import java.util.List;

public class Restaurant_2 implements Menu {
	private final List<MenuItem> menuItems;

	public Restaurant_2() {
		menuItems = new ArrayList<>();
		addMenuItem(new MenuItem("Burger", "A hotdog with lettuce, tomato, and onion.", "5.99", true));
		addMenuItem(
				new MenuItem("Pizza", "A large pizza topped with tomatoes, mozzarella, and basil.", "10.99", false));
		addMenuItem(new MenuItem("French Fries", "Assortment of crispy fries.", "3.49", true));
	}

	public void addMenuItem(MenuItem menuItem) {
		menuItems.add(menuItem);
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new Restaurant2Iterator(menuItems);
	}

}
