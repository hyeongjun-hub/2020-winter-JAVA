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

public class Pay extends JFrame {
	public Pay() {

		setTitle("결제 방법");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 280);
		setLocation(300, 300);
		setBackground(Color.black);
		setLayout(new BorderLayout());

		Container c = getContentPane();

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		JLabel label = new JLabel("카드로 결제하시겠습니까, 현금으로 결제하시겠습니까? ");

		ImageIcon cardIcon = new ImageIcon("image/카드.jpg");
		ImageIcon cashIcon = new ImageIcon("image/현금.jpg");
		JButton bt1 = new JButton("카드 결제", cardIcon);
		JButton bt2 = new JButton("현금 결제", cashIcon);
		JButton bt3 = new JButton("닫기");

		p1.add(label);
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p2.add(bt1, BorderLayout.WEST);
		p2.add(bt2, BorderLayout.EAST);
		p3.add(bt3, BorderLayout.CENTER);
		p1.setBackground(Color.yellow);
		label.setLocation(10, 50);
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.CENTER);
		c.add(p3, BorderLayout.SOUTH);

		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CardPay();
				dispose();
			}
		});

		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CashPay();
				dispose();
			}
		});

		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
	}

}
