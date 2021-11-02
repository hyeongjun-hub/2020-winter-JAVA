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
		setTitle("사이드 메뉴추가");
		setLocation(270, 150); // 화면을 중간에 넣게 해줄 수 있는 코드
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JPanel panel = new JPanel();
		c.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("추가할 메뉴이름과 가격을 입력하세요.");
		panel.add(label);

		panel.add(new JLabel("메뉴이름 "));
		JTextField t1 = new JTextField(20);
		panel.add(t1);
		panel.add(new JLabel("가격 "));
		JTextField t2 = new JTextField(20);
		panel.add(t2);

		JButton btn1 = new JButton("추가하기");
		panel.add(btn1);
		JButton btn2 = new JButton("뒤로가기");
		panel.add(btn2);

		ImageIcon Burgerking = new ImageIcon("image/0122BurgerKing2.jpg");
		JLabel imageLabel = new JLabel(Burgerking);
		c.add(imageLabel, BorderLayout.SOUTH);

		// '추가하기'버튼 눌렀을 시,
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
					JOptionPane.showMessageDialog(null, "추가되었습니다.");
				}

			}
		});
		// '뒤로가기'버튼 눌렀을 시,
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
