package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Menuchange_Third_Screen extends Manager_Second_Screen {

	public Menuchange_Third_Screen() {

		// Panel ����
		setTitle("Menuchange_Screen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel1 = new JPanel();
		add(panel1, BorderLayout.WEST);
		panel1.setLayout(new GridLayout(4, 1, 5, 5));
		panel1.setSize(500, 300);
		panel1.setBackground(Color.GRAY);

		// �̹��� ����
		ImageIcon BugerKing = new ImageIcon("image/BugerKing2.jpg");
		JLabel panel2 = new JLabel(BugerKing);
		add(panel2, BorderLayout.EAST);

		// ��ư ����
		JButton btn1 = new JButton("�޴����");
		JButton btn2 = new JButton("�޴���ȸ");
		JButton btn3 = new JButton("�޴�����");
		JButton btn4 = new JButton("��ǰ�߰���� ����");

		panel1.add(btn1);
		panel1.add(btn2);
		panel1.add(btn3);
		panel1.add(btn4);

		// â ����
		setSize(650, 550);
		setVisible(true);

		// ��ư switch���� ���հ���

		// ��ư ���� �����ֱ�
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Screen();

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Display_Screen();

			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Remove_Screen();

			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�α���â���� ���ư��Ե˴ϴ�.\n �غ�������� ����˴ϴ�.��");
				dispose();
				new Manager_Second_Screen();

			}
		});

	}
}
