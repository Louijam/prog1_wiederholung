import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Player {

    private final int WIDTH;
    private final int HEIGHT;
    private float positionX;
    private float positionY;
    private Image image;
    private boolean notFlipped = true;


    public Player(int WIDTH, int HEIGHT, String bild) throws SlickException {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
        this.image = new org.newdawn.slick.Image(bild);
        this.positionX = (float) (WIDTH- image.getWidth())/2;
        this.positionY = HEIGHT-image.getHeight();

    }




    public void moveLeft(int speed){
        if (!notFlipped){
            this.image=image.getFlippedCopy(true,false);
            notFlipped = true;
        }

        if (positionX - speed >= 0)
            positionX -= speed;


    }



    public void moveRight(int speed) {
       if (notFlipped){
           this.image=image.getFlippedCopy(true,false);
           notFlipped = false;
       }


       if (positionX + speed <= (WIDTH - image.getWidth()))
           positionX += speed;

    }

    public void render(Graphics g) {
        g.drawImage(image,positionX,positionY);
    }







    public float getPositionX() {
        return positionX;
    }
    public float getPositionY() {
        return positionY;

    }
    public int getHeight(){
        return image.getHeight();
    }
    public int getWidth(){
        return image.getWidth();
    }
    public Image getImage() {
        return image;
    }


}
