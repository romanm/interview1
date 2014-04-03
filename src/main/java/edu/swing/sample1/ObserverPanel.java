package edu.swing.sample1;

import java.awt.GridLayout;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

class ObserverPanel extends JPanel {

	private JLabel title = new JLabel("Value received: ");
	private JLabel label = new JLabel("null", JLabel.CENTER);

	public ObserverPanel() {
		this.setBorder(BorderFactory.createTitledBorder("ObserverPanel"));
		JPanel panel = new JPanel(new GridLayout(0, 1));
		panel.add(title);
		panel.add(label);
		this.add(panel);
		ObservedPanel observed = new ObservedPanel();
		observed.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) {
				if (e.getPropertyName().equals(ObservedPanel.PHYSICIST)) {
					String value = e.getNewValue().toString();
					label.setText(value);
				}
			}
		});
		this.add(observed);
	}
}
