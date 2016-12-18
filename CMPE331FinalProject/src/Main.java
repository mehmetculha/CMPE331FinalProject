import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main implements ActionListener {
	JFrame f;
	JButton b1, b2, b3, b4;
	Reservation r;
	Contact q;
	Cancellation c;

	Main() {

		f = new JFrame("Main");
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		b1 = new JButton("Reservation");// buttons initialized
		b1.addActionListener(this);
		b1.setBounds(150, 390, 210, 60);
		b2 = new JButton("Contact");
		b2.addActionListener(this);
		b2.setBounds(150, 490, 210, 60);
		b3 = new JButton("Cancellation");
		b3.addActionListener(this);
		b3.setBounds(580, 390, 210, 60);
		b4 = new JButton("Exit");
		b4.addActionListener(this);
		b4.setBounds(580, 490, 210, 60);

		f.getContentPane().add(b1);// buttons are added
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);

		f.setSize(1300, 1000);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {// when b1 button is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				f.setVisible(false);// Frame is closed
				r = new Reservation();// reservation is called
			} catch (Exception e1) {
				System.out.println("Reservation failed" + e1);
			}
		}
		if (e.getSource() == b2) {// when b2 button is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				f.setVisible(false);// Frame is closed
				q = new Contact();
			} catch (Exception e1) {
				System.out.println("Contact failed" + e1);
			}
		}
		if (e.getSource() == b3) {// when b3 button is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				f.setVisible(false);// Frame is closed
				c = new Cancellation();// cancellation is called
			} catch (Exception e1) {
				System.out.println("Cancellation failed" + e1);
			}
		}
		if (e.getSource() == b4) {// when b4 button is clicked
			try {// for execute program without failure, codes surrounded by
					// try-catch statement
				f.setVisible(false);// Frame is closed
				System.exit(0);
			} catch (Exception e1) {
				System.out.println("Exit failed" + e1);
			}
		}
	}

	public static void main(String args[]) { // main method that calls main
												// object
		new Main();
	}
}
