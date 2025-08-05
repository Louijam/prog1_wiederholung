/** ---------------------------------------------------------------------------
 * Vorlesung: Programmieren 1
 * Thema: Beispiel für eine GUI mit Slick2D
 * ------------------------------------------------------------------------------* **/


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.*;


// class
public class MyFirstGame extends BasicGame {

	static final int WIDTH = 640;
    static final int HEIGHT = 480;
    static final int FPS = 50;
	static boolean showFPS = false;
	static boolean fullscreen = false;

	private Input input;

	private int score;


    private Image background;
	private Player player;
	private final ArrayList<Ball> balls=new ArrayList<>();

	private int spawnCooldown=1000;
	private int timeSinceLastSpawn=0;
	private int maxBalls=10;





	// constructor
	public MyFirstGame(String gamename) {
		super(gamename);
	}


	// init game (only called once)
	@Override
	public void init(GameContainer gc) throws SlickException {
		this.input = gc.getInput();
		this.score=0;

		this.background = new Image("background.png").getScaledCopy(WIDTH, HEIGHT);

		this.player=new Player(WIDTH,HEIGHT,"spieler.png");


	}


	// udpate game logic
	@Override
	public void update(GameContainer gc, int i) throws SlickException {

		// exit game
		playerInput();
		ballSpawn(i);
		gameLogic();
		schwierigkeit();






	}


	// render scene
	@Override
	public void render(GameContainer gc, Graphics g){


		g.drawImage(background, 0, 0);


		for(Ball ball:balls){
			ball.render(g);
		}
		player.render(g);
		g.drawString("Score: " + score, 0, 0);




	}

	private void playerInput(){
		if (this.input.isKeyPressed(Input.KEY_ESCAPE)) {
			System.exit(0);
		}

        int playerSpeed = 10;
        if (this.input.isKeyDown(Input.KEY_LEFT)){
			player.moveLeft(playerSpeed);
		}
		if (this.input.isKeyDown(Input.KEY_RIGHT)){
			player.moveRight(playerSpeed);
		}
	}

	private void ballSpawn(int i) throws SlickException {
		timeSinceLastSpawn+=i;
		for (Ball ball:balls){
			ball.update();
		}
		balls.removeIf(Ball::isDestroyed);

		if (balls.size()<maxBalls&&timeSinceLastSpawn>=spawnCooldown){
			balls.add(new Ball(WIDTH,HEIGHT));
			timeSinceLastSpawn=0;
		}

	}
	private void gameLogic() {
		for (Ball ball : balls) {
			if (ball.isDestroyed()) continue; // skip zerstörte Bälle

			if (ball.hitboxHit(player.getHitbox())) {
				if (ball.getColor() == Color.red) {
					score += 90;
				} else {
					score -= 100;
				}
				ball.destroy();
			}
		}
	}

	private void schwierigkeit(){
		if (score<100)
				spawnCooldown=1000;

		if (score>200)
				spawnCooldown=500;
		if (score>400){
			spawnCooldown=100;
		}
		if (score>600){
			spawnCooldown=50;
		}
		if (score>=1000){
			maxBalls=20;
		}
	}


	// main method
	public static void main(String[] args) {
		try {
			AppGameContainer app;
			app = new AppGameContainer(new MyFirstGame("Galaxy-Ball"));
			app.setDisplayMode(WIDTH, HEIGHT, fullscreen);
			app.setTargetFrameRate(FPS);
			app.setShowFPS(showFPS);
			app.start();
			
		} catch (SlickException ex) {
			Logger.getLogger(MyFirstGame.class.getName()).log(Level.SEVERE, null, ex);
		}
		
	}
}
