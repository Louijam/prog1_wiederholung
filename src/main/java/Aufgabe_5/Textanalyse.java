package Aufgabe_5;


import java.util.*;


public class Textanalyse {
    private final ArrayList<String> text;
    private final ArrayList<String> splitWoerter =new ArrayList<>();
    private final ArrayList<String> splitZeichen =new ArrayList<>();

    public Textanalyse(ArrayList<String> text) {
        this.text=text;
        splitteText();

    }

    public ArrayList<String> findeDuplikate() {

        ArrayList<String> duplikate=new ArrayList<>();
        Set<String> bereitsGesehen = new HashSet<>();
        Set<String> bereitsHinzugefuegt = new HashSet<>();




        for (String wort: splitWoerter) {
            String klein = wort.toLowerCase();
            if(klein.equals("der")|| klein.equals("die")||klein.equals("das")){
                continue;
            }

            if (bereitsGesehen.contains(klein)) {
                if(!bereitsHinzugefuegt.contains(klein)) {
                    duplikate.add(wort);
                    bereitsHinzugefuegt.add(klein);
                }
            }
            else {
                bereitsGesehen.add(klein);
            }





        }


        return duplikate;
    }




    private void splitteText() {

        String [] split;

        StringBuilder satz= new StringBuilder();

        for (String c:text){
            satz.append(c);
        }
        split = satz.toString().split("");
        Collections.addAll(splitZeichen, split);

        split=satz.toString().split("[^a-zA-Z]+");

        Collections.addAll(splitWoerter, split);

    }

    public int [] berechneStatistik(){

        int [] statistik=new int[3];
        statistik[0]=berechneZeichen();
        statistik[1]=berechneWortanzahl();
        statistik[2]=(int) berechneMedian(statistik[1]);

        return statistik;
    }

    private int berechneZeichen(){

        int zeichenLaenge=0;

        for (String s:splitZeichen){
            if(s.matches("[^ ]+")){
                zeichenLaenge++;
            }
        }

        return zeichenLaenge;
    }

    private int berechneWortanzahl(){

        return splitWoerter.size();
    }

    private float berechneMedian(int wortanzahl){
        float median;
        int [] wortlaenge=new int[wortanzahl];

        for (int i=0;i<wortanzahl;i++){
            wortlaenge[i]=splitWoerter.get(i).length();
        }

        Arrays.sort(wortlaenge);

        if (wortanzahl%2==0){
            median= (float) (wortlaenge[wortanzahl / 2] + wortlaenge[wortanzahl / 2 - 1]) /2;
        } else {
            median=wortlaenge[wortanzahl/2];
        }

        System.out.println(median);
        return median;
    }



    public void printText() {
        for (String s : text) {
            System.out.println(s);
        }
        System.out.println();

        for (String s : splitZeichen) {
            System.out.println(s);
        }
        System.out.println();

        for (String s : splitWoerter) {
            System.out.println(s);
        }
        System.out.println();

    }





}
