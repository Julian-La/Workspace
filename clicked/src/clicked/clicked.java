package clicked;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class clicked {

	public static void main(String[] args) {

		JFrame f=new JFrame("Button Example");
		f.setSize(600,600);  
		f.setLayout(null);  
		f.setVisible(true);
	
		JButton buttonOne = new JButton("Click me!");
		boolean hasBeenClicked = false;		
		buttonOne.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		        if (! hasBeenClicked) {
		        	 buttonOne.setText("I've been clicked!");
		        }         
		    }
		}); 
		f.add(buttonOne);
		buttonOne.setBounds(100, 200, 400, 100);
		
	}
}

	



