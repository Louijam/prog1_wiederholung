package Aufgabe_1;

public class ZahlenZaehlen {
    private final int zahl1;
    private final int zahl2;

    public ZahlenZaehlen(int zahl1, int zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;

    }


    public void berechnePrimzahlen(){
        int zahl1 = this.zahl1;
        int zahl2 = this.zahl2;
        int temp=zahl2;
        int primSumme=0;
        boolean erste=true;
        int count=0;

        if(zahl1>zahl2) {
            zahl2=zahl1;
            zahl1=temp;
        }




        System.out.print("Summe aller Primzahlen zwischen " +zahl1+" und " +zahl2+": ");

        for(int i=zahl1; i<=zahl2; i++){

            if(istPrim(i)){
                if(!erste){
                    System.out.print("+");
                }
                System.out.print(i);
                primSumme+=i;
                count++;
                erste=false;
            }

        }

        System.out.println("=" + primSumme);
        System.out.println("Anzahl Primzahlen: " + count);
    }


    private boolean istPrim(int zahl1){
        if(zahl1<=1)
            return false;
        if(zahl1==2)
            return true;
        if(zahl1%2==0)
            return false;


        for (int i = 2; i * i <= zahl1; i++) {
            if (zahl1 % i == 0) {
                return false;
            }
        }
        return true;

    }
}
