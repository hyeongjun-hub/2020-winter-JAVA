package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CardPay extends JFrame {

	public CardPay() {

		setTitle("ī�� ����â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 280);
		setLocation(300, 300);
		setBackground(Color.black);
		setLayout(new BorderLayout());
		setResizable(false);

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 16);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		JLabel label1 = new JLabel("�� �ݾ��� " + getSum() + "���Դϴ�.  ������� ����Ͻðڽ��ϱ�?");
		JButton use = new JButton("����� ���");
		JButton no = new JButton("����� ������");

		p1.add(label1);
		label1.setFont(font);

		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
		p2.add(use);
		p2.add(no);

		p1.setLayout(null);
		label1.setLocation(54, 85);
		label1.setSize(500, 40);

		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);

		use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginScreen();
			}
		});
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JOptionPane.showMessageDialog(null, "������ �Ϸ�Ǿ����ϴ�. ������ּż� �����մϴ�.");
			}
		});
		setVisible(true);
	}

	public int getSum() {
		int accumpoint = 0;
		try {
			File file = new File("src/KioskAll/point.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			while ((line = bufReader.readLine()) != null) {

				accumpoint = Integer.parseInt(line);
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		return accumpoint;
	}
}