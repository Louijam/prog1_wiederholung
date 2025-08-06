package Aufgabe_9.PrCode;

public class Main {

    public static void main(String[] args) {

        int[][] image = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 1},

        };

        PRCode pr1 = new PRCode(image);

        pr1.printBild();
        pr1.printPRCode();

        pr1.dreheBild();
        pr1.printPRCode();
        pr1.berechnePR();
        pr1.berechneMaxPR();


    }
}
