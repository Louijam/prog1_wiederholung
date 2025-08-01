package Aufgabe_7; /*
 * ---------------------------------------------------------------------------
 * Vorlesung: Programmieren 1
 * Thema:     Beispiel für eine GUI mit Slick2D
 *
 * ---------------------------------------------------------------------------


import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Image;
import org.newdawn.slick.Color;


// class 
public class MyFirstGame extends BasicGame {

	static final int WIDTH = 640;
    static final int HEIGHT = 480;
    static final int FPS = 50;
	static boolean showFPS = false;
	static boolean fullscreen = false;

	private Input input;


	// constructor
	public MyFirstGame(String gamename) {
		super(gamename);
	}


	// init game (only called once)
	@Override
	public void init(GameContainer gc) throws SlickException {
		this.input = gc.getInput();
	}


	// udpate game logic
	@Override
	public void update(GameContainer gc, int i) throws SlickException {
		// exit game
		if (this.input.isKeyPressed(Input.KEY_ESCAPE)) {
			System.exit(0);
		}
	}


	// render scene
	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
	}


	// main method
	public static void main(String[] args) {
		try {
			AppGameContainer app;
			app = new AppGameContainer(new MyFirstGame("My First Game"));
			app.setDisplayMode(WIDTH, HEIGHT, fullscreen);
			app.setTargetFrameRate(FPS);
			app.setShowFPS(showFPS);
			app.start();
			
		} catch (SlickException ex) {
			Logger.getLogger(MyFirstGame.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
*/