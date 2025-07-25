package Aufgabe_2;

public class Main {
    public static void main(String[] args) {
       printBerge();

       // randomQuiz();


    }

    public static void randomQuiz(){
        Quiz quiz = new Quiz();
        quiz.getExercise();
        int result=quiz.getResult();
        System.out.println("Result: "+result);
    }

    public static void printBerge(){
        Berge b = new Berge();
        b.zeichneBerge2(3, 5, 9);

        b.zeichneBerge1(3, 5, 9);


    }
}
