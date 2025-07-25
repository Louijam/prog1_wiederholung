package Aufgabe_2;

public class Berge {




    public void zeichneBerge1(int w1, int w2, int w3){

        if (pruefung(w1, w2, w3)) {
            System.out.println("Die Berge entsprechen nicht den korrekten parametern");
            return;
        }

        char[] zeichen = {'*', '#', 'o'};
        int[] breiten = {w1, w2, w3};

        // Höhe jedes Berges entspricht (breite / 2) + 1
        int h1 = w1 / 2 + 1;
        int h2 = w2 / 2 + 1;
        int h3 = w3 / 2 + 1;
        int maxHoehe = Math.max(h1, Math.max(h2, h3));

        // Für jede Zeile von oben nach unten
        for (int zeile = 0; zeile < maxHoehe; zeile++) {
            StringBuilder line = new StringBuilder();

            // Für jeden Berg
            for (int i = 0; i < 3; i++) {
                int breite = breiten[i];
                int hoehe = breite / 2 + 1;
                char z = zeichen[i];

                // Aktuelle Zeile für diesen Berg
                if (zeile < maxHoehe - hoehe) {
                    // Berg hat in dieser Zeile noch nichts
                    line.append(" ".repeat(breite));
                } else {
                    // Index innerhalb des Bergs
                    int bergZeile = zeile - (maxHoehe - hoehe);
                    int anzahlZeichen = 1 + bergZeile * 2;
                    int leerzeichen = (breite - anzahlZeichen) / 2;

                    line.append(" ".repeat(leerzeichen));
                    line.append(String.valueOf(z).repeat(anzahlZeichen));
                    line.append(" ".repeat(leerzeichen));
                }

                // Abstand zwischen den Bergen
                line.append(" ");
            }

            // Zeile ausgeben
            System.out.println(line);
        }
    }




    public void zeichneBerge2(int w1, int w2, int w3){
        if (pruefung(w1, w2, w3)) {
            System.out.println("Die Berge entsprechen nicht den korrekten parametern");
            return;
        }

        char char1 = '#';
        char char2 = 'o';
        char char3 = '*';





        int h1 = w1 / 2 + 1;
        int h2 = w2 / 2 + 1;
        int h3 = w3 / 2 + 1;
        int maxHoehe=mathMax(h1, mathMax(h2,h3));

        int anzahlZeichen1=1;
        int anzahlZeichen2=1;
        int anzahlZeichen3=1;
        int leerzeichen1=w1/2;
        int leerzeichen2=w2/2;
        int leerzeichen3=w3/2;





       for (int zeile = 0; zeile < maxHoehe; zeile++) {     //pro zeile
           //berg1
               if (zeile < maxHoehe - h1) {                 //berg gibts in der zeile noch nicht
                   for (int i = 0; i < w1; i++) {
                       System.out.print(" ");
                   }
               } else {
                   printBerg(leerzeichen1, anzahlZeichen1, char1);
                   anzahlZeichen1 +=2;
                   leerzeichen1 -=1;
               }

            System.out.print(" ");
               //berg2
           if (zeile < maxHoehe - h2) {                 //berg gibts in der zeile noch nicht
               for (int i = 0; i < w2; i++) {
                   System.out.print(" ");
               }
           } else {
               printBerg(leerzeichen2, anzahlZeichen2, char2);
               anzahlZeichen2 +=2;
               leerzeichen2 -=1;
           }
           System.out.print(" ");

           //berg3
           if (zeile < maxHoehe - h3) {                 //berg gibts in der zeile noch nicht
               for (int i = 0; i < w3; i++) {
                   System.out.print(" ");
               }
           } else {
              printBerg(leerzeichen3, anzahlZeichen3, char3);
             //  System.out.print(" ");
               anzahlZeichen3 +=2;
               leerzeichen3 -=1;
           }
           System.out.println();
       }
    }



    private void printBerg(int leerzeichen, int anzahlZeichen, char c){
        for (int j = 0; j < leerzeichen; j++) {       //leerzeichen vor Berg
            System.out.print(" ");
        }
        for (int j = 0; j < anzahlZeichen; j++) {      //berg
            System.out.print(c);
        }
        for (int j = 0; j < leerzeichen; j++) {   //leerzeichen nach Berg
            System.out.print(" ");
        }
    }

    private boolean pruefung(int w1, int w2, int w3){
        return (w1 <= 0 || w2 <= 0 || w3 <= 0) || (w1 > 21 || w2 > 21 || w3 > 21) || (w1 % 2 == 0 || w2 % 2 == 0 || w3 % 2 == 0);
    }

    private int mathMax(int a, int b){
       if (a>b){
           return a;
       }
       else {
           return b;
       }
    }


}

