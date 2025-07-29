package Aufgabe_5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       // testEinkaufswagen();

        testTextanalyse();


    }
    public static void testTextanalyse(){

        String text="Ich liebe Java, weil Java die schönste Sprache der der ganzen Welt ist. ";
        String text2="Dies ist ein Test!";
        ArrayList<String> textArray = new ArrayList<>();
        textArray.add(text2);
        Textanalyse textanalyse=new Textanalyse(textArray);

        textArray=textanalyse.findeDuplikate();
      // textanalyse.printText();

        for (String s:textArray){
            System.out.print(s+" ");
        }

        System.out.println();


       int[] statistik=textanalyse.berechneStatistik();
       for(int i=0;i<statistik.length;i++){
           System.out.println(statistik[i]);
       }




    }

    public static void testEinkaufswagen(){

        Einkaufswagen cart=new Einkaufswagen();
        System.out.println(cart.size());
        cart.addToCart("Birne");
        cart.addToCart("Salat");
        cart.addToCart("Paprika");
        cart.addToCart("Berliner");
        cart.addToCart("Kohl");
        cart.addToCart("Berlin");

        cart.showContent();

        cart.removeFromCart("Cornflakes");
        cart.removeFromCart("Birne");
        cart.showContent();

    }
}
