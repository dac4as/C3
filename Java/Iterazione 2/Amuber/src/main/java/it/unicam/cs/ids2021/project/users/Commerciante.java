package it.unicam.cs.ids2021.project.users;

import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.database.DBManager;

public class Commerciante extends User {

    DBManager manager = DBManager.getIstance();

    public Commerciante(String nome, String cognome, String email, String recapito) {
        super(nome, cognome, email, recapito);
    }

    public boolean aggiungiProdotto(Prodotto prodotto) {
        if (prodotto == null) return false;
        else {
            manager.addProddotto(prodotto);
            return true;
        }
    }


}
