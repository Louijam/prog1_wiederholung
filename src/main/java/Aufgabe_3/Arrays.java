package Aufgabe_3;

public class Arrays {

    private int[] arr1d;








    boolean isEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        int temp = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i]>a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

                if (b[i]>b[j]) {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }





    public void reduce (int[][] arr){

        int max=arrMax(arr);
        int min=arrMin(arr,max);

        int zahl = min;

        if (pruefung(arr)){
            System.out.println("Array entspricht nicht den Anforderungen");
            return;
        }

        this.arr1d=new int[max-min+1];

        for (int i=0; i<arr1d.length; i++){
            arr1d[i]=count(arr,zahl);
            zahl++;
        }



    }

    public void ausgabe(){
        for (int i=0; i<arr1d.length; i++){
            System.out.print(arr1d[i]+" ");
        }
        System.out.println();
    }



    private int count(int[][] arr, int zahl){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==zahl){
                    count++;
                }
            }
        }
        return count;
    }

    private int arrMax(int[][] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j]>max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    private int arrMin(int[][] arr,int min){

        for (int i = 0; i < arr.length; i++) { //zeile
            for (int j = 0; j < arr[0].length; j++) { //spalte
                if (arr[i][j]<min)
                    min = arr[i][j];
            }
        }
        return min;
    }

    private boolean pruefung(int[][] arr){
        if(arr.length!=arr[0].length)
            return true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==0)
                    return true;
            }
        }
        return false;
    }


}
