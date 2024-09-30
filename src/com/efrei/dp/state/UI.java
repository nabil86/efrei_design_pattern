package com.efrei.dp.state;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UI {

	private final Player player;
	private static JTextField textField = new JTextField();

	public UI(Player player) {
		this.player = player;
	}

	public void init() {
		final var frame = new JFrame("Test player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final var context = new JPanel();
		context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
		frame.getContentPane().add(context);
		final var buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
		context.add(textField);
		context.add(buttons);

		final var play = new JButton("Play");

		final var stop = new JButton("Stop");

		final var next = new JButton("Next");

		final var prev = new JButton("Prev");

		frame.setVisible(true);
		frame.setSize(300, 100);
		buttons.add(play);
		buttons.add(stop);
		buttons.add(next);
		buttons.add(prev);
	}
}
