package edu.swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class JFrame2 extends JFrame{
	public JFrame2() {
		initComponents();
	}
	int klick_nr=0;
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(300, 100));
		final JLabel jLabel = new JLabel("Hello World");
		JButton jButton1 = new JButton("OK");
//		jButton1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		jButton1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Container contentPane = getContentPane();
		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);
		contentPane.add(jLabel);
		contentPane.add(jButton1);

		//Adjust constraints for the label so it's at (5,5).
		String	W = SpringLayout.WEST,
				E = SpringLayout.EAST,
				N = SpringLayout.NORTH;
		layout.putConstraint(W, jLabel, 5, W, contentPane);
		layout.putConstraint(N, jLabel, 5, N, contentPane);
		layout.putConstraint(W, jButton1, 5, E, jLabel);
		layout.putConstraint(N, jButton1, 5, N, contentPane);
		
		pack();
		Point location = jButton1.getLocation();
		System.out.println(location);
		System.out.println(jButton1.getX()+"x"+jButton1.getY()
				+" - "+jButton1.getWidth()+"x"+jButton1.getHeight());
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jLabel.getText();
				jLabel.setText(name+" "+(++klick_nr));
				System.out.println("------"+name);
			}
		});
	}
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new JFrame2().setVisible(true);
			}
		});
	}
}
