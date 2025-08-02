package Aufgabe_6;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        //testPasswortGenerator();

        testBild();
    }

    public static void testBild(){
        Bild bild=new Bild();

        try{
            bild.leseBild("java.pgm");
        }
        catch(IOException e){
            System.out.println("Fehler beim einlesen der Datei");
            e.printStackTrace();

        }

        bild.printBild();
        bild.rotiereBild();
        bild.printBild();
        bild.rotiereBild();
        bild.printBild();

        try {
            bild.schreibeBild("src/main/resources/Verzeichnis");
        }
        catch(IOException e){
            System.out.println("Fehler beim Schreiben der Datei");
            e.printStackTrace();
        }

    }

    public static void testPasswortGenerator() {
        String satz = "java ist eine objekt-orientierte sprache! ";
        String satz2 = "Java ist auch eine Insel (von Christian Ullenboom)";
        PasswortGenerator pg = new PasswortGenerator();
        pg.erstellePasswort(satz);
        pg.printPasswort();
    }

}
