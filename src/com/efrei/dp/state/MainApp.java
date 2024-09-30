package com.efrei.dp.state;

public class MainApp {

	public static void main(String[] args) {
		final var player = new Player();
		final var ui = new UI(player);
		ui.init();
	}
}
