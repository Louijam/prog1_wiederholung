package Aufgabe_1;

import java.util.Scanner;

public class Sensordaten {

    public void verarbeiteMesswerte(){

        Scanner scan = new Scanner(System.in);
        int prev1=-1, prev2=-1;
        boolean zeroPrinted = false;
        boolean firstOutput=true;
        int sumWith4=0;

        System.out.print("Input: ");
        while (true){
            int value = scan.nextInt();

           if (firstOutput){
               System.out.print("Output: ");
               firstOutput=false;
           }


            if(prev1==1&&prev2==1&&value==1){
                System.out.println("1 ");
                System.out.println();
                System.out.print("Summe: "+sumWith4);
                break;
            }

            if (value<0){
                value=-value;
            }

            if(value==0){
                if(!zeroPrinted){
                    System.out.print("0 ");
                    zeroPrinted=true;
                }
                if(enthaeltZiffer4(value)){
                    sumWith4+=value;
                }
            }

            else{
                System.out.print(value+ " ");
                zeroPrinted=false;
                if(enthaeltZiffer4(value)){
                    sumWith4+=value;
                }
            }

            prev2=prev1;
            prev1=value;
        }

        scan.close();


    }

    private boolean enthaeltZiffer4(int value){
        while(value>0){
            if (value%10==4){
                return true;
            }
            value/=10;
        }
        return false;
    }



}





