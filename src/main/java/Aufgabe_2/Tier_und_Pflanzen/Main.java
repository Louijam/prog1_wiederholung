package Aufgabe_2.Tier_und_Pflanzen;

public class Main {
    public static void main(String[] args) {
        Pflanze gras=new Pflanze("Gras", "grün");
        Pflanze beeren=new Pflanze("Beeren", "rot");
        Pflanze algen=new Pflanze("Algen", "grün");
        Tier fische=new Tier("Fisch");
        Tier zebras=new Tier("Zebra");
        Tier loewen=new Tier("Löwe");
        Tier baeren=new Tier("Bär");

        fische.setPflanzenNahrung(algen);
        zebras.setPflanzenNahrung(gras);
        loewen.setFleischNahrung(zebras);
        baeren.setPflanzenNahrung(beeren);
        baeren.setFleischNahrung(fische);


        fische.getFresstyp();
        zebras.getFresstyp();
        loewen.getFresstyp();
        baeren.getFresstyp();




    }
}
