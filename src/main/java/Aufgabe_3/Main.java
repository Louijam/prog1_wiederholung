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
                {0, 1, 0}
        };

        Bild bild=new Bild(arr1);
        System.out.println("Original:");
        bild.ausgabe();


        Bild copy=bild.flipAndInvert();

        System.out.println("Original nach Kopie=bild.flip");
        bild.ausgabe();
        System.out.println("Kopie nach bild.flip");
        copy.ausgabe();
        bild=bild.flipAndInvert();
        System.out.println("Original nach bild.flip");
        bild.ausgabe();
    }
}

