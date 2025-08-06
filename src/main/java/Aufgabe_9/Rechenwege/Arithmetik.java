package Aufgabe_9.Rechenwege;

public class Arithmetik {
    private Rechenweg rechenweg;

    public void bestimmeRechenweg(Rechenweg r){
        this.rechenweg = r;
    }

    public double berechne(double a, double b) {
        return rechenweg.brecheneErgebnis(a, b);
    }
}
