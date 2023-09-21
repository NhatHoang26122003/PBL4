package BT;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class View extends JFrame {
	public static void main(String[] args) {
		new View ();
	}
	public View() {
		this.setSize(600,400);
		this.setTitle("Short Path Routing");
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		JPanel p1= new JPanel();
		p1.setPreferredSize(new Dimension(250,400));
		p1.setBackground(Color.GRAY);
		
		JPanel p2= new JPanel();
		p2.setPreferredSize(new Dimension(350,400));
		p2.setBackground(Color.BLUE);
		
		p1.setLayout(new GridLayout(2,1,200,140));
		JButton btn_1;
		btn_1 = new JButton ("Chọn");
		Border borderTiltle = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder tramTitleBorder = new TitledBorder(borderTiltle, "Chọn trạm trên mạng");
		btn_1.setBorder(tramTitleBorder);
		tramTitleBorder.setTitleJustification(TitledBorder.CENTER);
		p1.add(btn_1);
		
		this.add(p1, BorderLayout.WEST);
		this.add(p2, BorderLayout.EAST);
		
		this.setVisible(true);
	}
}
