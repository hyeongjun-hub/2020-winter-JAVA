package KioskAll;

import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_Drink extends ListClass {
	public Display_Drink() {
		setTitle("메뉴 조회(음료)");
		Container c = getContentPane();
		setLocation(510, 100);
		setResizable(false); // 창 확대or축소를 못하게하는 코드
		JTextArea ta = new JTextArea(100, 100);
		c.add(new JScrollPane(ta));

		for (int i = 0; i < name_drink.size(); i++) {
			ta.append(name_drink.get(i));
			ta.append(" ");
			ta.append(price_drink.get(i));
			ta.append("\n");
			ta.setEditable(false);
		}
		setSize(500, 250);
		setVisible(true);

	}

}
