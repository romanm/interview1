package edu.swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class TicTacToe {
	public static final boolean PLAYER_X = false;
	public static final boolean PLAYER_O = true;

	public static int counter;

	private JFrame frame;
	private JLabel label;
	private JPanel panel;
	private JButton[] buttons;
	private boolean player;

	public TicTacToe() {
		frame = new JFrame("TicTacToe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(500, 500));
		panel.setLayout(new GridLayout(3, 3, 10, 10));
		frame.add(BorderLayout.CENTER, panel);

		label = new JLabel("TIC TAC TOE");
		frame.add(BorderLayout.NORTH, label);

		/* Set the initial player turn to player X */
		player = PLAYER_X;

		/* Create the JButtons  */
		buttons = new JButton[9];

		/* Loop through and set all of them up */
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (e.getSource() instanceof JButton) {
						((JButton)e.getSource()).setText(player ? "O" : "X"); /* Set button text */
						player = !player; /* Switch turns */
					}
				}
			});

			/* Add all of the buttons to the panel. */
			panel.add(buttons[i]);
		}

		/* Pack the frame to the contents. Basically a "fit to contents". */
		frame.pack();
	}

	public void go() {
		frame.setVisible(true);
		panel.setVisible(true);
	}

	public static void main(String[] args) {
		TicTacToe gui = new TicTacToe();
		gui.go();
	}
}