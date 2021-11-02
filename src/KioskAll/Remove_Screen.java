package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Remove_Screen extends JFrame {
	public Remove_Screen() {
		setTitle("�޴�����");
		setLocation(430, 300);
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 35);

		JLabel label = new JLabel("�����ϰ� ���� �޴��� �����ϼ���.");
		c.add(label, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3));
		panel.setBackground(Color.GRAY);
		c.add(panel, BorderLayout.SOUTH);
		label.setFont(font1);

		// ��ư ����
		JButton btn1 = new JButton("����(��ǰ)");
		JButton btn2 = new JButton("����(��ǰ)");
		JButton btn3 = new JButton("���̵�(��ǰ)");
		JButton btn4 = new JButton("��Ʈ");
		JButton btn5 = new JButton("�޴����� ����");

		// ��ư�� ȭ�鿡 ����ִ� �ڵ�
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.setSize(850, 170);

		// '����(��ǰ)'�� ������ ��,
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Burger();
				dispose();
			}
		});
		// '����(��ǰ)'�� ������ ��,
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Drink();
				dispose();
			}
		});
		// '���̵�(��ǰ)'�� ������ ��,
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Side();
				dispose();
			}
		});
		// '��Ʈ'�� ������ ��,
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Set();
				dispose();
			}
		});
		// '�޴����� ����'�� ������ ��,
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menuchange_Third_Screen();
			}
		});

		// Container c �ٹ̱�
		setSize(600, 200);
		setVisible(true);
	}

}
