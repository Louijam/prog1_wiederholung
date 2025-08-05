package Aufgabe_8;

public class Main {
    public static void main(String[] args) {

        //testFahrradgruppe();
        testBibliothek();

    }

    public static void testFahrradgruppe(){
        Fahrrad f0=new Fahrrad(6,26);
        Fahrrad f1=new Fahrrad(5,25);
        Fahrrad f2=new Fahrrad(4,24);


        FahrradGruppe gruppe=new FahrradGruppe();
        gruppe.addFahrrad(f0);
        gruppe.addFahrrad(f1);
        gruppe.addFahrrad(f2);


        System.out.println(f0.getNext());
        System.out.println(f1.getNext());
        System.out.println(f2.getNext());

        System.out.println(gruppe.reisegeschwindigkeit());


        gruppe.addLadung(18);
        System.out.println(gruppe.reisegeschwindigkeit());
    }

    public static void testBibliothek(){
        Bibliothek bib=new Bibliothek();
        Buch b0=new Buch("Eragon 1", "Christopher Paolini");
        Buch b1=new Buch("Eragon 2", "Christopher Paolini");
        Buch b2=new Buch("Eragon 3", "Christopher Paolini");
        Buch b3=new Buch("Eragon 4", "Christopher Paolini");

        bib.buchHinzufuegen(b0);
        bib.buchHinzufuegen(b1);
        bib.buchHinzufuegen(b2);
        bib.buchHinzufuegen(b3);

        bib.buchAusleihen("Eragon 1");
        bib.buchAusleihen("Eragon 1");
        bib.buchReservieren("Eragon 1");
        bib.buchReservieren("Eragon 1");
        bib.buchZurueckgeben("Eragon 1");
        bib.buchZurueckgeben("Eragon 1");


        bib.zeigeBestand();

    }
}
