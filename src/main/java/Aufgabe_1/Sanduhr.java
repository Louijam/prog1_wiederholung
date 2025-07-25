package Aufgabe_1;

public class Sanduhr {

    public void printSanduhr(int width){
        int temp=width;
        boolean abnehmen=true;
        int leerzeichen=0;
        if(width > 2){
            for(int i = 1; i <= width; i++){    //zeile
                for(int j = 1; j <= temp; j++){ //spalte
                    System.out.print("*");
                }
                if (abnehmen){
                    temp-=2;
                    leerzeichen++;
                    if(temp<=2){
                        abnehmen=false;
                    }
                }
                 else {
                    temp+=2;
                    leerzeichen--;
                }
                System.out.println();
                for(int j = 1; j <= leerzeichen; j++){System.out.print(" ");}

                if (temp>width){break;}

                }
            }

        }

        public void printSanduhr2(int width){
        if (width <= 2){
            System.out.println("Die Sanduhr war zu klein zum laden");
            return;
        }

        int half=width/2;

        for(int i = 0; i < half; i++){
            int stars=width-2*i;
            int spaces=i;
            printLine(spaces, stars);
        }

        if(width%2==0){

        }
        else{
            printLine(half,1);
        }

        for(int i = half-1; i >=0; i--){
            int stars=width-2*i;
            int spaces=i;
            printLine(spaces, stars);
        }
    }

    private void printLine(int spaces, int stars){
        for(int i = 0; i < spaces; i++)System.out.print(" ");
        for(int i = 0; i < stars; i++)System.out.print("*");
        System.out.println();
    }
}
