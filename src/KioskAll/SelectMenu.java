package KioskAll;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SelectMenu extends JFrame {

	String menu = "";

	SelectMenu() {
		// �����δ�
		// ������ ������
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame frame = new JFrame("����ŷ �޴���");
		frame.setBounds(0, 0, res.width, res.height);
		frame.setBackground(Color.black);
		// frame.setResizable(false);
		frame.setVisible(true);

		// ��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);

		// ����
		Panel pNorth = new Panel();
		pNorth.setBackground(new Color(255, 255, 215));
		pNorth.setLayout(null);
		pNorth.setSize(res.width, 500);
		pNorth.setFont(font);
		pNorth.setVisible(true);

		// �߾�
		Panel pCenter = new Panel();
		pCenter.setBackground(new Color(255, 220, 255));
		pCenter.setVisible(true);

		// ����
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(new Color(255, 255, 215));
		pSouth.setLayout(null);
		pSouth.setSize(res.width, 200);
		pSouth.setVisible(true);

		// �迭 ���� �κ�
		String menu[] = { "��ƹ���", "���̹���", "�������", "��������", "��ġ����", "�������", "������", "ġŲ����" };
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500 };
		JButton bt[] = new JButton[menu.length];

		// ��ư ���� �κ�
		for (int i = 0; i < menu.length; i++) {

			// �ܹ��� ��ư
			bt[i] = new JButton(menu[i]);
			if (i < 4) {
				bt[i].setBounds(25 + i * 15, 5, 100, 100);
			} else {
				bt[i].setBounds(25 + (i - 4) * 15, 30, 10, 10);
			}

			pNorth.add(bt[i]);

		}

		// �߾�
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setFont(font1);

		Button bt1 = new Button("�ֹ�");
		Button bt2 = new Button("�ʱ�ȭ");
		Button bt3 = new Button("�ݱ�");
		pSouth.add(bt1);
		pSouth.add(bt2);
		pSouth.add(bt3);

		// �ֹ���ư
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ta.getText() + " �ֹ��Ǿ����ϴ�. \n�̿����ּż� �����մϴ�.");
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
				}
			}
		});

		// �ʱ�ȭ ��ư
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
					ta.setText("   ��ǰ��        �ܰ�        ����        �հ�\n\n");

				}
			}
		});
		// bt3 �ݱ��ư
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// ������Ʈ
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		frame.setVisible(true);

		// �̺�Ʈ��
		for (int i = 0; i < menu.length; i++) {
			// �ܹ��� ��ư �̺�Ʈ
			bt[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append("menu[i]" + "price[i]" + "��" + " 1\n");
				}
			});

		}

		// ����
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// ����
	public static void main(String[] args) {
		new SelectMenu();
	}
}