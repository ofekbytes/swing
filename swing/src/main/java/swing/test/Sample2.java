package swing.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/***
 * frame + button + extends JFrame + ActionListener
 */
public class Sample2 extends JFrame {

	public Sample2() {
		JFrame frame = new JFrame("Sample 2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 300);
		frame.setLayout(null);

		final JLabel message = new JLabel();
		message.setBounds(10, 42, 180, 22);
		message.setBackground(Color.gray);
		message.setText("Button Not Pressed");
		message.setBackground(Color.GREEN);
		frame.add(message);

		JButton button = new JButton("click");
		button.setBounds(10, 11, 100, 22);
		frame.add(button);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				String msg = "Button Ptessed";
				message.setText(msg);
			}
		});

		frame.setVisible(true);
	}
}
