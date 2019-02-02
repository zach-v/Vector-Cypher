package main;

import javax.swing.JFrame;

import main.tools.CP;

public class CipherLauncher {

	public static void main(String[] args) {
		CipherWindow win = new CipherWindow();
		CP.println("Loading program...");
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// sets the close operation to exit
		win.setSize(1200, 600);									// Sets size to Width 1,200 by Height 600
		win.setVisible(true);									// Sets the window visible
	}
}
