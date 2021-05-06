package it.unicam.cs.ids2021.project;

import it.unicam.cs.ids2021.project.users.Commerciante;

import java.util.HashMap;
import java.util.HashSet;

public class Carrello {

    private HashMap<Commerciante, HashSet<Prodotto>> prodotti;
    private double subtotale;

    public Carrello() {
        this.prodotti = new HashMap<>();
        this.subtotale = 0;
    }

    public HashMap<Commerciante, HashSet<Prodotto>> getProdotti() {
        return prodotti;
    }

    public void setProdotti(HashMap<Commerciante, HashSet<Prodotto>> prodotti) {
        this.prodotti = prodotti;
    }

    public double getSubtotale() {
        return subtotale;
    }

    public void setSubtotale(double subtotale) {
        this.subtotale = subtotale;
    }
}
