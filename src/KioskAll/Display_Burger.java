package KioskAll;

import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_Burger extends ListClass {
	public Display_Burger() {
		setTitle("�޴� ��ȸ(����_��ǰ)");
		Container c = getContentPane();
		setLocation(500, 100);
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		JTextArea ta = new JTextArea(100, 100);
		c.add(new JScrollPane(ta));

		for (int i = 0; i < name_burger.size(); i++) {
			ta.append(name_burger.get(i));
			ta.append(" ");
			ta.append(price_burger.get(i));
			ta.append("\n");
			ta.setEditable(false);
		}
		setSize(500, 250);
		setVisible(true);
	}
}
