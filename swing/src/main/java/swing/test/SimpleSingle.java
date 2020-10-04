package swing.test;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleSingle {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Simple Single");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 100);
		frame.setLayout(null);

		JButton button = new JButton("click");
		button.setBounds(10, 22, 100, 22);

		frame.add(button);
		frame.setVisible(true);
	}

}
