package swing.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/***
 * frame + button + extends JFrame
 */
public class Sample3 extends JFrame {
	private int number = 0;
	
	public Sample3() {
		JFrame frame = new JFrame("Sample 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 300);
		frame.setLayout(null);
		/****
		 * /home/jron/git-ofekbytes/swing/swing/src/main/java/assets/10px-squares-blue.jpg
		 */
		JButton button = new JButton(
				new ImageIcon("src/main/java/assets/10px-squares-blue.jpg"));
		button.setBounds(10, 22, 100, 22);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number++;
				System.out.println("button pressed " + number + " times");
			}
		});
		frame.add(button);
		frame.setVisible(true);
	}
}
