package com.efrei.dp.iterator;

public final class MenuItem {
	private final String name;
	private final String description;
	private final String price;
	private final boolean vegetarian;

	public MenuItem(String name, String description, String price, boolean vegetarian) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getPrice() {
		return price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", price=" + price + ", vegetarian="
				+ vegetarian + "]";
	}
}
