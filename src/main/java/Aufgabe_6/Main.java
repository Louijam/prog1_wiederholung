package Aufgabe_6;

public class Main {
    public static void main(String[] args) {

        testPasswortGenerator();

    }


    public static void testPasswortGenerator(){
        String satz="java ist eine objekt-orientierte sprache! ";
        String satz2="Java ist auch eine Insel (von Christian Ullenboom)";
        PasswortGenerator pg = new PasswortGenerator();
        pg.erstellePasswort(satz);
        pg.printPasswort();


    }
}
