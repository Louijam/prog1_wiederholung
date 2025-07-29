package Aufgabe_6;


public class PasswortGenerator {
    private String passwort="";


    public String erstellePasswort(String satz) {

        String[] split = satz.split(" ");
        StringBuilder builder = new StringBuilder();

        boolean klein=false;
        for (String wort : split) {
            for (int i=0;i<wort.length();i++) {


                char c = wort.charAt(i);
                if (Character.isLetter(c)) {
                    c=klein? Character.toUpperCase(c): Character.toLowerCase(c);
                    builder.append(c);
                    klein=!klein;
             break;
                }
            }
        }


        this.passwort=builder.toString();

        return passwort;
    }


    public void printPasswort() {
        System.out.println(passwort);
    }
}
