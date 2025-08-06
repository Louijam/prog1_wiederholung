package Aufgabe_9.Rechenwege;


    public class MatheAnwendung {
        public static void main(String[] args) {
            Arithmetik arith = new Arithmetik();

            arith.bestimmeRechenweg(new RechenwegPlus());
            System.out.println("Addition: " + arith.berechne(5, 3)); // 8.0

            arith.bestimmeRechenweg(new RechenwegMinus());
            System.out.println("Subtraktion: " + arith.berechne(5, 3)); // 2.0

            arith.bestimmeRechenweg(new RechenwegMal());
            System.out.println("Multiplikation: " + arith.berechne(5, 3)); // 15.0
        }
    }