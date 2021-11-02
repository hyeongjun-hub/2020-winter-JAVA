package KioskAll;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MemberJoin extends MemberJoinList {
	MemberJoin() {
		String point = Integer.toString(getSum() / 100);
		setTitle("회원가입창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(600, 150);
		JPanel pannel = new JPanel();
		JPanel a = new JPanel();
		JPanel b = new JPanel();
		JPanel d = new JPanel();
		pannel.setLayout(new GridLayout(3, 0));
		JLabel label = new JLabel("전화번호 뒷자리 : ");
		JLabel pswrd = new JLabel("암호 (두 번 입력) : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(8);
		JPasswordField txtPass2 = new JPasswordField(8);
		JButton join = new JButton("멤버십가입");
		JButton Back = new JButton("뒤로");
		a.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 35));
		b.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		d.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

		a.add(label);
		a.add(txtID);
		b.add(pswrd);
		b.add(txtPass);
		b.add(txtPass2);
		d.add(join);
		d.add(Back);
		pannel.add(a);
		pannel.add(b);
		pannel.add(d);

		join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				byte[] buffer = new byte[256];
				byte[] buffer2 = new byte[256];
				byte[] buffer3 = new byte[256];
				String idd = txtID.getText();
				String pww = txtPass.getText();
				String pww2 = txtPass2.getText();
				buffer = idd.getBytes();
				buffer2 = pww.getBytes();
				buffer3 = point.getBytes();
				if (idCheck(idd)) {
					JOptionPane.showMessageDialog(null, "중복된 전화번호입니다.");
				} else if (pww.equals(pww2)) {
					members.add(new MemberSet(idd, pww, point));
					FileOutputStream fout = null;
					try {
						fout = new FileOutputStream("src/KioskAll/example.txt", true);
						fout.write(buffer);
						fout.write(' ');
						fout.write(buffer2);
						fout.write(' ');
						fout.write(buffer3);
						fout.write('\n');

					} catch (IOException e1) {
						System.out.println("aa");
					} finally {
						try {
							if (fout != null)
								fout.close();
						} catch (IOException e1) {
						}
					}
					JOptionPane.showMessageDialog(null, idd + " 님 가입을 축하드립니다." + point + "점 적립되었습니다.\n 사용해주셔서 감사드립니다.");
					dispose();
					SelectMember();
					new Client_Second_Screen();
				} else {
					JOptionPane.showMessageDialog(null, "암호를 확인해주세요.");
				}
			}
		});

		Back.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				new LoginScreen();
				dispose();
			}
		});

		add(pannel);
		setSize(600, 250);
		setVisible(true);

	}

}
