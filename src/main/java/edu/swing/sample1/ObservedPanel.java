package edu.swing.sample1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class ObservedPanel extends JPanel {

	public static final String PHYSICIST = "Physicist";
	private static final String[] items = new String[]{
		"Alpher", "Bethe", "Gamow", "Dirac", "Einstein"
	};
	private JComboBox combo = new JComboBox(items);
	private String oldValue;

	public ObservedPanel() {
		this.setBorder(BorderFactory.createTitledBorder("ObservedPanel"));
		combo.addActionListener(new ComboBoxListener());
		this.add(combo);
	}

	//if your property be changed
	private class ComboBoxListener implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String newValue = (String) combo.getSelectedItem();
			firePropertyChange(PHYSICIST, oldValue, newValue);
			oldValue = newValue;
		}
	}
}