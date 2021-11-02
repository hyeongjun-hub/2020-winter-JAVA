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
		setTitle("����ŷ");
		setVisible(true);
		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("�Ʒ� ü�°�� ü��Ȯ�� ��, ���� ���� �Է����ּ���. ü�� :");
		JTextField temp = new JTextField(4);
		JButton checkbtn = new JButton("Ȯ��");

		panel.add(label);
		panel.add(temp);
		panel.add(checkbtn);
		ImageIcon temperature = new ImageIcon("C:\\Users\\������\\OneDrive\\���� ȭ��\\�ź�.gif");
		JLabel imageLabel = new JLabel(temperature);
		panel.add(imageLabel);

		checkbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = temp.getText();
				double d1 = Double.parseDouble(s1);
				if (d1 > 30.0 && d1 < 37.5) {
					JOptionPane.showMessageDialog(null, "����ü���Դϴ�.");
					new WhereEat_Third_Screen();

				} else {
					JOptionPane.showMessageDialog(null, "�������� ģ���� ���͵帱 �����̿��� ��ø� ��ٷ��ּ���.");
				}
				dispose();
			}
		});
		add(panel);

	}

}