package Aufgabe_3;



public class Main {
    public static void main(String[] args) {

        //testReduce();
        //testEqual();

        testBild();
    }


        public static void testReduce(){
            int[][] array2d={
                    {1, 2, 3},
                    {4, 1, 2},
                    {7, 5, 4}

            };

            Arrays array = new Arrays();
            array.reduce(array2d);
            array.ausgabe();
        }



        public static void testEqual(){
        int [] arr1 = {3,5,1,3};
        int [] arr2 = {1,5,3,3};



        Arrays array = new Arrays();
        if(array.isEqual(arr1, arr2)){
            System.out.println("Equal");
        }else System.out.println("Not Equal");

        if (array.isEqual(new int[] {1,2,3,4}, new int[] {3,1,6,2}))
            System.out.println("Equal");
        else System.out.println("Not Equal");
    }

    public static void testBild(){
        int [][] arr1 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1},
        };

        int [][] arr2 = {
                {1,1,0,1},
                {0,1,0,1},
                {0,1,1,1},
                {1,0,1,0},
        };

        int [][] arr3 = {
                {0,0,1,1,0},
                {0,1,0,1,1},
                {1,0,0,1,1},
                {0,1,0,1,0},
        };
        Bild bild1 =new Bild(arr1);
        System.out.println("Original1:");
        bild1.ausgabe();
        bild1 = bild1.flipAndInvert();
        System.out.println("Flipped:");
        bild1.ausgabe();

        Bild bild2 =new Bild(arr2);
        System.out.println("2:");
        bild2.ausgabe();
        bild2 = bild2.flipAndInvert();
        System.out.println("Flipped:");
        bild2.ausgabe();

        Bild bild3 =new Bild(arr3);
        System.out.println("3:");
        bild3.ausgabe();
        bild3 = bild3.flipAndInvert();
        System.out.println("Flipped:");
        bild3.ausgabe();
    }
}

