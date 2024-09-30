package com.efrei.dp.iterator;

public class Restaurant1Iterator implements Iterator<MenuItem> {

	private int currentIndex = 0;
	private final MenuItem[] menuItems;

	public Restaurant1Iterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < menuItems.length;
	}

	@Override
	public MenuItem next() {
		if (hasNext()) {
			return this.menuItems[currentIndex++];
		}
		return null;
	}

}
