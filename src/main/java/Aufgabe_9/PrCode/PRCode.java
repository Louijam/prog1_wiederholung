package Aufgabe_9.PrCode;

public class PRCode {
    private final int [][] bild;
    private final int [][] prBild;




    public PRCode(int [][]prCode) {

        pruefeBild(prCode);
        this.prBild = prCode;
        bild = new int [prCode.length][prCode.length];
        generateBild();
    }


    public void berechneMaxPR(){
        int max = 0;
        int drehungen=0;
        int tmp = 0;

        for (int i = 0; i < 4; i++) {
            tmp=berechnePR();
            if (tmp>max){
                drehungen = i;
            }
            max = Math.max(max, tmp);
            dreheBild();
        }



        maxPrAusgabe(max, drehungen);

    }

    private void maxPrAusgabe(int max, int drehungen){
        System.out.println("Maximaler PRCode:");
        for (int i = 0; i < drehungen; i++) {
            dreheBild();
        }
        printPRCode();
        System.out.println("Das Bild musste um "+90*drehungen+" Grad gedreht werden");
        berechnePR();


    }



    public int berechnePR() {
        boolean isFirst = true;
        int summe=0;
        for (int i = 0; i < prBild.length; i++) {
            for (int j = 0; j < prBild[i].length; j++) {
                if (isFirst) {
                    if(prBild[i][j]==1) {
                        summe+=bild[i][j];
                        System.out.print(bild[i][j]);
                        isFirst = false;
                    }

                }
                else {
                    if(prBild[i][j]==1) {
                        summe+=bild[i][j];
                        System.out.print("+"+bild[i][j]);
                    }
            }
        }
    }
        System.out.println("="+summe+"\n");
        return summe;
    }

    public void dreheBild(){
        int [][] copy= new int [prBild.length][prBild[0].length];
        for (int i = 0; i < prBild.length; i++) {
            for (int j = 0; j < prBild[i].length; j++) {
                copy[j][prBild.length-1-i]=prBild[i][j];
            }
        }

        for (int i = 0; i < prBild.length; i++) {
            for (int j = 0; j < prBild[i].length; j++) {
                prBild[i][j] = copy[i][j];
            }
        }
    }

    public void printBild() {
        for (int[] ints : bild) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

    public void printPRCode() {
        for (int[] ints : prBild) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



    private void generateBild() {
        int value=1;
        for (int i = 0; i < bild.length; i++) {
            for (int j = 0; j < bild[i].length; j++) {
                bild[i][j]= value;
                value*=2;
            }
        }
    }

    private void pruefeBild(int [][] bild){
        if (bild.length!=bild[0].length) throw new IllegalArgumentException("Bild ist nicht NxN");
        for (int[] ints : bild) {
            for (int anInt : ints) {
                if (anInt != 1 && anInt != 0) throw new IllegalArgumentException("Bild ist nicht schwarz-weiß");
            }
        }
    }

}
