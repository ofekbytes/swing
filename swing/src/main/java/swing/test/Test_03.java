package swing.test;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test_03 implements ActionListener {

	/***
	 * 
	 * class Name: Test_3 
	 * "Conversion Temperature"
	 * purpose: convert C / F / K 
	 * 
	 * 
	 */

	// Class Veriable.
	private JFrame frame;
	private JPanel panel;
	private JLabel lblUser;
	private JTextField txtUser;
	private JLabel lblPassword;
	private JPasswordField txtPassword;
	private JButton btnLogin;
	private JLabel lblStatus;

	private String stUser = "";
	private String stPassWord = "";
	private String stLeftSpace = "  ";

	public Test_03() {

		frame = new JFrame();
		panel = new JPanel();
		lblUser = new JLabel();
		txtUser = new JTextField();
		lblPassword = new JLabel();
		txtPassword = new JPasswordField();
		btnLogin = new JButton();
		lblStatus = new JLabel();

//---------------------------------------------------//

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(285, 210);

		frame.add(panel);
		panel.setLayout(null); // new GridLayout(0, 1));

		// // ---[label/user]---- // //
		lblUser.setText("user");
		lblUser.setBounds(10, 20, 80, 25);
//		lblUser.setBorder(BorderFactory.createLineBorder(Color.red));
//		lblUser.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(lblUser);

		txtUser.setBounds(100, 20, 165, 25);
		txtUser.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(txtUser);

		// // ---[label/password]---- // //
		lblPassword.setText("password");
		lblPassword.setBounds(10, 50, 80, 25);
//		lblPassword.setBorder(BorderFactory.createLoweredBevelBorder());
//		lblPassword.setBorder(BorderFactory.createLineBorder(Color.red));
		panel.add(lblPassword);

		txtPassword.setBounds(100, 50, 165, 25);
		txtPassword.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(txtPassword);

		// // ---[button/login]---- // //
		btnLogin.setText("login");
		btnLogin.setBounds(40, 90, 80, 25);
//		btnLogin.setSize(30, 30);
		panel.add(btnLogin);

		btnLogin.addActionListener(this);

		// // ---[label/status]---- // //
		lblStatus.setText("");
		lblStatus.setBounds(2, 136, 280, 35);
		lblStatus.setBorder(BorderFactory.createLoweredBevelBorder());
//		lblStatus.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
		panel.add(lblStatus);
		
		/***
		 *  TODO
		 *  center the "lblStatus" text
		 */
		
		frame.setTitle("Test_03");
		frame.setVisible(true);

	}

	// addActionListener --> call --> actionPerformed (current method).
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("User entered a ");
		stUser = txtUser.getText();
		stPassWord = String.valueOf(txtPassword.getPassword());
		System.out.println("user: " + stUser);
		System.out.println("password: " + stPassWord);
		
		if ( (stUser.equals("jron")) && stPassWord.equals("jron" ) ) {
			lblStatus.setText("user and password are currect" + txtUser.getText());
		}
		else
		{
			lblStatus.setText("  Naaa...." + stUser + " " + stPassWord + " is wrong");
		}
		
		/// System.out.println("password: " + txtPassword.getText()); /// 
	}

}
