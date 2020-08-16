
public class TicTocToe_Logic {

	public static void main(String[] args) {

		//TicTocToe Pre-Game Logic
		//*_|_|_
		//*_|_|_
		//*_|_|_

		int [][] game = {
				{1,2,1},
				{1,1,2},
				{1,2,2}
		};
		int playerwon=0;
		for(int v=0; v<3;v++) {
				if(game[v][0]!=0 && game[v][0] == game[v][1] && game[v][0] == game[v][2]) {
				playerwon=game[v][0];	
				}}
		if (playerwon == 0) {System.out.println("Nobody won by lines.");}
		else if(playerwon == 1) {System.out.println("Player 1 won by lines.");}
		else System.out.println("Player 2 won by lines.");
		for(int v=0; v<3;v++) {
				if(game[0][v]!=0 && game[0][v] == game[1][v] && game[0][v] == game[2][v]) {
				playerwon=game[0][v];	
				}}
		if (playerwon == 0) {System.out.println("Nobody won by columns.");}
		else if(playerwon == 1) {System.out.println("Player 1 won by columns.");}
		else System.out.println("Player 2 won by columns.");
		for(int v=0; v<3;v++) {
			if(game[0][0]!=0 && game[0][0] == game[1][1] && game[0][0] == game[2][2]) {
			playerwon=game[0][0];	
			}
			if(game[0][2]!=0 && game[0][2] == game[1][1] && game[0][2] == game[2][0]) {
			playerwon=game[0][2];
			}
		}
		if (playerwon == 0) {System.out.println("Nobody won.");}
		else if(playerwon == 1) {System.out.println("Player 1 won.");}
		else System.out.println("Player 2 won");
		
		
	}
}


