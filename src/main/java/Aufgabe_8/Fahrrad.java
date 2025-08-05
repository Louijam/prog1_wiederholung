package Aufgabe_8;

public class Fahrrad {

    private Fahrrad next;
    private int ladung;
    private int maxSpeed;

    public Fahrrad(int ladung, int maxSpeed){
        this.ladung=ladung;
        this.maxSpeed=maxSpeed;
    }

    public int speed(){
        if (ladung>=maxSpeed){
            return 0;
        }
        else {
            return maxSpeed - ladung;
        }

    }

    public void setLadung(int ladung){
        this.ladung=ladung;
    }


    public int getLadung() {
        return ladung;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed=speed();
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setNext(Fahrrad next){
        this.next=next;
    }

    public Fahrrad getNext(){
        return next;
    }

}
