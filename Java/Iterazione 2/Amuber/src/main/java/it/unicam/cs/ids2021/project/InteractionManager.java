package it.unicam.cs.ids2021.project;

import it.unicam.cs.ids2021.project.interaction.ICliente;
import it.unicam.cs.ids2021.project.users.Cliente;
import it.unicam.cs.ids2021.project.users.Commerciante;
import it.unicam.cs.ids2021.project.users.User;

import java.util.Scanner;

public class InteractionManager {

    private ICliente iCliente;

    public InteractionManager(User user) {
        if(user instanceof Commerciante) iCliente = new ICliente();
    }

/*
    public InteractionManager(Commerciante user) {
        this.iCommerciante = new ICommerciante();
    }

    public InteractionManager(Corriere user) {
        this.iCorriere = new ICorriere();
    }
*/

    public void startICommerciante(Scanner reader) {
        System.out.println("### 'Login' as Commerciante \n"
                + "[INFO] Scegli cosa vuoi fare:\n"
                + "[INFO] Scegli 0 per assegnare un tavolo");

        iCliente.ricercaProdotto();
    }

}
