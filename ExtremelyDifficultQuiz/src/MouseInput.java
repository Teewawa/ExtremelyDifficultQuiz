package src;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import src.Game.STATE;

public class MouseInput implements MouseListener {

	private Menu menu;
	private Graphics g;
	private Graphics2D g2d;
	private Game game;
	private Correct correct;
	
	public MouseInput(Menu m, Game game, Correct correct){
		menu=m;
		this.game = game;
		this.correct = correct;
	}

	@Override
	public void mouseClicked(MouseEvent e) {


	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		/** 	
			 	public Rectangle startBtn = new Rectangle((Game.WIDTH-200)/2, 400,200,100);
				public Rectangle soundBtn = new Rectangle(Game.WIDTH-225, 825,100,50); 
		 */

		int mx = e.getX();
		int my=e.getY();
		
		
		
		if (game.state == Game.STATE.MENU){
			if(mx>=(Game.WIDTH-200)/2 && mx <= (Game.WIDTH-200)/2+200){
				if(my >= 400 && my <= 500){
					//Click on Play Button
					System.out.println("CLICK");
					menu.setClick();
					game.state = Game.STATE.Q1;
				}
			}
			if(mx>=(Game.WIDTH-225) && mx <= (Game.WIDTH-100)){
				if(my >= 825 && my <= 875){
					//Click on sound Button
					menu.setSound();
				}
			}
		}
		
		
		if (game.state == Game.STATE.Q1){
			if(mx >= 100 && mx <= 900){
				if(my >= 250 && my <= 350){
					System.out.println("wrong");
				}
				else if(my >= 400 && my <= 500){
					System.out.println("wrong2");
				}
				else if(my >= 550 && my <= 650){
					System.out.println("Right!!");
					game.state = Game.STATE.CORRECT;
					correct.setPrevious(1);
				}
				else if(my >= 700 && my <= 500){
					System.out.println("wrong3");
				}
			}
		}

		
		if (game.state == Game.STATE.Q2){
			if(mx >= 100 && mx <= 900){
				if(my >= 250 && my <= 350){
					System.out.println("wrong");
				}
				else if(my >= 400 && my <= 500){
					System.out.println("wrong2");
				}
				else if(my >= 550 && my <= 650){
					System.out.println("Right!!");
					game.state = Game.STATE.CORRECT;
					correct.setPrevious(2);
				}
				else if(my >= 700 && my <= 500){
					System.out.println("wrong3");
				}
			}
		}
		
		if (game.state == Game.STATE.Q3){
			if(mx >= 100 && mx <= 900){
				if(my >= 250 && my <= 350){
					System.out.println("wrong");
				}
				else if(my >= 550 && my <= 650){
					System.out.println("wrong2");
				}
				else if(my >= 400 && my <= 500){
					System.out.println("Right!!");
					game.state = Game.STATE.CORRECT;
					correct.setPrevious(3);
				}
				else if(my >= 700 && my <= 500){
					System.out.println("wrong3");
				}
			}
		}
		

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		int mx = e.getX();
		int my=e.getY();
	
		if(mx>=(Game.WIDTH-200)/2 && mx <= (Game.WIDTH-200)/2+200){
			if(my >= 400 && my <= 500){
				//Click on Play Button
				System.out.println("CLICK");
				menu.setClick();
				game.state = Game.STATE.Q1;
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}


}