package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Display_Screen extends JFrame {

	public Display_Screen() {
		setTitle("메뉴조회");
		setLocation(430, 400); // 화면을 중간에 넣게 해줄 수 있는 코드
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 35);

		JLabel label = new JLabel("조회하고 싶은 메뉴를 선택하세요.");
		c.add(label, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3));
		panel.setBackground(Color.GRAY);
		c.add(panel, BorderLayout.SOUTH);
		label.setFont(font1);

		// 버튼 생성
		JButton btn1 = new JButton("버거(단품)");
		JButton btn2 = new JButton("음료(단품)");
		JButton btn3 = new JButton("사이드(단품)");
		JButton btn4 = new JButton("세트");
		JButton btn5 = new JButton("돌아가기");

		// 버튼을 화면에 띄워주는 코드
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.setSize(850, 170);

		// Container c 꾸미기
		setSize(600, 200);
		setVisible(true);

		// 버튼 역할
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Burger();

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Drink();

			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Side();

			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Display_Set();

			}
		});
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menuchange_Third_Screen();
			}
		});
	}

}
