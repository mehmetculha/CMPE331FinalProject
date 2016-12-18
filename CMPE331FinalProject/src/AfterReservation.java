import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AfterReservation implements ActionListener {

	JFrame f;
	JLabel l1, la, l3;
	JTextArea ta;
	JTextField t1;
	JButton b1, b2;

	@SuppressWarnings("deprecation")
	public AfterReservation() {

		File file1 = new File("data.txt"); // create file to read datas from
											// text file

		f = new JFrame("Reservation Summary");
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.darkGray);
		Random rnd = new Random(); // create random number to generate pnr
									// number
		int x = rnd.nextInt(10000) + 20000;
		String pnr = String.valueOf(x); // change pnr number type to string
		// create labels,buttons, textfields and textarea
		l1 = new JLabel("Your PNR No:");
		l1.setForeground(Color.white);
		l1.setBounds(50, 100, 100, 30);
		t1 = new JTextField(10);
		t1.setBounds(200, 100, 100, 30);
		t1.disable();

		t1.setText(pnr);
		ta = new JTextArea(2, 3);
		ta.setBounds(200, 170, 800, 70);
		ta.setForeground(Color.BLACK);
		la = new JLabel("Journey Information:");
		la.setForeground(Color.white);
		la.setBounds(50, 170, 150, 30);
		ta.disable();
		l3 = new JLabel("HAVE A GOOD JOURNEY :)");
		l3.setForeground(Color.white);

		l3.setBounds(450, 250, 150, 40);
		b1 = new JButton("Return to Main Menu");
		b1.setBackground(Color.white);
		b1.setBounds(200, 300, 200, 30);
		b1.addActionListener(this);

		b2 = new JButton("EXIT");
		b2.setBackground(Color.white);
		b2.setBounds(400, 300, 100, 30);
		b2.addActionListener(this);

		try {// for execute program without failure, codes surrounded by
				// try-catch statement

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(file1); // create scanner to read
			while (sc.hasNextLine()) {
				String line1 = sc.nextLine();
				ta.setText(line1);

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		// add all gui statements
		f.getContentPane().add(l1);
		f.getContentPane().add(t1);
		f.getContentPane().add(ta);
		f.getContentPane().add(la);
		f.getContentPane().add(l3);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);

		f.setSize(1300, 1000);
		f.setVisible(true);

	}

	public static void main(String[] args) {// main method that calls
											// afterreservation object
		new AfterReservation();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {// when button1 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				new Main(); // go to main class
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}
		}
		if (e.getSource() == b2) {// when button2 is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement

				f.setVisible(false);
				System.exit(0); // exit
			} catch (Exception e1) {
				System.out.println("Error" + e1);
			}
		}

	}
}
