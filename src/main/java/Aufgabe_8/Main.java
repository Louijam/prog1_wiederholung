package Aufgabe_8;

public class Main {
    public static void main(String[] args) {

        //testFahrradgruppe();

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
}
