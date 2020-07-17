import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestifJLabelworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JLabel l = new JLabel();
		l.setFont(new Font("Arial", Font.PLAIN, 120));
		l.setBounds(100, 0, 600, 200);
		l.setText("i'm a label");
		JFrame f = new JFrame ("I'm a frame");
		f.setLayout(null);
		f.setBounds(0, 0, 800, 800);
		f.add(l);
		f.setVisible(true);
		
		for (int i=0; i<100; i++) {
		int starter = (int) (Math.random() * 2);
		if (starter==0) {System.out.println("Player X is starting");}
    	else {System.out.println("Player O is starting");}
		System.out.println(starter);}
	}

}
