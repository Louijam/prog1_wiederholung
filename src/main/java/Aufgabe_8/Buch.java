package Aufgabe_8;

public class Buch{
    private Zustand zustand;
    private final String titel;
    private final String author;
    public Buch(String titel, String author) {
        this.titel = titel;
        this.author = author;
        this.zustand = new Verfuegbar();
    }


    public void ausleihen(){
        zustand.ausleihen(this);

    }


    public void reservieren(){

        zustand.reservieren(this);
    }


    public void zurueckgeben(){

        zustand.zurueckgeben(this);
    }


    public String zeigeStatus() {

        return zustand.zeigeStatus(this);
    }

    public void setZustand(Zustand z){
        this.zustand = z;
    }

    public Zustand getZustand(){
        return this.zustand;
    }


    public String getTitel() {
        return titel;
    }

    public String getAuthor() {
        return author;
    }
}
