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
		setTitle("포인트적립창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		Container c = getContentPane();
		JPanel main = new JPanel();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		setLocation(300, 300);
		JLabel textLabel = new JLabel("멤버십을 사용하시겠습니까?");
		JButton yes = new JButton("예");

		yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JButton yes = (JButton) e.getSource();
				new LoginScreen();
			}
		});
		JButton no = new JButton("아니오");
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				JButton no = (JButton) e.getSource();
				JOptionPane.showMessageDialog(null, "사용해주셔서 감사합니다");
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
