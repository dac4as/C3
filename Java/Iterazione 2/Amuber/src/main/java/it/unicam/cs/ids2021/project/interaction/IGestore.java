package it.unicam.cs.ids2021.project.interaction;

import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.users.Commerciante;

public class IGestore {

    private static IGestore istance;
    private final DBManager manager = DBManager.getIstance();

    public IGestore() {
    }

    public static IGestore getIstance() {
        return istance == null ? istance = new IGestore() : istance;
    }

    public boolean addCommerciante(Commerciante commerciante) {
        if (manager.getCommercianti().contains(commerciante)) return false;
        else {
            manager.addCommerciante(commerciante);
            return true;
        }
    }

    public boolean addMagazzino(Magazzino magazzino) {
        if (manager.getMagazzini(magazzino.getProprietario()).contains(magazzino)) return false;
        else {
            manager.addMagazzino(magazzino);
            return true;
        }
    }

    /*public boolean addProdotto(Prodotto prodotto) {
        if (manager.getProdotti(prodotto.getMagazzino()).contains(prodotto)) return false;
        else {
            manager.addProddotto(prodotto);
            return true;
        }
    }*/

}
