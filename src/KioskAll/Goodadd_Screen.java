package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Goodadd_Screen extends JFrame {
	public Goodadd_Screen() {
		setTitle("메뉴추가");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(430, 200); // 화면을 중간에 넣게 해줄 수 있는 코드
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 35);

		JLabel label = new JLabel("추가하고 싶은 메뉴를 선택하세요.");
		c.add(label, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3));
		panel.setBackground(Color.GRAY);
		c.add(panel, BorderLayout.SOUTH);
		label.setFont(font1);

		ImageIcon BurgerKing1 = new ImageIcon("image/BurgerKing3.jpg");
		JLabel imageLabel = new JLabel(BurgerKing1);
		panel.add(imageLabel, BorderLayout.CENTER);

		// 버튼 생성
		JButton btn1 = new JButton("버거(단품)");
		JButton btn2 = new JButton("음료(단품)");
		JButton btn3 = new JButton("사이드(단품)");
		JButton btn4 = new JButton("세트");
		JButton btn5 = new JButton("메뉴수정 중지");
		btn1.setPreferredSize(new Dimension(45, 28));
		btn2.setPreferredSize(new Dimension(45, 28));
		btn3.setPreferredSize(new Dimension(45, 28));
		btn4.setPreferredSize(new Dimension(45, 28));
		btn5.setPreferredSize(new Dimension(45, 28));

		// 버튼을 화면에 띄워주는 코드
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);

		// Container c 꾸미기
		setSize(600, 450);
		setVisible(true);

		// 버튼 역할
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Burger();

			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Drink();
			}
		});

		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Side();
			}
		});
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Goodadd_Set();
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