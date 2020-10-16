package actions;

import game.Snake;

public class Collision {
	public static boolean collideSelf() {
		for(int i =0; i<Snake.tails.size();i++) {
			if(Snake.head.getX() == Snake.tails.get(i).getX() && Snake.head.getY() == Snake.tails.get(i).getY() 
					&& !Snake.tails.get(i).isWait()) {; //If you get a new tail you wait. As long as you wait, you can't collide with this tail.
			return true;
			} 
			
	}return false;}
	public static boolean collideWall() {
		if(Snake.head.getX()<0 || Snake.head.getX()>15 || Snake.head.getY()<0 || Snake.head.getY()>15) {return true;}
		if(Snake.head.getX()==3 && Snake.head.getY()==7) {return true;}
		if(Snake.head.getX()<4 && Snake.head.getY()==6) {return true;}
		if(Snake.head.getX()<16 && Snake.head.getX()>=12 && Snake.head.getY()==3) {return true;}
		if(Snake.head.getX()==14 && Snake.head.getY()==2) {return true;}
		if(Snake.head.getX()==3 && Snake.head.getY()<3) {return true;}
		if(Snake.head.getX()<6 && Snake.head.getX()>=4 && Snake.head.getY()==2) {return true;}
		if(Snake.head.getX()==5 && Snake.head.getY()==3) {return true;}
		if(Snake.head.getX()<12 && Snake.head.getX()>=10 && Snake.head.getY()==8) {return true;}
		if(Snake.head.getX()<5 && Snake.head.getX()>1 && Snake.head.getY()==12) {return true;}
		if(Snake.head.getX()==4 && Snake.head.getY()==11) {return true;}
		if(Snake.head.getX()==11 && Snake.head.getY()>10 && Snake.head.getY()<16) {return true;}
		if(Snake.head.getX()==14 && Snake.head.getY()==13) {return true;}
		return false;
		}
	public static void collideBounty() {
		if(Snake.head.getX()==Snake.bounty.getX()&&Snake.head.getY()==Snake.bounty.getY()) {
			Snake.bounty.definePosition();
			Snake.addTail();
			Snake.score+=1;
			if(Snake.score>Snake.bestscore) {
				Snake.bestscore = Snake.score;
			}
		}
	}
	public static void collideTrap() {
		if(Snake.head.getX()==Snake.trap.getX()&&Snake.head.getY()==Snake.trap.getY()) {
			Snake.trap.definePosition();
			Snake.removeTail();
			if (Snake.score!=0) {
			Snake.score-=1;
			}
			if(Snake.score>Snake.bestscore) {
				Snake.bestscore = Snake.score;
			}
		}
	}
}
