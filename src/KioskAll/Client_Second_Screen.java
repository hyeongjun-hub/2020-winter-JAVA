package KioskAll;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client_Second_Screen extends JFrame {
	public Client_Second_Screen() {
		setTitle("버거킹");
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("아래 체온계로 체온확인 후, 나온 값을 입력해주세요. 체온 :");
		JTextField temp = new JTextField(4);
		JButton checkbtn = new JButton("확인");

		panel.add(label);
		panel.add(temp);
		panel.add(checkbtn);
		ImageIcon temperature = new ImageIcon("C:\\Users\\조형준\\OneDrive\\바탕 화면\\신비.gif");
		JLabel imageLabel = new JLabel(temperature);
		panel.add(imageLabel);

		checkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = temp.getText();
				double d1 = Double.parseDouble(s1);
				if (d1 > 30.0 && d1 < 37.5) {
					JOptionPane.showMessageDialog(null, "정상체온입니다.");
					new WhereEat_Third_Screen();

				} else {
					JOptionPane.showMessageDialog(null, "※직원이 친절히 도와드릴 예정이오니 잠시만 기다려주세요.");
				}
				dispose();
			}
		});
		add(panel);

	}

}