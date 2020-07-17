import javax.swing.*;
import java.awt.Font;
import java.awt.event.*; 
/**
 * This represents a version of the game tic-tac-toe using a JFrame.
 * Nine activatable buttons where implemented. 
 * The Player's start is random.
 * Players turn will be announced by a label above all buttons.
 * Win- or draw situation will be announced.
 * After that, the player can click a restart button and play again.
 * 
 * Side note: You can also recreate the game using a JPanel, shortening source code.
 * Exit button will be implemented soon.
 */
public class TicTacToe {

	public static void main(String[] args) {
		new TicTacToe();
	}
	private static final String[] SYMBOLS= {"X","O"}; 
	private int offset;
	private int turns;
	private String winner;
	private JButton subButton1 = new JButton();
	private JButton subButton2 = new JButton();
	private JButton subButton3 = new JButton();
	private JButton subButton4 = new JButton();
	private JButton subButton5 = new JButton();
	private JButton subButton6 = new JButton();
	private JButton subButton7 = new JButton();
	private JButton subButton8 = new JButton();
	private JButton subButton9 = new JButton();
	private JButton restart;
	private JLabel resultLabel;
	private JLabel announcementLabel=new JLabel();
	
	private void initiate() {
		subButton1.setText("");
		subButton2.setText("");
		subButton3.setText("");
		subButton4.setText("");
		subButton5.setText("");
		subButton6.setText("");
		subButton7.setText("");
		subButton8.setText("");
		subButton9.setText("");
		
		subButton1.setVisible(true);
		subButton2.setVisible(true);
		subButton3.setVisible(true);
		subButton4.setVisible(true);	    		
		subButton5.setVisible(true);
		subButton6.setVisible(true);
		subButton7.setVisible(true);
		subButton8.setVisible(true);
		subButton9.setVisible(true);
		
	    subButton1.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton2.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton3.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton4.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton5.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton6.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton7.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton8.setFont(new Font("Arial", Font.PLAIN, 70));
	    subButton9.setFont(new Font("Arial", Font.PLAIN, 70));
	    
	    subButton1.setBounds(200,150,95,95);  	    
	    subButton2.setBounds(300,150,95,95);	      
	    subButton3.setBounds(400,150,95,95);	      
	    subButton4.setBounds(200,250,95,95);	     
	    subButton5.setBounds(300,250,95,95);	     
	    subButton6.setBounds(400,250,95,95);	      
	    subButton7.setBounds(200,350,95,95);
	    subButton8.setBounds(300,350,95,95);  
	    subButton9.setBounds(400,350,95,95);
	    
	    turns = 1;
		winner = null;
		offset = (int) (Math.random() * SYMBOLS.length);
	}	
	public TicTacToe(){			
		Clicklistener mouseclick= new Clicklistener();		
		announcementLabel.setFont(new Font("Arial", Font.PLAIN, 80));
		announcementLabel.setBounds(100, -10, 800, 200);
		resultLabel = new JLabel();
		resultLabel.setFont(new Font("Arial", Font.PLAIN, 120));
		
	    JFrame window=new JFrame("TicTocToe");  
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setBounds(400, 0, 800, 800);
	    window.setLayout(null);
	    initiate();
	    restart = new JButton("Play again?");	    
	    restart.setFont(new Font("Arial", Font.PLAIN, 70));
	    restart.setBounds(150,500,400,100);
	    restart.setVisible(false);
	    
	    subButton1.addActionListener(mouseclick);
	    subButton2.addActionListener(mouseclick);
	    subButton3.addActionListener(mouseclick);
	    subButton4.addActionListener(mouseclick);
	    subButton5.addActionListener(mouseclick);
	    subButton6.addActionListener(mouseclick);
	    subButton7.addActionListener(mouseclick);
	    subButton8.addActionListener(mouseclick);
	    subButton9.addActionListener(mouseclick);
	    
	    restart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				initiate();
	    		restart.setVisible(false);
	    		announcementLabel.setText("Turn player "+getSymbol());
			}
	    });	    
	    window.add(subButton1);
	    window.add(subButton2);
	    window.add(subButton3);
	    window.add(subButton4);
	    window.add(subButton5);
	    window.add(subButton6);
	    window.add(subButton7);
	    window.add(subButton8);
	    window.add(subButton9);
	    window.add(restart);	    
	    window.add(announcementLabel);
	    announcementLabel.setText("Turn player "+getSymbol());
	    window.setVisible(true);    
	}
	private String getSymbol() {
		return SYMBOLS[(turns -1 + offset) % SYMBOLS.length];
	}	
	private class Clicklistener implements ActionListener{
	    public void actionPerformed(ActionEvent e){
	    	if (! (e.getSource() instanceof JButton)) return;
	    	JButton button = (JButton) e.getSource();
	    	if (! button.getText().isEmpty()) return;
            button.setText(getSymbol());

	    	if ((subButton1.getText().equals("X") && subButton2.getText().equals("X") && subButton3.getText().equals("X")) || 
	    		(subButton4.getText().equals("X") && subButton5.getText().equals("X") && subButton6.getText().equals("X")) ||
	    		(subButton7.getText().equals("X") && subButton8.getText().equals("X") && subButton9.getText().equals("X")) ||
	    	
	    		(subButton1.getText().equals("X") && subButton4.getText().equals("X") && subButton7.getText().equals("X")) ||
	    		(subButton2.getText().equals("X") && subButton5.getText().equals("X") && subButton8.getText().equals("X")) ||
	    		(subButton3.getText().equals("X") && subButton6.getText().equals("X") && subButton9.getText().equals("X")) ||
	    	
	    		(subButton1.getText().equals("X") && subButton5.getText().equals("X") && subButton9.getText().equals("X")) ||
	    		(subButton3.getText().equals("X") && subButton5.getText().equals("X") && subButton7.getText().equals("X")) ||
	    	
	    		(subButton1.getText().equals("O") && subButton2.getText().equals("O") && subButton3.getText().equals("O")) ||
	    		(subButton4.getText().equals("O") && subButton5.getText().equals("O") && subButton6.getText().equals("O")) ||
	    		(subButton7.getText().equals("O") && subButton8.getText().equals("O") && subButton9.getText().equals("O")) ||
	    	
	    		(subButton1.getText().equals("O") && subButton4.getText().equals("O") && subButton7.getText().equals("O")) ||
	    		(subButton2.getText().equals("O") && subButton5.getText().equals("O") && subButton8.getText().equals("O")) ||
	    	 	(subButton3.getText().equals("O") && subButton6.getText().equals("O") && subButton9.getText().equals("O")) ||
	    	
	    	 	(subButton1.getText().equals("O") && subButton5.getText().equals("O") && subButton9.getText().equals("O")) ||
	    	 	(subButton3.getText().equals("O") && subButton5.getText().equals("O") && subButton7.getText().equals("O"))) {
	    		winner="Player "+getSymbol()+" won";
	    	} else if (turns==9) {
	    		winner="Draw!"; 
	    	} else {
	    		turns+=1;
	    		announcementLabel.setText("Turn player "+getSymbol());
	    	}
	    	if(winner!=null) {
	    		resultLabel.setText(winner) ;
	    		subButton1.setVisible(false);
	    		subButton2.setVisible(false);
	    		subButton3.setVisible(false);
	    		subButton4.setVisible(false);	    		
	    		subButton5.setVisible(false);
	    		subButton6.setVisible(false);
	    		subButton7.setVisible(false);
	    		subButton8.setVisible(false);
	    		subButton9.setVisible(false);
	    		announcementLabel.setText(winner);
	    		restart.setVisible(true);
	    	}	
	    }
	}
}
 



