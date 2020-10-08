package swing.test;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/***	
 * frame + button + extends JFrame 
 */
public class Sample3 extends JFrame {

	public Sample3() {
		JFrame frame = new JFrame("Sample 3");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(340, 300);
		frame.setLayout(null);

		
		/****
		 *  /home/jron/git-ofekbytes/swing/swing/src/main/java/assets/10px-squares-blue.jpg
		 */
		JButton button = new JButton(new ImageIcon("/home/jron/git-ofekbytes/swing/swing/src/main/java/assets/10px-squares-blue.jpg"));
		
		button.setBounds(10, 22, 100, 22);
		frame.add(button);
		
		
		frame.setVisible(true);
	}

}
