import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Player {

    private float positionX;
    private float positionY;
    private Image image;


    public Player(float startPositionX, float startPositionY, String bild) throws SlickException {
        float zoom=(float)1.2;
        this.image = new org.newdawn.slick.Image(bild).getScaledCopy(zoom);
        this.positionX = startPositionX;
        this.positionY = startPositionY-image.getHeight();



    }

    public float getPositionX() {
        return positionX;
    }
    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;

    }
    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public Image getImage() {
        return image;
    }

    public int getHeight(){
        return image.getHeight();
    }
    public int getWidth(){
        return image.getWidth();
    }


}
