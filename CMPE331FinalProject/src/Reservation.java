import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import javax.swing.*;

class Reservation implements ActionListener {
	JFrame f;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
	JTextField t1, t2, t3, t4, t5, t6, t15;
	JTextArea t14;
	Choice h1, h2, h3, h4, h5, h6, h7;
	JTextArea ta;

	JButton b2, b3;
	int a = 0;

	File file1 = new File("data.txt");

	Reservation() {

		f = new JFrame("Reservation:"); // frame created
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.darkGray);
		l1 = new JLabel("Name:"); // labels are created
		l1.setForeground(Color.white);
		l1.setBounds(50, 50, 100, 30);
		l2 = new JLabel("Surname:");
		l2.setForeground(Color.white);
		l2.setBounds(50, 80, 100, 30);
		l3 = new JLabel("Age:");
		l3.setForeground(Color.white);
		l3.setBounds(50, 110, 100, 30);
		l4 = new JLabel("Gender:");
		l4.setForeground(Color.white);
		l4.setBounds(50, 140, 100, 30);
		l5 = new JLabel("Date of Journey:");
		l5.setForeground(Color.white);
		l5.setBounds(50, 260, 100, 30);
		h5 = new Choice();
		h5.setBounds(150, 260, 100, 30);
		h5.add("1"); // give value for choice that represents day of month
		h5.add("2");
		h5.add("3");
		h5.add("4");
		h5.add("5");
		h5.add("6");
		h5.add("7");
		h5.add("8");
		h5.add("9");
		h5.add("10");
		h5.add("11");
		h5.add("12");
		h5.add("13");
		h5.add("14");
		h5.add("15");
		h5.add("16");
		h5.add("17");
		h5.add("18");
		h5.add("19");
		h5.add("20");
		h5.add("21");
		h5.add("22");
		h5.add("23");
		h5.add("24");
		h5.add("25");
		h5.add("26");
		h5.add("27");
		h5.add("28");
		h5.add("29");
		h5.add("30");
		h5.add("31");

		h6 = new Choice(); // create choice and give its value that represents
							// months
		h6.setBounds(250, 260, 100, 30);
		h6.add("January");
		h6.add("February");
		h6.add("March");
		h6.add("April");
		h6.add("May");
		h6.add("June");
		h6.add("July");
		h6.add("August");
		h6.add("September");
		h6.add("October");
		h6.add("November");
		h6.add("December");

		h7 = new Choice(); // create choice and give its value that represents
							// years
		h7.setBounds(350, 260, 100, 30);
		h7.add("2016");
		h7.add("2017");
		h7.add("2018");

		l6 = new JLabel("Origin:");
		l6.setForeground(Color.white);
		l6.setBounds(50, 290, 100, 30);
		h3 = new Choice();
		h3.setBounds(150, 300, 100, 30);
		h3.add("Istanbul");// create choice and give its value that represents
							// cities
		h3.add("Ankara");
		h3.add("Izmir");
		h3.add("Adana");
		h3.add("Antalya");
		h4 = new Choice();// create choice and give its value that represents
							// cities
		h4.setBounds(340, 300, 100, 30);
		h4.add("Istanbul");
		h4.add("Ankara");
		h4.add("Izmir");
		h4.add("Adana");
		h4.add("Antalya");

		l7 = new JLabel("Destination:"); // create labels
		l7.setForeground(Color.white);
		l7.setBounds(255, 290, 80, 30);
		l8 = new JLabel("Boarding Time:");
		l8.setForeground(Color.white);
		l8.setBounds(50, 320, 100, 30);

		h2 = new Choice(); // create choice and give its value that represents
							// hours
		h2.setBounds(150, 330, 100, 30);
		h2.add("06:00");
		h2.add("12:00");
		h2.add("19:00");
		h2.add("22:00");

		t1 = new JTextField(10); // create textbox
		t1.setBounds(150, 50, 100, 30);
		t2 = new JTextField(10);

		t2.setBounds(150, 80, 100, 30);
		t3 = new JTextField(10);
		t3.setBounds(150, 110, 100, 30);
		// t4 = new JTextField(10);
		// t4.setBounds(150, 260, 100, 30);
		// t5 = new JTextField(10);
		// t5.setBounds(150, 290, 100, 30);
		// t6 = new JTextField(10);
		// t6.setBounds(320, 290, 100, 30);

		h1 = new Choice();// create choice and give its value that represents
							// genders
		h1.setBounds(150, 140, 100, 30);
		h1.add("Male");
		h1.add("Female");

		b2 = new JButton("Next"); // create buttons
		b2.setBackground(Color.white);
		b2.setBounds(160, 410, 100, 30);
		b2.addActionListener(this);
		b3 = new JButton("Menu");
		b3.setBackground(Color.white);
		b3.setBounds(270, 410, 100, 30);

		b3.addActionListener(this);

		t14 = new JTextArea(2, 3); // create labels and textboxes
		t14.setBounds(150, 170, 320, 70);
		l14 = new JLabel("Address:");
		l14.setForeground(Color.white);
		l14.setBounds(50, 170, 100, 30);

		l15 = new JLabel("Person ID(11 digit):");
		l15.setForeground(Color.white);
		l15.setBounds(260, 110, 150, 30);
		t15 = new JTextField(10);
		t15.setBounds(370, 110, 100, 30);

		f.getContentPane().add(l1);// buttons,labels,text fields,choices added
		f.getContentPane().add(l2);
		f.getContentPane().add(l3);
		f.getContentPane().add(l4);
		f.getContentPane().add(l5);
		f.getContentPane().add(l6);
		f.getContentPane().add(l7);
		f.getContentPane().add(l8);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		f.getContentPane().add(t3);

		f.getContentPane().add(h1);
		f.getContentPane().add(h2);
		f.getContentPane().add(h3);
		f.getContentPane().add(h4);
		f.getContentPane().add(h5);
		f.getContentPane().add(h6);
		f.getContentPane().add(h7);

		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(t14);
		f.getContentPane().add(l14);
		f.getContentPane().add(l15);
		f.getContentPane().add(t15);
		f.setSize(1300, 1000); // set frame size
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b2 && t15.getText().length() == 11 && t1.getText().length() != 0
				&& t2.getText().length() != 0 && t3.getText().length() != 0
				&& !h3.getSelectedItem().equals(h4.getSelectedItem())) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				String line1 = t1.getText();
				String line2 = t2.getText();
				String line3 = t3.getText();
				String line4 = t14.getText();
				String line5 = h5.getSelectedItem();
				String line16 = h6.getSelectedItem();
				String line17 = h7.getSelectedItem();
				String line9 = h1.getSelectedItem();
				String line6 = h2.getSelectedItem();
				String line7 = h3.getSelectedItem();
				String line8 = h4.getSelectedItem();
				String line10 = t15.getText();

				Writer wr1 = new FileWriter(file1.getAbsoluteFile(), true); // create
																			// writer
				String str1 = line10 + "," + line1 + "," + line2 + "," + line3 + "," + line9 + "," + line4 + "," + line5
						+ "," + line16 + "," + line17 + "," + line6 + "," + line7 + "," + line8;
				wr1.write(System.getProperty("line.separator"));
				wr1.write(str1); // write our string into text file

				wr1.flush();
				wr1.close();

				b2.setEnabled(false);
				f.setVisible(false);
				new Payment(); // go payment class
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}

		}
		if (e.getSource() == b2 && t15.getText().length() != 11) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				JOptionPane.showMessageDialog(f, "Person ID must be 11 digits"); // create
																					// dialog
																					// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}
		}

		if (e.getSource() == b2 && t1.getText().length() == 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				JOptionPane.showMessageDialog(f, "Enter your name");// create
																	// dialog
																	// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}
		}
		if (e.getSource() == b2 && t2.getText().length() == 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				JOptionPane.showMessageDialog(f, "Enter your surname");// create
																		// dialog
																		// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}

		}
		if (e.getSource() == b2 && t3.getText().length() == 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				JOptionPane.showMessageDialog(f, "Enter your age");// create
																	// dialog
																	// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}
		}
		if (e.getSource() == b2 && t14.getText().length() == 0) {
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				JOptionPane.showMessageDialog(f, "Enter your Address");// create
																		// dialog
																		// message
				f.setVisible(true);
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}
		}

		if (e.getSource() == b3) {// when button3 is clicked
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
												// reservation object
		new Reservation();
	}
}