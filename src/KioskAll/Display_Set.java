package KioskAll;

import java.awt.Container;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Display_Set extends ListClass {
	public Display_Set() {
		setTitle("�޴� ��ȸ(��Ʈ)");
		Container c = getContentPane();
		setLocation(520, 100);
		setResizable(false); // â Ȯ��or��Ҹ� ���ϰ��ϴ� �ڵ�
		JTextArea ta = new JTextArea(100, 100);
		c.add(new JScrollPane(ta));

		for (int i = 0; i < name_set.size(); i++) {
			ta.append(name_set.get(i));
			ta.append(" ");
			ta.append(price_set.get(i));
			ta.append("\n");
			ta.setEditable(false);
		}
		setSize(500, 250);
		setVisible(true);

	}
}
