import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

import java.lang.reflect.Array;
import java.util.Random;

public class Ball {
    private Color farbe;
    private int geschwindigkeit;
    private int positionX;
    private int positionY;
    private int maxAnzahl;
    private int WIDTH;
    private int HEIGHT;
    private Graphics kreis;


    public Ball(int WIDTH, int HEIGHT) {

        this.WIDTH=WIDTH;
        this.HEIGHT=HEIGHT;
        setGeschwindigkeit();
        setFarbe();

    }

    private void setGrafik(){
        int durchmesser=50;
        int radius=durchmesser/2;



    }
    private void setFarbe(){
        Color[] farben={
                Color.red,
                Color.black,
                Color.blue,
                Color.green,
                Color.orange
        };
        Random r=new Random();

        int zahl=r.nextInt(farben.length);
        this.farbe=farben[zahl];
    }

    public void setPosition(int positionX, int pos){


    }

    private void setGeschwindigkeit() {
        int [] pace={5,7,10};
        Random r = new Random();
        int zahl=r.nextInt(pace.length);
        geschwindigkeit = pace[zahl];
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }




}
