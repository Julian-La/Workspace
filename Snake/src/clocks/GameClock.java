package clocks;

import game.Snake;
import actions.Collision;

public class GameClock extends Thread {
	public static boolean running = true;
	public void run() {
		while(running) {
			try {
				sleep(Math.min(120+Snake.score*10, 350));
				Snake.move();
				Snake.waitToMove = false;
				Collision.collideBounty();
				Collision.collideTrap();
				if(Collision.collideSelf() == true) {
					Snake.tails.clear(); //Tails will be set to 0.
					Snake.score = 0;
				}
				if(Collision.collideWall() == true) {
					Snake.tails.clear(); //Tails will be set to 0.
					Snake.head.setX(7); 
					Snake.head.setY(7);
					Snake.score = 0;
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
				System.err.println("sleep(200) in class GameClock did not work!");
			}
			
		}
	}

}
