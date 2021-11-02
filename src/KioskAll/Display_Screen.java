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

public class Display_Screen extends JFrame {

	public Display_Screen() {
		setTitle("�޴���ȸ");
		setLocation(430, 400); // ȭ���� �߰��� �ְ� ���� �� �ִ� �ڵ�
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 35);

		JLabel label = new JLabel("��ȸ�ϰ� ���� �޴��� �����ϼ���.");
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
		JButton btn5 = new JButton("���ư���");

		// ��ư�� ȭ�鿡 ����ִ� �ڵ�
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.setSize(850, 170);

		// Container c �ٹ̱�
		setSize(600, 200);
		setVisible(true);

		// ��ư ����
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Burger();

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Drink();

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Side();

			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Set();

			}
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menuchange_Third_Screen();
			}
		});
	}

}
