package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WhereEat_Third_Screen extends JFrame {
	public WhereEat_Third_Screen() {
		setTitle("버거킹");
		setResizable(false);
		Container c = getContentPane();
		setLocation(300, 300);
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.setLayout(new BorderLayout());
		panel2.setLayout(new BorderLayout());
		JButton btn1 = new JButton("테이크 아웃");
		JButton btn2 = new JButton("매장 식사");
		c.add(panel1, BorderLayout.NORTH);
		c.add(panel2, BorderLayout.SOUTH);

		ImageIcon takeout1 = new ImageIcon("image/IntheStore.jpg");
		JLabel imageLabel = new JLabel(takeout1);
		panel1.add(imageLabel, BorderLayout.EAST);

		ImageIcon Storeeat1 = new ImageIcon("image/Pickup.jpg");
		JLabel imageLabel1 = new JLabel(Storeeat1);
		panel1.add(imageLabel1, BorderLayout.WEST);

		panel2.setBackground(Color.gray);
		panel2.add(btn1, BorderLayout.WEST);
		panel2.add(btn2, BorderLayout.EAST);

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				dispose();
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Menu();
				dispose();
			}
		});
		setVisible(true);
		setSize(570, 350);
	}
}
