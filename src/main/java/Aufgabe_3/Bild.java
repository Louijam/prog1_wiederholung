package Aufgabe_3;

public class Bild {
    private final int[][] bild;


    public Bild(int[][] bild) {
        if(istUngueltig(bild)){
            throw new IllegalArgumentException("Nur 0 und 1 erlaubt");
        }
        this.bild = bild;
    }


    public Bild flipAndInvert() {

        int[][] copy=new int[bild.length][bild[0].length];

        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                copy[i][j]=bild[i][j];
            }
        }
        int temp;
        int count= copy.length-1;


        //flip

        for (int i = 0; i < copy.length/2; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                temp = copy[i][j];
                copy[i][j] = copy[count][j];
                copy[count][j] = temp;
            }
            count--;
        }

        //invert
       for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy[i].length; j++) {
                if (copy[i][j] == 1) {
                    copy[i][j] = 0;
                }
                else {
                    copy[i][j] = 1;
                }

            }
        }



        return new Bild(copy);

    }

    private static boolean istUngueltig(int[][] bild) {
        for(int i = 0; i < bild.length; i++){
            for(int j = 0; j < bild[i].length; j++){
                if (bild[i][j] != 1 && bild[i][j] != 0){
                    return true;
                }
            }
        }
        return false;
    }


    public void ausgabe(){
        for(int i = 0; i < bild.length; i++){
            for(int j = 0; j < bild[i].length; j++){
                System.out.print(bild[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



}
