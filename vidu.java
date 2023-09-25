package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class vidu extends JFrame {

	private JPanel contentPane;
	private JTextField txtSource;
	private JTextField txtDestination;
	private JTextField txtPathToEnd;
	private JTextField txtDistance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vidu frame = new vidu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vidu() {
		setFont(new Font("Arial", Font.BOLD, 14));
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 704, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Chon tram tren mang", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(31, 27, 261, 209);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NGUỒN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(27, 27, 117, 59);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ĐÍCH");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(174, 35, 62, 42);
		panel.add(lblNewLabel_1);
		
		txtSource = new JTextField();
		txtSource.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtSource.setBounds(10, 80, 96, 42);
		panel.add(txtSource);
		txtSource.setColumns(10);
		
		txtDestination = new JTextField();
		txtDestination.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDestination.setColumns(10);
		txtDestination.setBounds(154, 80, 96, 42);
		panel.add(txtDestination);
		
		JButton btnSelection = new JButton("Chọn");
		btnSelection.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSelection.setBounds(87, 143, 85, 42);
		panel.add(btnSelection);
		
		JLabel lblNewLabel_2 = new JLabel("Bảng chỉ đường");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(110, 246, 140, 39);
		contentPane.add(lblNewLabel_2);
		
		JTextArea txtPaths = new JTextArea();
		txtPaths.setBounds(31, 295, 261, 158);
		contentPane.add(txtPaths);
		
		JPanel pnlPaint = new JPanel();
		pnlPaint.setBounds(321, 36, 359, 200);
		contentPane.add(pnlPaint);
		
		txtPathToEnd = new JTextField();
		txtPathToEnd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtPathToEnd.setText("Đường đi:");
		txtPathToEnd.setBounds(321, 278, 359, 39);
		contentPane.add(txtPathToEnd);
		txtPathToEnd.setColumns(10);
		
		txtDistance = new JTextField();
		txtDistance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDistance.setText("Khoảng cách:");
		txtDistance.setBounds(321, 327, 359, 39);
		contentPane.add(txtDistance);
		txtDistance.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Bang dieu khien", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel_2.setBounds(398, 376, 197, 77);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton BtnEndControl = new JButton("Kết thúc");
		BtnEndControl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		BtnEndControl.setBounds(33, 16, 139, 51);
		panel_2.add(BtnEndControl);
	}
}
