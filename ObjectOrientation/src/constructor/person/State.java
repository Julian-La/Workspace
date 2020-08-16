package constructor.person;

public class State {

	public static void main(String[] args) {
		
		/* The state determines the program's condition.
		 * This includes all variables and methods used in e.g. the main method. 
		 * The higher a variable's and method's count in one program, the worse it's condition becomes.
		 * All redundant variables and methods are called overhead and can be shortened by the usage of superior classes.
		 */
		 String player1Name = "Max";
		 int player1Cards = 12;
		 String player2Name= "Paul";
		 int player2Cards = 13;
		 
		 player1Cards--;
		 player2Cards--;
		 
		 System.out.println(player1Cards);
		 

	}

}
