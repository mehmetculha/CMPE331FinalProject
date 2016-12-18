import java.awt.*;
import java.awt.event.*;

import java.io.File;

import javax.swing.*;

class Cancellation implements ActionListener {
	JFrame f;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, la;
	JTextField t1, t2, t3, t4, t5, t6, t7;
	JButton b1, b2;
	JTextArea ta;

	File file1 = new File("data.txt"); // create files to read and delete
	File file2 = new File("delete.txt");

	@SuppressWarnings("deprecation")
	Cancellation() {
		// create frame,labels,textfields,buttons and textarea
		f = new JFrame("Cancellation");
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.darkGray);
		l1 = new JLabel("Enter Your Person ID:");
		l1.setForeground(Color.white);
		l1.setBounds(50, 90, 150, 30);

		b1 = new JButton("Cancel Reservation");

		b1.addActionListener(this);
		b1.setBounds(150, 280, 150, 30);
		b2 = new JButton("Return to Main Menu");

		b2.addActionListener(this);
		b2.setBounds(310, 280, 150, 30);

		t1 = new JTextField(10);
		t1.addActionListener(this);
		t1.setBounds(180, 90, 100, 30);

		ta = new JTextArea(5, 10);
		ta.setBounds(150, 170, 300, 70);
		la = new JLabel("Information:");
		ta.disable();

		la.setForeground(Color.white);
		la.setBounds(50, 170, 100, 30);
		// add all gui stataments
		f.getContentPane().add(l1);
		f.getContentPane().add(b1);
		f.getContentPane().add(t1);
		f.getContentPane().add(ta);
		f.getContentPane().add(la);
		f.getContentPane().add(b2);
		f.setSize(1300, 1000);

		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {// when button1 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				ta.setText("Your reservation is cancelled. " + "\n" + "Your money will be paid back within 2 weeks");
				JOptionPane.showMessageDialog(f, "Reservation Cancelled");// create
																			// dialog
																			// message

			} catch (Exception e1) {

			}
		}
		if (e.getSource() == b2) {// when button2 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new Main(); // go to main class
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}
		}
	}

	public static void main(String args[]) { // main method that calls
												// cancellation object
		new Cancellation();
	}
}
