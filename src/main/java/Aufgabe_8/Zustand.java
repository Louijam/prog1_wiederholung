package Aufgabe_8;

public interface Zustand {
    public void ausleihen(Buch b);
    public void reservieren(Buch b);
    public void zurueckgeben(Buch b);
    public String zeigeStatus(Buch b);

}
