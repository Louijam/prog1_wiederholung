package Aufgabe_8;

public class Verfuegbar implements Zustand {

    @Override
    public void ausleihen(Buch b){

        b.setZustand(new Ausgeliehen());
    }
    @Override
    public void reservieren(Buch b){
        b.setZustand(new Reserviert());

    }
    @Override
    public void zurueckgeben(Buch b){
        System.out.println(b.getTitel()+" bereits zurückgegeben");

    }

    @Override
    public String zeigeStatus(Buch b){
        return "verfuegbar";
    }
}
