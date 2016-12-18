import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import javax.swing.*;

class Contact implements ActionListener {
	JFrame f;
	JLabel l1, l2;
	JTextField t;
	JTextArea ta;

	JButton b1, b2;
	File file4 = new File("contact.txt"); // create file to write in it

	Contact() {
		// create frame, labels, textfield, buttons and textarea
		f = new JFrame("CONTACT");
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.darkGray);
		l1 = new JLabel("PNR No");
		l1.setForeground(Color.WHITE);
		l1.setBounds(50, 50, 60, 30);
		l2 = new JLabel("Complaint & Suggestions");
		l2.setForeground(Color.WHITE);
		l2.setBounds(50, 80, 150, 30);
		t = new JTextField(10);
		t.addActionListener(this);
		t.setBounds(110, 50, 150, 30);
		ta = new JTextArea(2, 3);
		ta.setBounds(50, 110, 390, 180);
		b1 = new JButton("Send");
		b1.addActionListener(this);
		b1.setBounds(70, 300, 100, 30);
		b2 = new JButton("Return to Main menu");
		b2.addActionListener(this);
		b2.setBounds(210, 300, 170, 30);
		// add all gui statements that we created
		f.getContentPane().add(l1);
		f.getContentPane().add(l2);//label l2
		f.getContentPane().add(t);//textbox t
		f.getContentPane().add(ta);//textarea ta
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);

		f.setSize(1300, 1000);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {// when button1 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				Writer wr = new FileWriter(file4); // create writer
				String line1 = ta.getText();
				String line2 = t.getText();
				String str = line2 + " " + line1;
				wr.write(str);
				wr.write(System.getProperty("line.separator"));

				wr.flush();
				wr.close();
				JOptionPane.showMessageDialog(f, "your message has been sent");// create
																				// dialog
																				// message

			}

			catch (Exception e1) {
				System.out.println("Cancellation failed:" + e1);
			}
		}
		if (e.getSource() == b2) {// when button2 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new Main();// go to main class
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}
		}
	}

	public static void main(String args[]) { // main method that calls contact
												// object
		new Contact();//contact is executed
	}
}
