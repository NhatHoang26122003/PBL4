package BT;

import java.awt.Color;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class View extends JFrame {
	public static void main(String[] args) {
		new View ();
	}
	public View() {
		this.setSize(600,400);
		this.setTitle("Short Path Routing");
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		JButton btn_1;
		btn_1 = new JButton ("Chọn");
		Border borderTiltle = BorderFactory.createLineBorder(Color.BLUE);
		
		this.setVisible(true);
	}
}
