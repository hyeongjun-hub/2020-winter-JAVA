package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Remove_Side extends ListClass {

	public Remove_Side() {
		setTitle("메뉴삭제");
		setLocation(470, 300); // 화면을 중간에 넣게 해줄 수 있는 코드
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JLabel label = new JLabel("삭제하고 싶은 메뉴를 선택하세요.");
		c.add(label, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 3));
		panel.setBackground(Color.GRAY);
		c.add(panel, BorderLayout.SOUTH);
		panel.add(new JLabel("메뉴이름 "));
		JTextField t1 = new JTextField(20);
		panel.add(t1);

		JButton btn1 = new JButton("삭제하기");
		panel.add(btn1);
		JButton btn2 = new JButton("뒤로가기");
		panel.add(btn2);

		new Display_Side();

		// '삭제하기'버튼 눌렀을 시,
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					String delete_menu = t1.getText();
					int index = name_side.indexOf(delete_menu);
					// System.out.println(index);
					name_side.remove(index);
					price_side.remove(index);

					FileOutputStream fos1 = new FileOutputStream("src/KioskAll/side.txt", false); // 프로그램 아래에 만들어야함

					OutputStreamWriter osw1 = new OutputStreamWriter(fos1, "MS949"); //

					for (int k = 0; k < name_side.size(); k++) {

						osw1.write(name_side.get(k));
						osw1.write(" ");
						osw1.flush();
						osw1.write(price_side.get(k));
						osw1.write("\r\n");
					}

					osw1.close();
					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
				} catch (IOException x) {
				}

			}

		});
		// '뒤로가기'버튼 눌렀을 시,
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				new Remove_Screen();
			}
		});
		setSize(600, 200);
		setVisible(true);

	}
}