package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class First_Screen extends JFrame {
	public First_Screen() {
		setTitle("버거킹");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 300);
		setResizable(false);
		Container c = getContentPane();
		setLayout(new BorderLayout());

		JPanel btnPanel = new JPanel();
		c.add(btnPanel, BorderLayout.WEST);
		btnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 40));

		JButton btn1 = new JButton("관리자용");
		JButton btn2 = new JButton("고객용");
		JButton btn3 = new JButton("프로그램 종료");

		ImageIcon Burgerking = new ImageIcon("image/BurgerKing.jpg");
		JLabel imageLabel = new JLabel(Burgerking);
		c.add(imageLabel, BorderLayout.EAST);

		btnPanel.setBackground(Color.GRAY);

		btnPanel.add(btn1);
		btnPanel.add(btn2);
		btnPanel.add(btn3);
		btnPanel.setSize(100, 50);

		setSize(850, 200);
		setVisible(true);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Manager_Second_Screen();
				dispose();
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Client_Second_Screen();
				dispose();
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		new First_Screen();
	}
}
