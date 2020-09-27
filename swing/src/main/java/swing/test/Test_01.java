package swing.test;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/***
 * 
 * class Name: Test_01
 * purpose: counter
 * description: raises the current number value by one at a touch of a button.
 * 
 */

public class Test_01 implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	private JLabel label;
	private int count = 0;

	public Test_01() {
		frame = new JFrame();

		panel = new JPanel();

		button = new JButton("click me");
		button.addActionListener(this);

		label = new JLabel("number of clicks: 0      ");

		// jpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		// jpanel.setBorder(BorderFactory.createEmptyBorder());

		// border
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 60, 90));

		// layout manger
		panel.setLayout(new GridLayout(0, 1));

		// button add
		panel.add(button);
		panel.add(label);

		// frame <--- panel
		frame.add(panel, BorderLayout.CENTER);

		// close action
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // frame.EXIT_ON_CLOSE

		// title
		frame.setTitle("Test_01");

		// set the window to a match a preferred size.
		frame.pack();

		// visible + focus
		frame.setVisible(true);
	}

	// // ActionListener // //
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("number of clicks: " + count + " ");
	}
}
