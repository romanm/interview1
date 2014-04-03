package edu.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ComboBoxDemo2my extends JPanel implements ActionListener{
	ComboBoxDemo2my(){
		String[] patternExamples = {
				"dd MMMMM yyyy",
				"dd.MM.yy",
				"MM/dd/yy",
				"yyyy.MM.dd G 'at' hh:mm:ss z",
				"EEE, MMM d, ''yy",
				"h:mm a",
				"H:mm:ss:SSS",
				"K:mm a,z",
				"yyyy.MMMMM.dd GGG hh:mm aaa"
		};
		setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		JPanel patternPanel = new JPanel();
		patternPanel.setLayout(new BoxLayout(patternPanel, BoxLayout.PAGE_AXIS));
		JComboBox patternList = new JComboBox(patternExamples);
		patternList.addActionListener(this);
		patternPanel.add(patternList);
		add(patternPanel);
	}
	public void actionPerformed(ActionEvent e) {
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("ComboBoxDemo2");
		JComponent newContentPane = new ComboBoxDemo2();
		frame.setContentPane(newContentPane);
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
