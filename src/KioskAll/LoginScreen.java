package KioskAll;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginScreen extends MemberJoinList {

	public LoginScreen() {
		SelectMember();
		setTitle("����� �α���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocation(350, 350);
		setLayout(new GridLayout(2, 0));

		JPanel a = new JPanel();
		a.setLayout(new GridLayout(2, 0));
		JPanel b = new JPanel();
		JPanel c = new JPanel();
		JPanel d = new JPanel();
		JLabel label = new JLabel("��ȭ��ȣ ���ڸ� :");
		JLabel pswrd = new JLabel("����� ��ȣ :  ");
		JTextField txtID = new JTextField(15);
		JPasswordField txtPass = new JPasswordField(15);

		JButton use = new JButton("����Ʈ ���");
		JButton accm = new JButton("����Ʈ ����");
		JButton join = new JButton("����� ����");
		JButton Back = new JButton("�ڷ�");

		a.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 6));
		b.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		c.add(label);
		c.add(txtID);
		d.add(pswrd);
		d.add(txtPass);

		b.add(use);
		b.add(accm);
		b.add(join);
		b.add(Back);

		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MemberJoin();
				dispose();
			}
		});

		use.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtID.getText();
				String pw = txtPass.getText();

				MemberSet member = FindById(id);
				if (member == null) {
					JOptionPane.showMessageDialog(null, "��ϵ��� ���� ȸ���Դϴ�.");
				} else if (member.getPW().equals(pw)) {
					String price = Integer.toString(getSum() - Integer.parseInt(member.getPoint()));
					member.setPoint("0");
					JOptionPane.showMessageDialog(null, "����Ʈ�� ����Ͽ�" + price + "�� �����Ǿ����ϴ�.\n ������ּż� ����帳�ϴ�.");
					new Client_Second_Screen();
					FileOutputStream fout = null;
					ArrayList<String> all = new ArrayList<>();
					try {
						for (int i = 0; i < members.size(); i++) {
							String idvalue = (String) members.get(i).getID();
							String passvalue = (String) members.get(i).getPW();
							String pointvalue = (String) members.get(i).getPoint();
							all.add(idvalue + " " + passvalue + " " + pointvalue);
						}
						byte[] buffer = new byte[256];
						String allString = all.toString();
						allString = allString.replace("[", "");
						allString = allString.replace(",", "");
						allString = allString.replace("]", "");
						buffer = allString.getBytes();

						fout = new FileOutputStream("src/KioskAll/example.txt");
						fout.write(buffer);
						fout.write('\n');

					} catch (IOException e1) {
					} finally {
						try {
							if (fout != null)
								fout.close();
						} catch (IOException e1) {
						}
					}

					dispose();
				}
			}
		});

		accm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtID.getText();
				String pw = txtPass.getText();

				MemberSet member = FindById(id);
				if (member == null) {
					JOptionPane.showMessageDialog(null, "��ϵ��� ���� ȸ���Դϴ�.");
				} else if (member.getPW().equals(pw)) {
					String score = Integer.toString(Integer.parseInt(member.getPoint()) + getSum() / 100);// 100�� ����Ʈ��
					member.setPoint(score);
					JOptionPane.showMessageDialog(null,
							"1% �����Ǿ����ϴ�." + id + "���� ����Ʈ�� " + score + "�� �Դϴ�.\n ������ּż� �����մϴ�.");
					new Client_Second_Screen();
					FileOutputStream fout = null;
					ArrayList<String> all = new ArrayList<>();
					try {
						for (int i = 0; i < members.size(); i++) {
							String idvalue = (String) members.get(i).getID();
							String passvalue = (String) members.get(i).getPW();
							String pointvalue = (String) members.get(i).getPoint();
							all.add(idvalue + " " + passvalue + " " + pointvalue);
						}
						byte[] buffer = new byte[256];
						String allString = all.toString();
						allString = allString.replace("[", "");
						allString = allString.replace(",", "");
						allString = allString.replace("]", "");
						buffer = allString.getBytes();

						fout = new FileOutputStream("src/KioskAll/example.txt");
						fout.write(buffer);
						fout.write('\n');

					} catch (IOException e1) {
					} finally {
						try {
							if (fout != null)
								fout.close();
						} catch (IOException e1) {
						}
					}

					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "�α��� ����");
				}
			}
		});

		Back.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new MainScreen();
				dispose();
			}
		});

		a.add(c);
		a.add(d);
		add(a);
		add(b);

		setVisible(true);
		setSize(500, 180);
	}
}