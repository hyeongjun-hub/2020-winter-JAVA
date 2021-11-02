package KioskAll;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Goodadd_Side extends JFrame {
	public Goodadd_Side() {
		setTitle("���̵� �޴��߰�");
		setLocation(270, 150); // ȭ���� �߰��� �ְ� ���� �� �ִ� �ڵ�
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JPanel panel = new JPanel();
		c.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("�߰��� �޴��̸��� ������ �Է��ϼ���.");
		panel.add(label);

		panel.add(new JLabel("�޴��̸� "));
		JTextField t1 = new JTextField(20);
		panel.add(t1);
		panel.add(new JLabel("���� "));
		JTextField t2 = new JTextField(20);
		panel.add(t2);

		JButton btn1 = new JButton("�߰��ϱ�");
		panel.add(btn1);
		JButton btn2 = new JButton("�ڷΰ���");
		panel.add(btn2);

		ImageIcon Burgerking = new ImageIcon("image/0122BurgerKing2.jpg");
		JLabel imageLabel = new JLabel(Burgerking);
		c.add(imageLabel, BorderLayout.SOUTH);

		// '�߰��ϱ�'��ư ������ ��,
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				FileOutputStream fout = null;

				try {
					byte[] buffer = new byte[256];
					byte[] buffer2 = new byte[256];
					byte[] buffer3 = new byte[256];
					JButton join = (JButton) e.getSource();
					String x = t1.getText();
					String y = t2.getText();

					buffer = x.getBytes();
					buffer2 = y.getBytes();

					fout = new FileOutputStream("src/KioskAll/side.txt", true);
					fout.write(buffer);
					fout.write(' ');
					fout.write(buffer2);
					fout.write('\n');
					fout.close();

				} catch (IOException e1) {
				} finally {
					JOptionPane.showMessageDialog(null, "�߰��Ǿ����ϴ�.");
				}

			}
		});
		// '�ڷΰ���'��ư ������ ��,
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Screen();
			}
		});
		setSize(1000, 500);
		setVisible(true);

	}
}
