package Aufgabe_5;

public class Zoom {

    private int[][] bild;

    public Zoom(int [][] bild) {
        if(test(bild)) {
            this.bild = bild;
        }else {
            System.out.println("Das Bild ist ungültig");
        }
    }


    int [][] zoom(int f) {

        int [][] zoom= new int[bild.length*f][bild[0].length*f];

        for (int i = 0; i < bild.length; i++){
            for (int j = 0; j < bild[0].length; j++){
                int temp = bild[i][j];

                for(int k = 0; k < f; k++){
                    for (int l = 0; l < f; l++){
                        zoom[i*f+k][j*f+l] = temp;

                    }
                }
            }
        }



        return zoom;
    }

    private boolean test(int[][] bild) {
        // Check auf null oder leeres Array
        if (bild == null || bild.length == 0 || bild[0] == null) {
            return false;
        }

        // Jetzt sicher: Zugriff auf bild[0] ist gültig
        if (bild.length != bild[0].length) {
            return false;
        }

        return bild.length <= 7;
    }

}
