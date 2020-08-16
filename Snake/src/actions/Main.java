package actions;

import clocks.GameClock;
import game.Snake;
import gui.GUI;

public class Main {

	public static void main(String[] args) {
		GUI g = new GUI();
		GameClock gc = new GameClock();
		g.create();
		gc.start(); 
		while(GameClock.running) {
		System.out.println(Snake.tails.size());
		}
	}

}
