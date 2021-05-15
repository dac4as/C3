package it.unicam.cs.ids2021.project.interaction;

import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.users.Cliente;

public class ICliente {

    private Cliente cliente;
    private final DBManager manager = DBManager.getIstance();

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void ricercaProdotto() {

    }

    public boolean addCliente(Cliente cliente) {
        if (manager.getClienti().contains(cliente)) return false;
        else {
            manager.addCliente(cliente);
            return true;
        }
    }
}
