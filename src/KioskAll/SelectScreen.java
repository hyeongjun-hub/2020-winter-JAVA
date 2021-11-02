package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SelectScreen extends ListClass {

	public SelectScreen() {
		setTitle("결제 방법");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setBackground(Color.black);
		setLayout(new BorderLayout());

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		ImageIcon cardIcon = new ImageIcon("image/icon_card.jpg");
		ImageIcon cashIcon = new ImageIcon("image/icon_cash.jpg");
		JButton bt1 = new JButton("카드 결제", cardIcon);
		JButton bt2 = new JButton("현금 결제", cashIcon);
		JButton bt3 = new JButton("닫기");

		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p2.add(bt1);
		p2.add(bt2);
		p3.add(bt3);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);

		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
		System.out.println(sum);
	}

	public static void main(String[] args) {
	}

}