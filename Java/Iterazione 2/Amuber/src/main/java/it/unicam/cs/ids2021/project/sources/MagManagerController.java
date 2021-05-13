package it.unicam.cs.ids2021.project.sources;

import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.interaction.ICommerciante;
import it.unicam.cs.ids2021.project.users.Commerciante;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class MagManagerController {

    @FXML
    private final ChoiceBox<Magazzino> boxMagazzini = new ChoiceBox<>();
    private Commerciante commerciante;


    /*public MagManagerController(Commerciante commerciante) {
        this.commerciante=commerciante;
    }*/

    public void initialize() {
        for (Magazzino mag : DBManager.getIstance().getMagazzini(this.getCommerciante()))
            boxMagazzini.getItems().add(mag);
        System.out.println("Item caricati: " + boxMagazzini.getItems());
    }


    public Commerciante getCommerciante() {
        return commerciante;
    }
}
