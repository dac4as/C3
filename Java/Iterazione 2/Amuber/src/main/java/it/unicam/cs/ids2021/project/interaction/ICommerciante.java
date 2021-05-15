package it.unicam.cs.ids2021.project.interaction;

import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.users.Commerciante;

public class ICommerciante {

    private Commerciante commerciante = null;
    private Magazzino magazzino = null;
    private final DBManager manager = DBManager.getIstance();

    public ICommerciante() {

    }

    public Commerciante getCommerciante() {
        return commerciante;
    }

    public void setCommerciante(Commerciante commerciante) {
        this.commerciante = commerciante;
    }

    public Magazzino getMagazzino() {
        return this.magazzino;
    }

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }

    public boolean aggiuntaProdotto(Prodotto prodotto) {
        if (prodotto == null) return false;
        else {
            manager.addProddotto(prodotto);
            return true;
        }
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


/*
    public ComboBox<Commerciante> lista_commercianti;
    public Button select_commerciante;
    public Button reset_commerciante;
    public Label comm_id;
    public Label comm_nome;
    public Label comm_cognome;
    public Label comm_recapito;
    public GridPane table_magazzino;
    public ComboBox<Magazzino>lista_magazzini;
    public Button select_magazzino;
    public Button reset_magazzino;
    public Label mag_id;
    public Label mag_indirizzo;
    public Tab tab_funzioni;

    public void initialize() {
        lista_commercianti.getItems().addAll(manager.getCommercianti());
    }

    public void commercianteSelected() {
        this.commerciante = lista_commercianti.getValue();
        lista_commercianti.setDisable(true);
        select_commerciante.setDisable(true);
        reset_commerciante.setDisable(false);
        comm_id.setText(commerciante.getHashID());
        comm_nome.setText(commerciante.getNome());
        comm_cognome.setText(commerciante.getCognome());
        comm_recapito.setText(commerciante.getRecapito());
        table_magazzino.setVisible(true);
        lista_magazzini.getItems().clear();
        lista_magazzini.getItems().addAll(manager.getMagazzini(this.commerciante));
        lista_magazzini.setDisable(false);
        select_magazzino.setDisable(false);
    }

    public void commercianteResetted() {
        this.commerciante = null;
        lista_commercianti.setDisable(false);
        select_commerciante.setDisable(false);
        reset_commerciante.setDisable(true);
        comm_id.setText("");
        comm_nome.setText("");
        comm_cognome.setText("");
        comm_recapito.setText("");
        table_magazzino.setVisible(false);
        this.lista_magazzini.getItems().clear();
        lista_magazzini.setDisable(true);
        select_magazzino.setDisable(true);
        reset_magazzino.setDisable(true);
        mag_id.setText("");
        mag_indirizzo.setText("");
        tab_funzioni.setDisable(true);
    }

    public void magazzinoSelected() {
        this.magazzino = lista_magazzini.getValue();
        select_magazzino.setDisable(true);
        reset_magazzino.setDisable(false);
        mag_id.setText(magazzino.getHashID());
        mag_indirizzo.setText(magazzino.getIndirizzo());
        tab_funzioni.setDisable(false);
    }

    public void magazzinoResetted() {
        this.magazzino = null;
        lista_magazzini.setValue(null);
        select_magazzino.setDisable(false);
        reset_magazzino.setDisable(true);
        mag_id.setText("");
        mag_indirizzo.setText("");
        tab_funzioni.setDisable(true);
    }
    */
}

