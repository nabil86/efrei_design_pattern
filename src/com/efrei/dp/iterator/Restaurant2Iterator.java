package com.efrei.dp.iterator;

import java.util.List;

public class Restaurant2Iterator implements Iterator<MenuItem> {

	private int currentIndex = 0;
	private final List<MenuItem> menuItems;

	public Restaurant2Iterator(List<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return menuItems != null && currentIndex < menuItems.size();
	}

	@Override
	public MenuItem next() {
		if (hasNext()) {
			return this.menuItems.get(currentIndex++);
		}
		return null;
	}

}
