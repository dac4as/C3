package Amuber;

import Amuber.Viste.ICommerciante;
import Amuber.Viste.IOFileTXT;
import Amuber.Users.Commerciante;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        //Simulo login (commerciante)
        // Antonio Corradi

        //Il sistema recupera le informazioni riguardo Mario Rossi
        Commerciante comm2 = new Commerciante("antonio.corradi@gmail.com", "Antonio", "Corradi", "3246452343");
        System.out.println(comm2.toString());

        //Il commerciante seleziona l'attività "Pencil Hub" tra le sue attività
        Magazzino mag2 = new Magazzino("Coop", comm2, "Via San Mario 5");
        Magazzino mag3 = new Magazzino("Coal", comm2, "Via San Mario 7");
        // Mario Rossi

        //Il sistema recupera le informazioni riguardo Mario Rossi
        Commerciante comm1 = new Commerciante("mario.rossi@gmail.com", "Mario", "Rossi", "3225552431");

        //Il commerciante seleziona l'attività "Pencil Hub" tra le sue attività
        Magazzino mag1 = new Magazzino("Pencil Hub", comm1, "Via San Mario 34");

        //Simulo aggiunta prodotto da parte del commerciante "Mario Rossi" nel magazzino di "Pencil Hub"

        //System.out.println(mag1.getClass().getSimpleName());
        ICommerciante iCommerciante = new ICommerciante();

        //iCommerciante.aggiungiProdotto(mag1);
        for(Commerciante c: IOFileTXT.getCommercianti())
        {
            System.out.println(c);
        }

        //Simulo login utilizzando la mail "germano.biagi@gmail.com" (cliente)

        //Cliente cli1 = new Cliente("germano.biagi@gmail.com", "Germano", "Biagi", "3344564574");

    }


}
