package Aufgabe_2.Tier_und_Pflanzen;



public class Tier {
    private final String name;
    private String pflanzenNahrung;
    private String fleischNahrung;

    public Tier(String name) {
        this.name = name;
        this.pflanzenNahrung = "-";
        this.fleischNahrung = "-";
    }

    public void setPflanzenNahrung(Pflanze pflanze) {
        this.pflanzenNahrung = pflanze.getName();
    }
    public void setFleischNahrung(Tier tier) {
        this.fleischNahrung = tier.getName();
    }


    public String getName() {
        return name;
    }
    public String getPflanzenNahrung() {
        return pflanzenNahrung;
    }
    public String getFleischNahrung() {
        return fleischNahrung;
    }

    public void getFresstyp(){
        String fressTyp;
        if(!pflanzenNahrung.equals("-")&&!fleischNahrung.equals("-")) {
           fressTyp = "Allesfresser";
        }

            else if(pflanzenNahrung.equals("-")){
                fressTyp = "Fleischfresser";

            }

            else{
                fressTyp = "Pflanzenfresser";
            }


        System.out.println(getName()+" ist ein "+ fressTyp);
    }

}
