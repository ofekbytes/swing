package swing;

import swing.test.MainTest;


public class Main {

	public Main() {
		System.out.println("Main constructor");
		new MainTest();
	}

	public static void main(String[] args) {
		System.out.println("main");
		new Main();
		
	}

}


