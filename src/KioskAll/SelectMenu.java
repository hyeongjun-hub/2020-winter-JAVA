package KioskAll;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SelectMenu extends JFrame {

	String menu = "";

	SelectMenu() {
		// 디자인단
		// 프레임 설정단
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame frame = new JFrame("버거킹 메뉴판");
		frame.setBounds(0, 0, res.width, res.height);
		frame.setBackground(Color.black);
		// frame.setResizable(false);
		frame.setVisible(true);

		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 22);

		// 북쪽
		Panel pNorth = new Panel();
		pNorth.setBackground(new Color(255, 255, 215));
		pNorth.setLayout(null);
		pNorth.setSize(res.width, 500);
		pNorth.setFont(font);
		pNorth.setVisible(true);

		// 중앙
		Panel pCenter = new Panel();
		pCenter.setBackground(new Color(255, 220, 255));
		pCenter.setVisible(true);

		// 남쪽
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(new Color(255, 255, 215));
		pSouth.setLayout(null);
		pSouth.setSize(res.width, 200);
		pSouth.setVisible(true);

		// 배열 설정 부분
		String menu[] = { "빅맥버거", "싸이버거", "더블버거", "맘마버거", "김치버거", "새우버거", "라면버거", "치킨버거" };
		int price[] = { 5000, 5500, 6000, 6500, 7000, 7500, 8000, 8500 };
		JButton bt[] = new JButton[menu.length];

		// 버튼 설정 부분
		for (int i = 0; i < menu.length; i++) {

			// 햄버거 버튼
			bt[i] = new JButton(menu[i]);
			if (i < 4) {
				bt[i].setBounds(25 + i * 15, 5, 100, 100);
			} else {
				bt[i].setBounds(25 + (i - 4) * 15, 30, 10, 10);
			}

			pNorth.add(bt[i]);

		}

		// 중앙
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setText("   상품명        단가        수량        합계\n\n");
		ta.setBackground(Color.white);
		ta.setEditable(false);
		ta.setFont(font1);

		Button bt1 = new Button("주문");
		Button bt2 = new Button("초기화");
		Button bt3 = new Button("닫기");
		pSouth.add(bt1);
		pSouth.add(bt2);
		pSouth.add(bt3);

		// 주문버튼
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, ta.getText() + " 주문되었습니다. \n이용해주셔서 감사합니다.");
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
				}
			}
		});

		// 초기화 버튼
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < menu.length; i++) {
					bt[i].setEnabled(true);
					ta.setText("   상품명        단가        수량        합계\n\n");

				}
			}
		});
		// bt3 닫기버튼
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 컴포넌트
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);
		frame.setVisible(true);

		// 이벤트단
		for (int i = 0; i < menu.length; i++) {
			// 햄버그 버튼 이벤트
			bt[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append("menu[i]" + "price[i]" + "원" + " 1\n");
				}
			});

		}

		// 끄기
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	// 메인
	public static void main(String[] args) {
		new SelectMenu();
	}
}