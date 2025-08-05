package Aufgabe_8;

public class Ausgeliehen implements Zustand {


    @Override
    public void ausleihen(Buch b){

        System.out.println(b.getTitel()+" bereits ausgeliehen");
    }
    @Override
    public void reservieren(Buch b){
        b.setZustand(new Reserviert());

    }
    @Override
    public void zurueckgeben(Buch b){
        b.setZustand(new Verfuegbar());

    }

    @Override
    public String zeigeStatus(Buch b){
        return "ausgeliehen";
    }
}
