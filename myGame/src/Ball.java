import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Rectangle;


import java.util.Random;

public class Ball {
    private final int height;
    private Color color;
    private int speed;
    private int positionX;
    private int positionY;
    private final int durchmesser=40;

    private Image image;

    private boolean destroyed= false;

    private final Circle hitbox;




    public Ball(int WIDTH, int HEIGHT) throws SlickException {
        this.height = HEIGHT;
        initColor();
        initSpeed();
        initPos(WIDTH);
        initImage();
        hitbox = new Circle(positionX+((float)durchmesser/2),positionY, (float) durchmesser /2);
    }



    private void initSpeed() {
        int [] pace={5,7,10};
        Random r = new Random();
        speed = pace[r.nextInt(pace.length)];
    }

    private void initColor(){
        Color[] farben={
                Color.red,
                Color.black,
                Color.blue,
                Color.green,
                Color.orange
        };
        Random r=new Random();
        this.color=farben[r.nextInt(farben.length)];
    }

    private void initPos(int WIDTH) {

        Random r=new Random();
        positionX=r.nextInt(WIDTH-durchmesser);
        positionY= -durchmesser;


    }
    private void initImage() throws SlickException {
        image=new Image(durchmesser,durchmesser);
        Graphics g=image.getGraphics();
        g.setColor(color);
        g.fillOval(0,0,durchmesser,durchmesser);
        g.flush();
    }


    public void update() {
        positionY += speed;
        hitbox.setY(positionY);

        // nur Bodencheck hier!
        if (positionY > (height - durchmesser)) {
            destroy();
        }
    }






    public void render(Graphics g) {
        g.drawImage(image,positionX,positionY);

    }
    public boolean hitboxHit(Rectangle hitboxPlayer){
        return hitboxPlayer.intersects(hitbox);
    }

    public void destroy(){
        destroyed=true;
    }


    public int getSpeed() {
        return speed;
    }
    public Color getColor() {
        return color;
    }
    public int getPositionX() {
        return positionX;
    }
    public int getPositionY() {
        return positionY;
    }

    public boolean isDestroyed() {
        return destroyed;
    }




}
