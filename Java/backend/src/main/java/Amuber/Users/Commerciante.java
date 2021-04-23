package Amuber.Users;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Commerciante extends User {

    public Commerciante(String email, String nome, String cognome, String recapito) {
        super(email, nome, cognome, recapito);

        String pathComm = "src/test/Amuber/Users/Commerciante/" + this.getHashID();
        File directoryComm = new File(pathComm);

        File datiCommerciante = new File("src/test/Amuber/Users/Commerciante/email.txt");

        if (!directoryComm.exists()) {
            try {
                Files.createDirectories(Paths.get(pathComm));
                System.out.println("Directory is created for " + this.getEmail() + " !");


                //il file lista.txt va aggiornato
                if (datiCommerciante.createNewFile()) {
                    System.out.println("File email created: " + datiCommerciante.getName());
                } else {
                    System.out.println("File email already exists.");
                }
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(datiCommerciante, true));
                    bufferedWriter.write(this.toFile());
                    //chiudo il file
                    bufferedWriter.close();
                } catch (FileNotFoundException e) {
                    System.out.println("File email not found");
                } catch (IOException e) {
                    System.out.println("Error initializing stream");
                }


            } catch (IOException e) {
                System.err.println("Failed to create directory for " + this.getEmail() + " ! -> " + e.getMessage());
            }
        } else System.out.println("Directory exist for " + this.getEmail() + " !");
    }
}
