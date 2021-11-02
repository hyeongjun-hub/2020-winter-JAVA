package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JTextField;

public class CashPay extends JFrame {
	public CashPay() {
		setTitle("���� ����â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 280);
		setLocation(300, 300);
		setBackground(Color.black);
		setLayout(new BorderLayout());
		setResizable(false);

		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 24);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		int sum = 0;

		JLabel label1 = new JLabel("�� �ݾ��� " + getSum() + "���Դϴ�. ������ �������ּ���.");
		JButton okbtn = new JButton("Ȯ��");
		JTextField temp = new JTextField(6);
		JLabel label2 = new JLabel("(��)");

		label1.setFont(font);
		label2.setFont(font);

		p1.add(label1);
		p1.add(label2);

		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		p2.add(okbtn);
		p2.add(temp);

		Container c = getContentPane();

		temp.setHorizontalAlignment(JTextField.RIGHT);
		c.setLayout(null);
		label1.setLocation(70, 60);
		label1.setSize(500, 20);
		c.add(label1);
		label2.setLocation(258, 104);
		label2.setSize(100, 20);
		c.add(label2);
		okbtn.setLocation(300, 100);
		okbtn.setSize(90, 30);
		temp.setLocation(125, 99);
		temp.setSize(130, 35);
		temp.setFont(font);
		c.add(temp);
		c.add(okbtn); // ��ư�� ����Ʈ�ҿ� ����

		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);

		okbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int change = Integer.parseInt(temp.getText()) - getSum();
				if (change < 0) {
					JOptionPane.showMessageDialog(null, "�ݾ��� �����մϴ�");
				} else {
					JOptionPane.showMessageDialog(null, "���� �ݾ���" + temp.getText() + "���̰�, �Ž������� " + change + "���Դϴ�.\n");
					dispose();
					new MainScreen();
				}
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