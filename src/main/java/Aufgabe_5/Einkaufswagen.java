package Aufgabe_5;

import java.util.ArrayList;

public class Einkaufswagen {
    private final ArrayList<String> einkaufswagen=new ArrayList<>();

    public void addToCart(String item){
        if (einkaufswagen.size()<5){
            einkaufswagen.add(item);
        }
        else{
            System.out.println("Der Einkaufswagen ist zu voll für "+item);
        }
    }

    public void removeFromCart(String item){
        if(einkaufswagen.contains(item)){
            einkaufswagen.remove(item);
        }
        else{
            System.out.println(item+" ist nicht im Einkaufswagen vorhanden");
        }
    }

    public void showContent(){
        for (String item : einkaufswagen) {
            System.out.println(item);
        }
        System.out.println();
    }

    public int size(){
        return einkaufswagen.size();
    }
}
