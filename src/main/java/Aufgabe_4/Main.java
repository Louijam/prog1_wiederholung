package Aufgabe_4;

public class Main {
    public static void main(String[] args) {


        //testArr();
        //testSet();
        testSort();

    }

    public static void testArr(){
        int [] arr1 = new int[1];
        arr1[0] = 3;
        System.out.println("Länge "+arr1.length);
         System.out.println("Inhalt pos1: "+arr1[0]);

         arr1=new int[2];
         arr1[1] = 1;

        System.out.println("Länge "+arr1.length);
        System.out.println("Inhalt pos1:"+arr1[0]);
        System.out.println("Inhalt pos2: "+arr1[1]);
    }

    public static void testSet(){
        MySet mySet = new MySet();

        mySet.addToSet(1);
        mySet.addToSet(2);
        mySet.addToSet(1);
        mySet.addToSet(-2);




        mySet.printSet();


        MySet mySet2 = new MySet();

        mySet2.addToSet(3);
        mySet2.addToSet(4);

        mySet2.printSet();



        mySet2.addToSet(mySet);

        mySet2.printSet();

        mySet2.removeFromSet(5);

        mySet2.removeFromSet(mySet);
        mySet2.printSet();



    }

    public static void testSort(){
        int [] arr1 = {5,3,12,6,7,1,3,2,43};

        MySet mySet = new MySet();

        for (int i=0; i<arr1.length; i++){
            mySet.addToSet(arr1[i]);
        }

        arr1= mySet.sort();
        for (int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }



}
