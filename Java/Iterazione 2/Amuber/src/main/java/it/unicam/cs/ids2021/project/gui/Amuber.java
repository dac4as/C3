package it.unicam.cs.ids2021.project.gui;

import it.unicam.cs.ids2021.project.Carrello;
import it.unicam.cs.ids2021.project.InteractionManager;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.interaction.ICliente;
import it.unicam.cs.ids2021.project.interaction.ICommerciante;
import it.unicam.cs.ids2021.project.interaction.ICorriere;
import it.unicam.cs.ids2021.project.users.Cliente;
import it.unicam.cs.ids2021.project.users.Commerciante;

import java.util.Scanner;

public class Amuber {

    public static void main(String[] args) {
        DBManager manager=DBManager.getIstance();

        Scanner reader = new Scanner(System.in);
        //Cliente cliente = new Cliente("Sara", "Girotti", "sara.girotti@gmail.com", "3967836373", "via dal cazzo 6", new Carrello());
        InteractionManager interaction = new InteractionManager();
        System.out.print("### Amuber v1 ###\n\n"
                + "Login as:\n"
                + "0: Cliente.\n"
                + "1: Commerciante\n"
                + "2: Corriere\n"
                + "9: Quit\n"
        );

        while (true) {
            System.out.print("> ");
            switch (reader.nextLine()) {
                case "0" -> new ICliente();
                case "1" -> new ICommerciante().init(manager.getCommercianti());
                case "2" -> new ICorriere();
                case "3" -> {
                    manager.testDB();
                }
                case "9" -> {
                    System.out.println("Arrivederci");
                    System.exit(1);
                }
                default -> {
                    System.out.print("Errore scelta!\n" + "Riprovare.\n");
                }
            }
        }




    }


}
