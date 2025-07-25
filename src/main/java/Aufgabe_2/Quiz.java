package Aufgabe_2;

public class Quiz {
    private int ergebnis;


    private void berechne(char operator, int zahl1, int zahl2) {
        switch (operator){

            case '+':
                ergebnis = zahl1+zahl2;
                break;

            case '-':
                ergebnis = zahl1-zahl2;
                break;



            case '*':
                ergebnis = zahl1*zahl2;
                break;
        }
    }

    public void getExercise(){

        char[] operator={'+', '-','*'};
        int zahl1=(int) (Math.random()*20);
        int zahl2=(int)(Math.random()*20);
        int index=(int) (Math.random()*operator.length);

        char randomOperator=operator[index];

        while (zahl1<1){
        zahl1=(int)(Math.random()*20);
        }

        while (zahl2<1){
        zahl2=(int) (Math.random()*20);
        }

        berechne(randomOperator,zahl1,zahl2);
        System.out.println(""+zahl1+randomOperator+zahl2);
    }

    public int getResult(){
        return ergebnis;
    }
}
