package clicked;

import javax.swing.*;
import java.awt.event.*; 

public class Clickprogram extends JFrame {

public static void main(String[] args) {
	new Clickprogram();
} 
	private class Clicklistener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	    	if(! (e.getSource() instanceof JButton)) return;
	    }
	}
	
	private JButton button1;
	private JLabel lab;
	private JFrame f;    
	
	public Clickprogram(){
	f.setLayout(null);       
	f.setSize(1000,1000);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Click Event");
	lab.setText("Test");
	lab.setBounds(100, 300, 200, 100);
	        
	Clicklistener click= new Clicklistener();
	
	button1= new JButton ("Click Me!");
	button1.setBounds(150,100,150,150);
	button1.addActionListener(click);
	f.add(button1);
	f.add(lab);
	
	f.setVisible(true);
	}
	
	
}