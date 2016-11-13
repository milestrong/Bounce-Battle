package proj.character;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public abstract class Character {
	
	protected float x;
    protected float y;
    protected Image sprite;
    
    public Character(float x, float y) throws SlickException{
    	this.x = x;
    	this.y = y;
    	sprite = new Image("res/img/chars/red_ball.png");
    }
    
    public float getX(){
    	return x;
    }
    
    public float getY(){
    	return y;
    }
    
    public void render(){
        sprite.draw(x-2,y-2);
    }
}
