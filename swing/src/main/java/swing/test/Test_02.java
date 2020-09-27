package swing.test;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Test_02 {
	
/***
 * 
 * class Name: Test_01
 * purpose: Login
 * description: Login Screen (user name, password hidden, login button);
 * 
 */

	// Class Veriable.
	JFrame frame;
	JPanel panel;
	JLabel lblUser;
	JTextField txtUser;
	JLabel lblPassword;
	JPasswordField JPassword;
	JButton btnLogin;
	
	
	public Test_02() {
		
		// TODO: move the creation to "Class Veriable".
		frame = new JFrame();
		panel = new JPanel();
		lblUser = new JLabel();
		txtUser = new JTextField();
		lblPassword = new JLabel();
		JPassword = new JPasswordField();
		btnLogin = new JButton();
//---------------------------------------------------//
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 200);

		frame.add(panel);
		panel.setLayout(null); //new GridLayout(0, 1)); 
		
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
		
		JPassword.setBounds(100, 50, 165, 25);
		JPassword.setBorder(BorderFactory.createLoweredBevelBorder());
		panel.add(JPassword);
		
		// // ---[button/login]---- // //
		btnLogin.setText("login");
		btnLogin.setBounds(10, 80, 80, 25);
//		btnLogin.setSize(30, 30);
		panel.add(btnLogin);
		
		
		frame.setVisible(true);		
		
		
		
	}
	
}
