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

public class Remove_Screen extends JFrame {
	public Remove_Screen() {
		setTitle("메뉴삭제");
		setLocation(430, 300);
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 35);

		JLabel label = new JLabel("삭제하고 싶은 메뉴를 선택하세요.");
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
		JButton btn5 = new JButton("메뉴수정 중지");

		// 버튼을 화면에 띄워주는 코드
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.setSize(850, 170);

		// '버거(단품)'을 눌렀을 시,
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Burger();
				dispose();
			}
		});
		// '음료(단품)'을 눌렀을 시,
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Drink();
				dispose();
			}
		});
		// '사이드(단품)'을 눌렀을 시,
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Side();
				dispose();
			}
		});
		// '세트'를 눌렀을 시,
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Remove_Set();
				dispose();
			}
		});
		// '메뉴수정 중지'를 눌렀을 시,
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Menuchange_Third_Screen();
			}
		});

		// Container c 꾸미기
		setSize(600, 200);
		setVisible(true);
	}

}
