package Aufgabe_8;

public class Reserviert implements Zustand {
    public void ausleihen(Buch b){

        b.setZustand(new Ausgeliehen());
    }
    @Override
    public void reservieren(Buch b){
        System.out.println(b.getTitel() +" bereits reserviert");

    }
    @Override
    public void zurueckgeben(Buch b){
        b.setZustand(new Verfuegbar());

    }

    public String zeigeStatus(Buch b){
        return "reserviert";
    }
}
