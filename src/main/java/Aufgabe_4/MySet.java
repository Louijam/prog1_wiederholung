package Aufgabe_4;

public class MySet {
    private int[] set;

    public MySet(){
        this.set = new int[0];
    }

    public void addToSet(int item){

        if (hinzufuegenGueltig(item)){


            int oldLength=set.length;
            int [] setCopy = copySet();
            set = new int[oldLength +1];
            for (int i=0; i<oldLength; i++){
                set[i] = setCopy[i];
            }
            set[oldLength] = item;
        }
    }



    public void addToSet(MySet s){

        int [] sCopy = s.copySet();
        for (int i=0; i<sCopy.length; i++){
            addToSet(sCopy[i]);
        }
    }


    public void removeFromSet(int item){

        if (entfernenGueltig(item)) {

            int[] setCopy = copySet();
            int index = 0;

            set = new int[setCopy.length - 1];

            for (int i = 0; i < setCopy.length; i++) {
                if (setCopy[i] != item) {
                    set[index] = setCopy[i];
                    index++;
                }
            }
        }
    }

    public void removeFromSet(MySet s){
        int [] sCopy = s.copySet();
        for (int i=0; i<sCopy.length; i++){
            removeFromSet(sCopy[i]);
        }
    }


    public int[] sort(){
        int [] setSorted = bubbleSort(copySet());

        set=new int[0];
        for (int i = 0; i< setSorted.length; i++){
            if(setSorted[i]%2!=0){
                addToSet(setSorted[i]);
            }
        }
        for (int i = 0; i< setSorted.length; i++){
            if(setSorted[i]%2==0){
                addToSet(setSorted[i]);
            }
        }
        return set;
    }

    private int[] bubbleSort(int [] setCopy) {
        boolean swapped;
        for (int i = 0; i < setCopy.length; i++) {
            swapped = false;
            for (int j = 0; j < setCopy.length-1-i; j++) {
                if (setCopy[j] > setCopy[j+1]) {
                    int temp = setCopy[j];
                    setCopy[j] = setCopy[j+1];
                    setCopy[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return setCopy;
    }






    private boolean entfernenGueltig(int item){

        for (int i=0; i<set.length; i++){
            if (set[i] == item){
                return true;
            }
        }
        System.out.println("Item "+item+" nicht vorhanden");
        return false;
    }






    public int [] copySet(){
        int [] copySet = new int[set.length];
        for (int i=0; i<set.length; i++ ){
            copySet[i]=set[i];
        }
        return copySet;
    }



    private boolean hinzufuegenGueltig(int item){
        if(item<0){
            System.out.println("Item "+item+" muss größer als 0 sein");
            return false;
        }
        for (int i=0; i<set.length; i++){
            if (set[i]==item){
                System.out.println("Item "+item+" bereits vorhanden");
                return false;
            }
        }
        return true;
    }




    public void printSet(){
        for (int i=0; i<set.length; i++){
            System.out.print(set[i]+" ");
        }
        System.out.println("\n"+set.length);
    }


}
