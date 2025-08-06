package Aufgabe_9.Rechenwege;

public class ArithmetikGenerisch <T extends Rechenweg>{
   private T rechenweg;


    public void bestimmeRechenweg(T rechenweg){
        this.rechenweg = rechenweg;

    }

    public double berechne(double a, double b) {
        if (rechenweg==null){
            throw new IllegalArgumentException("Kein Rechenweg Angegeben");
        }
        return rechenweg.brecheneErgebnis(a,b);
    }



}
