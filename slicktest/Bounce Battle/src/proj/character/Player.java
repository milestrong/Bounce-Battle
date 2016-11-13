package proj.character;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Player extends Character{

	public Player(float x, float y) throws SlickException {
		super(x, y);
		sprite = new Image("res/img/chars/red_ball.png");
	}

	public void moveLeft(int delta){
        x = x - (0.15f*delta);
    }
 
    public void moveRight(int delta){
        x = x + (0.15f*delta);
    }
}
