package swing.test;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Sample11 extends JFrame {

	/*
	 * sample11() - frame + button + extends JFrame
	 */
	public Sample11() {
		JButton button = new JButton("click");
		button.setBounds(10, 10, 66, 22);
		this.add(button);

		this.setSize(200, 150);
		this.setLayout(null);
		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
