package Aufgabe_1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primzahlSummierer();
        //verarbeiteMesswerte();


        Sanduhr sanduhr = new Sanduhr();
        sanduhr.printSanduhr(6);
    }

    public static void verarbeiteMesswerte() {
        Sensordaten s = new Sensordaten();
        s.verarbeiteMesswerte();

    }

    public static void primzahlSummierer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl1: ");
        int a = sc.nextInt();
        System.out.print("Zahl2: ");
        int b = sc.nextInt();
        ZahlenZaehlen primZahlen = new ZahlenZaehlen(a, b);
        primZahlen.berechnePrimzahlen();

    }
}




