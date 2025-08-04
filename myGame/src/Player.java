import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Player {

    private float positionX;
    private float positionY;
    private Image image;
    private boolean notFlipped = true;


    public Player(float startPositionX, float startPositionY, String bild) throws SlickException {

        this.image = new org.newdawn.slick.Image(bild);
        this.positionX = startPositionX;
        this.positionY = startPositionY-image.getHeight();



    }


    public float getPositionX() {
        return positionX;
    }
    public void setPositionX(float positionX) {
        if(this.positionX<positionX&&notFlipped){
            notFlipped=false;
            this.image=image.getFlippedCopy(true,false);
        }


        else if(this.positionX>positionX&&!notFlipped){
            notFlipped=true;
            this.image=image.getFlippedCopy(true,false);

        }
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
