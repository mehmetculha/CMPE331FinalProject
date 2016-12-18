import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Payment implements ActionListener {
	JFrame f;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	JTextField t3, t4, t5, t6, t8;
	JTextArea t14;
	Choice h2;
	JTextArea ta;

	JButton b2, b3, b4;
	private String price = "89.90 TL including Taxes"; // create price value for
														// ticket

	File file1 = new File("data.txt");

	@SuppressWarnings("deprecation")
	Payment() {
		// create frame,labels,buttons,choices and textboxes
		f = new JFrame("Payment");
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.darkGray);
		l1 = new JLabel("PAYMENT");
		l1.setForeground(Color.white);
		l1.setBounds(150, 50, 100, 30);
		l2 = new JLabel("Paymen Method:");
		l2.setForeground(Color.white);
		l2.setBounds(50, 80, 150, 30);
		h2 = new Choice();
		h2.setBounds(210, 85, 120, 30);
		h2.add("Credit Card");
		h2.add("Debit Card");
		l3 = new JLabel("Name on the card:");
		l3.setForeground(Color.white);
		l3.setBounds(50, 110, 150, 30);
		l4 = new JLabel("Card Number(16 digit):");
		l4.setForeground(Color.white);
		l4.setBounds(50, 150, 150, 30);
		l5 = new JLabel("Exp. Date(4 digit):");
		l5.setForeground(Color.white);
		l5.setBounds(50, 190, 150, 30);
		l6 = new JLabel("CVV(3 digit):");
		l6.setForeground(Color.white);
		l6.setBounds(50, 230, 150, 30);

		l8 = new JLabel("Ticket Price:");
		l8.setForeground(Color.white);
		l8.setBounds(50, 270, 150, 30);

		t3 = new JTextField(10);
		t3.setBounds(210, 115, 120, 25);
		t4 = new JTextField(10);
		t4.setBounds(210, 150, 120, 30);
		t5 = new JTextField(10);
		t5.setBounds(210, 190, 120, 30);
		t6 = new JTextField(10);
		t6.setBounds(210, 230, 120, 30);
		t8 = new JTextField(10);
		t8.setBounds(210, 270, 150, 30);
		t8.disable();
		t8.setText(price);

		b2 = new JButton("PAY");
		b2.setBackground(Color.white);
		b2.setBounds(100, 310, 100, 30);
		b2.addActionListener(this);

		b3 = new JButton("BACK");
		b3.setBackground(Color.white);
		b3.setBounds(200, 310, 100, 30);
		b3.addActionListener(this);

		b4 = new JButton("MENU");
		b4.setBackground(Color.white);
		b4.setBounds(300, 310, 100, 30);
		b4.addActionListener(this);

		// add all labels,buttons,choices and textboxes
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);
		f.getContentPane().add(l5);
		f.getContentPane().add(l6);

		f.getContentPane().add(l8);

		f.getContentPane().add(t3);
		f.getContentPane().add(t4);
		f.getContentPane().add(t5);
		f.getContentPane().add(t6);
		f.getContentPane().add(t8);

		f.getContentPane().add(h2);

		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);

		f.setSize(1300, 1000);
		f.setVisible(true);

	}

	public static void main(String[] args) { // main method that calls Payment
												// object
		new Payment();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b2 && t5.getText().length() == 4 && t4.getText().length() == 16
				&& t6.getText().length() == 3 && t3.getText().length() != 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new AfterReservation();

			} catch (Exception e1) {
				System.out.println("Payment Failed" + e1);
			}

		}

		if (e.getSource() == b2 && t4.getText().length() != 16) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				JOptionPane.showMessageDialog(f, "CVV must be 3 digits");// create
																			// dialog
																			// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Payment Failed" + e1);
			}
		}
		if (e.getSource() == b2 && t6.getText().length() != 3) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				JOptionPane.showMessageDialog(f, "Card Number must be 16 digits");// create
																					// dialog
																					// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Payment Failed" + e1);
			}

		}
		if (e.getSource() == b2 && t5.getText().length() != 4) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				JOptionPane.showMessageDialog(f, "Exp. Date must be 4 digits");// create
																				// dialog
																				// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Payment Failed" + e1);
			}

		}

		if (e.getSource() == b2 && t3.getText().length() == 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				JOptionPane.showMessageDialog(f, "Enter the name on your Card");// create
																				// dialog
																				// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Payment Failed" + e1);
			}

		}

		if (e.getSource() == b3) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new Reservation();
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}

		}
		if (e.getSource() == b4) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new Main(); // go to main class
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}

		}
	}
}
