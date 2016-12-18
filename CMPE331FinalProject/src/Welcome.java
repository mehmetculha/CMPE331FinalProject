import java.awt.*;
import javax.swing.*;

class Welcome implements Runnable {
	JFrame f;
	JLabel l1, l2;
	Main m;
	Thread t;

	Welcome() {

		t = new Thread(this);// thread is created
		f = new JFrame("Welcome");// new java frame
		f.getContentPane().setLayout(null);
		f.getContentPane().setBackground(Color.black);
		l1 = new JLabel("BUS TICKET RESERVATION");// Labels named
		l1.setBounds(175, 300, 900, 50);
		l1.setFont(new Font("Courier new", Font.BOLD, 60));
		l1.setForeground(Color.red);
		l2 = new JLabel("MEHMET CULHA & ALPEREN HALEFOGLU");
		l2.setFont(new Font("Courier new", Font.BOLD, 35));
		l2.setBounds(250, 380, 800, 40);
		l2.setForeground(Color.red);

		f.getContentPane().add(l1);
		f.getContentPane().add(l2);

		f.setSize(1300, 1000);
		f.setVisible(true);
		t.start();
	}

	public void run() {// this method arranges welcome screens duration
		int x = 1;
		while (x <= 5) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			x++;
		}
		f.setVisible(false);
		m = new Main();// After 5 seconds Main class is called
	}
}
