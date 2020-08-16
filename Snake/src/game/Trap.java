package game;

import java.util.concurrent.ThreadLocalRandom;

public class Trap {
	int x,y;

	public Trap() {
		definePosition();				
	}
	
	public void definePosition() {
		do {
			this.x = ThreadLocalRandom.current().nextInt(0,15);
			this.y = ThreadLocalRandom.current().nextInt(0,15);
		} while(isPositionedInWall());
	}
	
	private boolean isPositionedInWall() {
		 return (this.x==3 && this.y==7) ||
				(this.x<4 && this.y==6) ||
				(this.x<16 && this.x>=12 && this.y==3) ||
				(this.x==14 && this.y==2) ||
				(this.x==3 && this.y<3) ||
				(this.x<6 && this.x>=4 && this.y==2) ||
				(this.x==5 && this.y==3) ||
				(this.x<12 && this.x>=10 && this.y==8) ||
				(this.x<5 && this.x>1 && this.y==12) ||
				(this.x==4 && this.y==11) ||
				(this.x==11 && this.y>10 && this.y<16) ||
				(this.x==14 && this.y==13);
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
		
}