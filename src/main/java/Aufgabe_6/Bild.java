package Aufgabe_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bild {


    private String bildFormat;
    private int bildBreite, bildHoehe, maxGrau;
    private int[][] bildPixel;






    public void leseBild(String dateiName)throws IOException {
        try {
            // Ressourcen-Datei sauber aus dem Klassenpfad holen
            Path path = Paths.get(
                    Objects.requireNonNull(Main.class.getClassLoader()
                                    .getResource(dateiName))
                            .toURI()
            );




            try (BufferedReader reader = Files.newBufferedReader(path)) {

                String zeile;

                do {
                    zeile = reader.readLine();

                } while (zeile != null && zeile.startsWith("#"));

                bildFormat = zeile;


                do {
                    zeile = reader.readLine();
                } while (zeile != null && zeile.startsWith("#"));

                if (zeile == null) {
                    throw new IOException("Unerwartetes Dateiende: Größe-Zeile fehlt.");
                }

                String[] groesse = zeile.trim().split("\\s+");
                bildBreite = Integer.parseInt(groesse[0]);
                bildHoehe = Integer.parseInt(groesse[1]);

                do {
                    zeile = reader.readLine();
                } while (zeile != null && zeile.startsWith("#"));

                if (zeile == null) {
                    throw new IOException("Unerwartetes Dateiende: maximaler Grauwert fehlt.");
                }
                maxGrau = Integer.parseInt(zeile);

                List<Integer> pixelList = new ArrayList<>();
                while ((zeile = reader.readLine()) != null) {
                    if (zeile.startsWith("#") || zeile.isBlank()) continue;

                    String[] tokens = zeile.trim().split("\\s+");
                    for (String token : tokens) {
                        pixelList.add(Integer.parseInt(token));
                    }
                }

                bildPixel = new int[bildHoehe][bildBreite];

                for (int i = 0; i < bildHoehe; i++) {
                    for (int j = 0; j < bildBreite; j++) {

                        bildPixel[i][j] = pixelList.get(i * bildBreite + j);
                    }
                }
            }
        }catch(IOException | URISyntaxException |NullPointerException e) {
            System.out.println("Fehler beim einlesen der Datei");
            e.printStackTrace();
        }
    }

    public void rotiereBild() {
        int breite=bildHoehe;
        int hoehe=bildBreite;
        int[][] rotiertPixel = new int[hoehe][breite];
        for (int i = 0; i < bildHoehe; i++) {
            for (int j = 0; j < bildBreite; j++) {
                rotiertPixel[bildBreite - 1 - j][i] = bildPixel[i][j];

            }
        }


        bildPixel = rotiertPixel;
        bildHoehe= bildPixel.length;
        bildBreite= bildPixel[0].length;
    }

    public void schreibeBild(String verzeichnis) throws IOException {
        LocalDate heute = LocalDate.now();
        String dateiname = heute + ".pgm"; // yyyy-mm-dd.pgm

        Path zielOrdner = Paths.get(verzeichnis);
        Files.createDirectories(zielOrdner);
        Path pfad = zielOrdner.resolve(dateiname);


        List<String> output = new ArrayList<>();
        output.add(bildFormat);
        output.add(bildBreite + " " + bildHoehe);
        output.add(String.valueOf(maxGrau));

        for (int[] zeile : bildPixel) {
            StringBuilder sb = new StringBuilder();
            for (int wert : zeile) {
                sb.append(wert).append(" ");
            }
            output.add(sb.toString().trim());
        }

        Files.write(pfad, output);
    }



    public String getBildFormat(){

        return bildFormat;
    }

    public int getBildBreite(){
        return bildBreite;
    }

    public int getBildHoehe(){
        return bildHoehe;
    }

    public int getMaxGrau(){
        return maxGrau;
    }

    public int[][] getBildPixel(){
        return bildPixel;
    }

    public void printBild(){
        for (int i=0;i<bildHoehe;i++){
            for (int j=0;j<bildBreite;j++){
                System.out.print(bildPixel[i][j] + " ");
            if (bildPixel[i][j] == 0){
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }




}
