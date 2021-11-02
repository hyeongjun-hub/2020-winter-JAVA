package KioskAll;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Manager_Second_Screen extends JFrame {
	public Manager_Second_Screen() {
		setTitle("Manager Login Sreen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(600, 400);
		setLocation(450, 250);
		setResizable(false);
		Container c = getContentPane();

		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton logBtn = new JButton("Log In");
		JButton Exitbtn = new JButton("Exit");

		c.add(panel);
		panel.add(label);
		panel.add(txtID);
		panel.add(pswrd);
		panel.add(txtPass);
		panel.add(logBtn);
		panel.add(Exitbtn);

		ImageIcon BurgerKing1 = new ImageIcon("image/BurgerKing1.jpg");
		JLabel imageLabel = new JLabel(BurgerKing1);
		panel.add(imageLabel, BorderLayout.SOUTH);

		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = "2021_JAVA";
				String pass = "1234";

				if (id.equals(txtID.getText()) && pass.equals(txtPass.getText())) {
					new Menuchange_Third_Screen();
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		Exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new First_Screen();
			}
		});

	}

}
