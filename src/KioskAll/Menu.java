package KioskAll;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends ListClass {
	int sum = 0;

	public Menu() {

		JFrame frame = new JFrame("버거킹 메뉴판");
		frame.setSize(1000, 800);
		frame.setBackground(Color.black);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 24);

		// 북쪽
		Panel pNorth = new Panel();
		pNorth.setBackground(Color.yellow);
		pNorth.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		pNorth.setSize(50, 50);
		pNorth.setFont(font);
		pNorth.setVisible(true);

		// 중앙
		Panel pCenter = new Panel();
		pCenter.setLayout(new GridLayout(0, 4, 10, 10));
		Panel a = new Panel();
		Panel ai = new Panel();
		a.setLayout(new BorderLayout(10, 10));
		Panel b = new Panel();
		Panel bi = new Panel();
		b.setLayout(new BorderLayout(10, 10));
		Panel c = new Panel();
		Panel ci = new Panel();
		c.setLayout(new BorderLayout(10, 10));
		Panel d = new Panel();
		Panel di = new Panel();
		d.setLayout(new BorderLayout(10, 10));
		Panel e = new Panel();
		e.setLayout(new BorderLayout(10, 10));

		Panel aaa = new Panel();
		Panel bbb = new Panel();
		Panel ccc = new Panel();
		Panel ddd = new Panel();

		JLabel bgr = new JLabel("버거");
		bgr.setForeground(Color.white);
		bgr.setLayout(new GridLayout(0, 1));
		bgr.setFont(font1);
		JLabel drk = new JLabel("드링크");
		drk.setForeground(Color.white);
		drk.setFont(font1);
		JLabel sde = new JLabel("사이드");
		sde.setFont(font1);
		sde.setForeground(Color.white);
		JLabel set = new JLabel("세트");
		set.setFont(font1);
		set.setForeground(Color.white);

		Panel aa = new Panel();
		aa.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
		aa.setBackground(Color.white);
		Panel bb = new Panel();
		bb.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
		bb.setBackground(Color.white);
		Panel cc = new Panel();
		cc.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		cc.setBackground(Color.white);
		Panel dd = new Panel();
		dd.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));
		dd.setBackground(Color.white);

		aaa.add(bgr);
		bbb.add(drk);
		ccc.add(sde);
		ddd.add(set);

		a.add(aa, BorderLayout.CENTER);
		a.add(ai, BorderLayout.SOUTH);
		a.add(aaa, BorderLayout.NORTH);
		b.add(bb, BorderLayout.CENTER);
		b.add(bbb, BorderLayout.NORTH);
		b.add(bi, BorderLayout.SOUTH);
		c.add(cc, BorderLayout.CENTER);
		c.add(ccc, BorderLayout.NORTH);
		c.add(ci, BorderLayout.SOUTH);
		d.add(dd, BorderLayout.CENTER);
		d.add(ddd, BorderLayout.NORTH);
		d.add(di, BorderLayout.SOUTH);

		pCenter.setBackground(Color.red);
		pCenter.setVisible(true);

		// 남쪽
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.yellow);
		pSouth.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		pSouth.setSize(40, 20);
		pSouth.setVisible(true);

		// 이미지
		Panel e2 = new Panel();
		ImageIcon image = new ImageIcon("image/버거킹5.jpg");
		JLabel imageLabel = new JLabel(image);
		e2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		e2.add(imageLabel);

		// 중앙
		Panel e1 = new Panel();
		e1.setBackground(Color.white);
		e1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		e.add(e1, BorderLayout.WEST);
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명    단가\n");
		ta.setBackground(Color.white);
		ta.setFont(font1);
		pSouth.setLayout(new GridLayout(0, 2));
		pSouth.add(ta);
		pSouth.add(e);
		e.add(e2, BorderLayout.CENTER);

		Button bt1 = new Button("주문");
		Button bt2 = new Button("초기화");
		Button bt3 = new Button("닫기");
		e1.setLayout(new GridLayout(3, 0));
		e1.add(bt1);
		e1.add(bt2);
		e1.add(bt3);

//-----------------------------------------------------------------------
		ArrayList<JButton> ptn = new ArrayList<>();
		ArrayList<JButton> ptn2 = new ArrayList<>();
		ArrayList<JButton> ptn3 = new ArrayList<>();
		ArrayList<JButton> ptn4 = new ArrayList<>();

		for (int i = 0; i < name_burger.size(); i++) {
			JButton btn = new JButton(name_burger.get(i));
			ptn.add(btn);
			aa.add(btn);
		}

		for (int i = 0; i < ptn.size(); i++) {
			String nb = name_burger.get(i);
			String pb = price_burger.get(i);
			ptn.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(nb + " " + pb + "원 \n");
					sum += Integer.parseInt(pb);
					System.out.println("총금액: " + sum);
					dispose();
				}
			});
		}
//버거
		for (int i = 0; i < name_drink.size(); i++) {
			JButton btn = new JButton(name_drink.get(i));
			ptn2.add(btn);
			bb.add(btn);
		}

		for (int i = 0; i < ptn2.size(); i++) {
			String ns = name_drink.get(i);
			String ps = price_drink.get(i);
			ptn2.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(ns + " " + ps + "원 \n");
					sum += Integer.parseInt(ps);
					System.out.println("총금액: " + sum);
				}
			});
		}
		// 드링크
		for (int i = 0; i < name_side.size(); i++) {
			JButton btn = new JButton(name_side.get(i));
			ptn3.add(btn);
			cc.add(btn);
		}

		for (int i = 0; i < ptn2.size(); i++) {
			String ns = name_side.get(i);
			String ps = price_side.get(i);
			ptn3.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(ns + " " + ps + "원 \n");
					sum += Integer.parseInt(ps);
					System.out.println("총금액: " + sum);
				}
			});
		}
		// 사이드
		for (int i = 0; i < name_set.size(); i++) {
			JButton btn = new JButton(name_set.get(i));
			ptn4.add(btn);
			dd.add(btn);
		}

		for (int i = 0; i < ptn2.size(); i++) {
			String ns = name_set.get(i);
			String ps = price_set.get(i);
			ptn4.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ta.append(ns + " " + ps + "원 \n");
					sum += Integer.parseInt(ps);
					System.out.println("총금액: " + sum);
				}
			});
		}
		pCenter.add(a);
		pCenter.add(b);
		pCenter.add(c);
		pCenter.add(d);
//세트

		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(pCenter, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		frame.setVisible(true);

		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다.");
				try {
					File file = new File("src/KioskAll/point.txt");
					BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
					if (file.isFile() && file.canWrite()) {
						System.out.println(sum);
						bufferedWriter.write(Integer.toString(sum));
						bufferedWriter.close();
					}
				} catch (IOException e1) {
					System.out.println(e1);
				}
				new Pay();

			}
		});

		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum = 0;
				ta.setText("   상품명    단가\n");

			}
		});

		// bt3 닫기버튼
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

//	public static void main(String[] args) {
//		new Menu();
//	}

}