package Aufgabe_8;



public class FahrradGruppe {
    private Fahrrad startFahrrad=null;

    public void addFahrrad(Fahrrad f){
        f.setNext(startFahrrad);
        startFahrrad=f;
    }


    public int reisegeschwindigkeit(){
        int minSpeed=Integer.MAX_VALUE;
        Fahrrad current=startFahrrad;

        while (current!=null){
            int temp= current.speed();
            if (temp<minSpeed){
                minSpeed=temp;
            }
            current=current.getNext();
        }

        return minSpeed;
    }

    public void addLadung(int anzahl){

      for (int i=0;i<anzahl;i++){
            Fahrrad best=null;
            int bestSpeed=-1;
            Fahrrad current=startFahrrad;
            while (current!=null){
                int curentSpeed = current.speed();
                if (curentSpeed >bestSpeed){
                    best=current;

                    bestSpeed=curentSpeed;
                }
                current=current.getNext();
            }
            if (best!=null){
                best.setLadung(best.getLadung()+1);
            }
        }
    }



}
