import Amuber.Magazzino;
import Amuber.Users.Commerciante;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        /** Simulo login utilizzando la mail "mario.rossi@gmail.com" **/

        //Il sistema recupera le informazioni riguardo Mario Rossi
        Commerciante comm1 = new Commerciante("mario.rossi@gmail.com", "Mario", "Rossi", "3225552431");

        //Il commerciante seleziona l'attività "Pencil Hub" tra le sue attività
        Magazzino mag1 = new Magazzino("Pencil Hub", comm1, "Via San Mario 34");

        //Il sistema recupera le informazioni riguardo Mario Rossi
        Commerciante comm2 = new Commerciante("antonio.corradi@gmail.com", "Antonio", "Corradi", "3246452343");

        //Il commerciante seleziona l'attività "Pencil Hub" tra le sue attività
        Magazzino mag2 = new Magazzino("Coop", comm2, "Via San Mario 5");

        //ICommerciante iCommerciante = new ICommerciante();
        //iCommerciante.aggiungiProdotto(mag1);
    }
}
