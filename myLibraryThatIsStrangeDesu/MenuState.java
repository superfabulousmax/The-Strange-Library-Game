package myLibraryThatIsStrangeDesu;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Strange Menu Desu
 * @author Sinead
 * <*^v^*>
 */
public class MenuState extends BasicGameState{
	Image foreground;
	Image background;
	Image eyes;
	Animation eyeA;
	
	float totalTime;
	
	public void init(GameContainer container, StateBasedGame game)
			throws SlickException {
		
		foreground = new Image("resources/TheStrangeLibraryMenu.jpg");
		background = new Image("resources/carnivalMenu.jpg");
		eyes = new Image("resources/eyesMenu.GIF");
		
		SpriteSheet eyeSheet = new SpriteSheet(new Image("resources/eyesSheet.jpg"), 500, 281);
		eyeA = new Animation(eyeSheet, 250);
		
		totalTime = 0;
	}
	
	
	public void update(GameContainer container, StateBasedGame game, int delta)
			throws SlickException {
		
		totalTime += delta/1000.0f;
		eyeA.update(delta);
	}



	
	public void render(GameContainer container, StateBasedGame game, Graphics g)
			throws SlickException {
		foreground.setRotation((float) Math.sin(totalTime) * 5.0f);
		background.draw(0,0,800,600);
		
//		eyes.draw(600, 500, 200, 100);
		eyeA.draw(600, 500, 200, 100);
		foreground.draw(0, 0, 700, 500);
	
		
	}

	/**
	 * Each state has unique id
	 */
	
	public int getID() {
		
		return -1;
	}
	
}
