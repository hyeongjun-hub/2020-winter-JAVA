package KioskAll;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainScreen2 extends JFrame {

	public MainScreen2() {
		setTitle("����Ʈ����â");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container c = getContentPane();
		JPanel main = new JPanel();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		setLocation(300, 300);
		JLabel textLabel = new JLabel("������� ����Ͻðڽ��ϱ�?");
		JButton yes = new JButton("��");

		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JButton yes = (JButton) e.getSource();
				new LoginScreen();
			}
		});
		JButton no = new JButton("�ƴϿ�");
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JButton no = (JButton) e.getSource();
				JOptionPane.showMessageDialog(null, "������ּż� �����մϴ�");
				new Client_Second_Screen();
			}
		});
		main.add(textLabel);
		main.add(yes);
		main.add(no);
		add(main);
		setSize(400, 130);
		setVisible(true);

	}

}
