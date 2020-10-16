package game;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import gui.GUI;

public class Snake {
	public static int score = 0, bestscore = 0;
	public static boolean waitToMove = false; //Prevents head from moving backwards. 
	public static Head head = new Head(7,7);
	public static List<Tail> tails = new ArrayList<>();
	public static Bounty bounty = new Bounty();
	public static Trap trap = new Trap();
	public static void addTail() { //"We don't need an object class for snake, because we only have one snake."
		if (tails.size()<1) {
			tails.add(new Tail(head.getX(),head.getY())); //??? Is Tail inside Head?
		} else {
			tails.add(new Tail(tails.get(tails.size()-1).x,tails.get(tails.size()-1).y)); //Adds new Tail to ArrayList, just one Tail behind the last one.
		}
	}
	public static void removeTail() { //"We don't need an object class for snake, because we only have one snake."
		if (tails.size()<1) {
			Snake.tails.clear(); //Tails will be set to 0.
			Snake.head.setX(7); 
			Snake.head.setY(7);
			Snake.score = 0;
		} else if (tails.size()==1){
			Snake.tails.clear();
		}
			else {
			tails.remove(1); 
		}
	}
	public static void move() {
		//Move tails
		if(tails.size()>=2) {
			for(int i = tails.size()-1; i>=1;i--) {
				if(tails.get(i).isWait()) {
					tails.get(i).setWait(false);
				}
					else {
						tails.get(i).setX(tails.get(i-1).getX());
						tails.get(i).setY(tails.get(i-1).getY());
					}
			}
		}
		//Move first tail to head
		if(tails.size()>=1) {
			if(tails.get(0).isWait()) {
				tails.get(0).setWait(false);
			}
				else {
					tails.get(0).setX(head.getX());
					tails.get(0).setY(head.getY());
				}
		}
		//Move head
		switch(head.getDir()){
		case RIGHT: head.setX(head.getX()+1);
		break;
		case UP: head.setY(head.getY()-1);
		break;
		case LEFT: head.setX(head.getX()-1);
		break;
		case DOWN: head.setY(head.getY()+1);
		break;
		}

	}
	//position to cordinates
	public static Point ptc(int x, int y) {
		Point p = new Point(0,0);
		p.x = x*32+GUI.xoff;
		p.y = y*32+GUI.yoff;
		return p;
	}
	
}
