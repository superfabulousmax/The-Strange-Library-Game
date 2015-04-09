package myLibraryThatIsStrangeDesu;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/** 
 * Creates the container
 * @author Sinead
 *
 */
public class Main {

	public static void main(String args[]) throws SlickException
	{
		AppGameContainer container = new AppGameContainer(new Game("Sinead"));
		container.setDisplayMode(800, 600,false);
		container.start();
	}
	
}
