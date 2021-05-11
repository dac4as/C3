package it.unicam.cs.ids2021.project.gui;

import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.interaction.ICommerciante;
import it.unicam.cs.ids2021.project.users.Commerciante;

import java.beans.XMLEncoder;
import java.util.*;

public class Amuber {

    public static void main(String[] args) {
        DBManager manager = DBManager.getIstance();
        Amuber amuber = new Amuber();

        Scanner reader = new Scanner(System.in);
        //Cliente cliente = new Cliente("Sara", "Girotti", "sara.girotti@gmail.com", "3967836373", "via dal cazzo 6", new Carrello());
        System.out.print("### Amuber v1 ###\n\n"
                + "Login as:\n"
                + "0:       Cliente.\n"
                + "1:       Commerciante\n"
                + "2:       Corriere\n"
                + "exit:    Quit\n"
        );

/*        while (true) {
            System.out.print("> ");
            switch (reader.nextLine()) {
                case "0" -> {
                }
                case "1" -> {
                }
                case "2" -> {
                }
                case "3" -> {
                }
                case "exit" -> {
                    System.out.println("Arrivederci");
                    System.exit(1);
                }
                default -> {
                    System.out.print("Errore scelta!\n" + "Riprovare.\n");
                }
            }
        }*/


    }

    private void menuCommerciante(Commerciante commerciante) {

    }

}
