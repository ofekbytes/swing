package swing.test;

import javax.swing.JButton;
import javax.swing.JFrame;

/***	
 * frame + button + extends JFrame 
 */
public class Sample1 extends JFrame {

	public Sample1() {
		JFrame frame = new JFrame("");
		frame.setTitle("sample 1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 300);
		frame.setLayout(null);

		JButton button = new JButton("click");
		button.setBounds(10, 22, 100, 22);

		frame.add(button);
		frame.setVisible(true);
	}

}
