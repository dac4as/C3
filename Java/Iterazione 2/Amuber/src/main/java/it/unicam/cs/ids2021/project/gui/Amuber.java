package it.unicam.cs.ids2021.project.gui;

import it.unicam.cs.ids2021.project.Carrello;
import it.unicam.cs.ids2021.project.users.Cliente;

import java.util.Scanner;

public class Amuber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //Cliente cliente = new Cliente("Sara", "Girotti", "sara.girotti@gmail.com", "3967836373", "via dal cazzo 6", new Carrello());

        System.out.print("### Amuber v1 ###\n\n"
                + "Login as:\n"
                + "0: Cliente.\n"
                + "1: Commerciante\n"
                + "2: Corriere\n"
                + "9: Quit\n"
                + "> "
        );

        while (true) {
            switch (reader.nextLine()) {
                case "0" -> System.out.println("Cliente");
                case "1" -> System.out.println("Commerciante");
                case "2" -> System.out.println("Corriere");
                case "9" -> {
                    System.out.println("Arrivederci");
                    System.exit(1);
                }
                default -> {
                    System.out.print("Errore scelta!\n" + "Riprovare.\n" + ">");
                }
            }
        }


    }


}
