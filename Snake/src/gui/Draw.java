package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import javax.swing.JLabel;

import game.Snake;

public class Draw extends JLabel{
	Point p; 
	protected void paintComponent(Graphics g) { //Why can i fill that with "Graphics g". How does this method know "Graphics g"?
		super.paintComponent(g); //?????????????
		Graphics2D g2d = (Graphics2D) g; //??????????
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF); //?????
		
		//Draw Background
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, GUI.width, GUI.height); //?????????
		
		//Draw Snake tails
		g.setColor(new Color(255,216,0));
		for(int i = 0; i<Snake.tails.size(); i++) {
			p = Snake.ptc(Snake.tails.get(i).getX(), Snake.tails.get(i).getY());
			g.fillRect(p.x, p.y, 32, 32);
		}
		//Draw Snake head
		g.setColor(new Color(255,7,20));
		p = Snake.ptc(Snake.head.getX(),Snake.head.getY());
		g.fillRect(p.x, p.y, 32, 32);
		
		//Draw Grid
		g.setColor(Color.GRAY);
		for (int i = 0; i<16; i++) {
			for (int j = 0; j<16; j++) {
				g.drawRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		//Draw Walls
		g2d.setColor(new Color(0,127,14));
		for (int i = 0; i<4; i++) {
			for (int j = 6; j<7; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 12; i<16; i++) {
			for (int j = 3; j<4; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 3; i<4; i++) {
			for (int j = 7; j<8; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 14; i<15; i++) {
			for (int j = 2; j<3; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 11; i<12; i++) {
			for (int j = 11; j<16; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 4; i<5; i++) {
			for (int j = 11; j<13; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 2; i<4; i++) {
			for (int j = 12; j<13; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 10; i<12; i++) {
			for (int j = 8; j<9; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32); //Should move sideways. 
			}
		}
		for (int i = 3; i<4; i++) {
			for (int j = 0; j<3; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 4; i<6; i++) {
			for (int j = 2; j<3; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 5; i<6; i++) {
			for (int j = 3; j< 4; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32);
			}
		}
		for (int i = 14; i<15; i++) {
			for (int j = 13; j< 14; j++) {
				    g2d.fillRect(i*32+GUI.xoff, j*32+GUI.yoff, 32, 32); //Should move up and down.
			}
		}
		
		//Draw Bounty
				g.setColor(new Color(255,0,225));
				p = Snake.ptc(Snake.bounty.getX(), Snake.bounty.getY());
				g.fillRect(p.x, p.y, 32, 32);
				
		//Draw Trap
				g.setColor(new Color(8,0,255));
				p = Snake.ptc(Snake.trap.getX(), Snake.trap.getY());
				g.fillRect(p.x, p.y, 32, 32);
				
		//Draw Border
		g.setColor(new Color(0,127,14));
		g.drawRect(GUI.xoff, GUI.yoff, 512, 512);
		
		//Draw Score
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("SCORE "+ Snake.score, 5, 25);
		g.drawString("BEST "+ Snake.bestscore, 670, 25);
		
		repaint();
	}
}
