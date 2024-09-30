package com.efrei.dp.iterator;

import java.util.Arrays;

public class Restaurant1 implements Menu {

	private MenuItem[] menuItems;

	public Restaurant1() {
		menuItems = new MenuItem[0];
		addMenuItem(new MenuItem("Burger", "A hotdog with lettuce, tomato, and onion.", "5.99", false));
		addMenuItem(new MenuItem("Pizza", "A large pizza topped with tomatoes, mozzarella, and basil.", "10.99", true));
		addMenuItem(new MenuItem("French Fries", "Assortment of crispy fries.", "3.49", true));
		addMenuItem(new MenuItem("Coke", "A small soda.", "1.99", true));
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public void addMenuItem(MenuItem menuItem) {
		final var length = menuItems == null ? 0 : menuItems.length;
		menuItems = Arrays.copyOf(menuItems, length + 1);
		menuItems[length] = menuItem;
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return new Restaurant1Iterator(menuItems);
	}
}
