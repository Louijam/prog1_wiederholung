package Aufgabe_8;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private List<Buch> bestand;

    public Bibliothek(){
        bestand = new ArrayList<>();
    }

    public void buchHinzufuegen(Buch b) {
        bestand.add(b);
    }

    public void buchAusleihen(String titel){

        Buch buch=findeBuch(titel);
        if(buch!=null){
            buch.ausleihen();
        }



    }

    public void buchZurueckgeben(String titel){

        Buch buch=findeBuch(titel);
        if(buch!=null){
            buch.zurueckgeben();
        }

    }

    public void buchReservieren(String titel){

        Buch buch=findeBuch(titel);
        if(buch!=null){
            buch.reservieren();
        }

    }

    public void zeigeBestand(){

        for(Buch b:bestand){
            System.out.println(b.getTitel()+ " von " +b.getAuthor()+" ist "+ b.zeigeStatus());
        }

    }

    public Buch findeBuch(String titel){
    for (Buch b : bestand){
        if (b.getTitel().equalsIgnoreCase(titel)){
            return b;
        }
    }
        System.out.println("Buch nicht gefunden: "+titel);
    return null;
}



}
