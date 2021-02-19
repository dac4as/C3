package Amuber.Users;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Commerciante extends User {

    public Commerciante(String email, String nome, String cognome, String recapito) {
        super(email, nome, cognome, recapito);

        String path = "src/test/Amuber/Users/Commerciante/" + this.getHashID();
        File directory = new File(path);
        if (!directory.exists()) {
            try {
                Files.createDirectories(Paths.get(path));
                System.out.println("Directory is created!");
            } catch (IOException e) {
                System.err.println("Failed to create directory!" + e.getMessage());
            }
        } else System.out.println("Directory exist");
    }

}
