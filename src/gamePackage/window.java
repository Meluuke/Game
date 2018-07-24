package gamePackage;

import javax.swing.*;
import java.awt.*;

public class window extends JFrame {
	private ImageIcon GrassTile;
	private JLabel GrassLabel;
	window(){
		setLayout(new FlowLayout());
		GrassTile = new ImageIcon(getClass().getResource("GrassTile.png"));
		GrassLabel = new JLabel(GrassTile);
		add(GrassLabel);
	}
	public static void main(String[] args) {
		window gameWindow = new window();
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameWindow.pack();
		gameWindow.setSize(1920, 1080);
		gameWindow.setVisible(true);
		gameWindow.setTitle("Game");
		gameWindow.setResizable(false);
		

	}
}
