package edu.swing.sample1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @see http://en.wikipedia.org/wiki/Observer_pattern
 * @see http://stackoverflow.com/a/10523401/230513
 * @see http://stackoverflow.com/questions/10523343/how-to-wire-one-jpane-to-another-jpane/10523401#10523401
 */
public class PropertyChangeDemo {

	public PropertyChangeDemo() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.add(new ObserverPanel());
		f.pack();
		f.setLocationByPlatform(true);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				PropertyChangeDemo example = new PropertyChangeDemo();
			}
		});
	}
}