package KioskAll;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Ticket extends MemberJoinList {

	private final JPanel contentPanel = new JPanel();

	public Ticket(String category, String menuName, int price, String kioskName, int kioskNo) {
		setType(Type.UTILITY);
		setTitle("영수증");
		setFont(new Font("SANS_SERIF", Font.PLAIN, 12));
		setBounds(100, 100, 216, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(135, 206, 235));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblCategory = new JLabel(category);
			lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
			lblCategory.setBounds(13, 17, 176, 30);
			lblCategory.setFont(new Font("SANS_SERIF", Font.PLAIN, 18));
			contentPanel.add(lblCategory);
		}
		{
			JLabel lblmenuName = new JLabel(menuName);
			lblmenuName.setHorizontalAlignment(SwingConstants.CENTER);
			lblmenuName.setBounds(13, 43, 176, 34);
			lblmenuName.setFont(new Font("SANS_SERIF", Font.PLAIN, 25));
			contentPanel.add(lblmenuName);
		}
		{
			JLabel lblPrice = new JLabel("메뉴 " + new DecimalFormat().format(price));
			lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrice.setBounds(13, 82, 176, 21);
			lblPrice.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
			contentPanel.add(lblPrice);
		}
		{
			long time = System.currentTimeMillis();
			SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String timeStr = dayTime.format(new Date(time));

			JLabel lblPrintedDate = new JLabel(timeStr);
			lblPrintedDate.setHorizontalAlignment(SwingConstants.CENTER);
			lblPrintedDate.setBounds(13, 108, 176, 21);
			lblPrintedDate.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
			contentPanel.add(lblPrintedDate);
		}
		{
			JLabel lblKioskName = new JLabel("POS기 넘버: " + kioskNo);
			lblKioskName.setHorizontalAlignment(SwingConstants.RIGHT);
			lblKioskName.setBounds(13, 134, 106, 17);
			lblKioskName.setFont(new Font("SANS_SERIF", Font.PLAIN, 12));
			contentPanel.add(lblKioskName);
		}
		{
			JLabel lblPaymentMethod = new JLabel("감사합니다");
			lblPaymentMethod.setBounds(125, 134, 64, 17);
			lblPaymentMethod.setFont(new Font("SANS_SERIF", Font.PLAIN, 12));
			contentPanel.add(lblPaymentMethod);
		}
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setVisible(true);
	}

}
