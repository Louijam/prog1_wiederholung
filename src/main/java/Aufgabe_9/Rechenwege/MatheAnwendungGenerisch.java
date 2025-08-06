package Aufgabe_9.Rechenwege;

public class MatheAnwendungGenerisch {
    public static void main(String[] args) {
        ArithmetikGenerisch<Rechenweg> rechnung = new ArithmetikGenerisch<>();


        rechnung.bestimmeRechenweg(new RechenwegPlus());
        System.out.println(rechnung.berechne(10,12)); //22

        rechnung.bestimmeRechenweg(new RechenwegMinus());
        System.out.println(rechnung.berechne(10,12)); //-2

        rechnung.bestimmeRechenweg(new RechenwegMal());
        System.out.println(rechnung.berechne(10,12)); //120



    }
}
