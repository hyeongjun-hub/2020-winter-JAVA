package KioskAll;

import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_Side extends ListClass {
	public Display_Side() {
		setTitle("�޴� ��ȸ(���̵�)");
		Container c = getContentPane();
		setLocation(530, 100);
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		JTextArea ta = new JTextArea(100, 100);
		c.add(new JScrollPane(ta));

		for (int i = 0; i < name_side.size(); i++) {
			ta.append(name_side.get(i));
			ta.append(" ");
			ta.append(price_side.get(i));
			ta.append("\n");
			ta.setEditable(false);
		}
		setSize(500, 250);
		setVisible(true);
	}
}
