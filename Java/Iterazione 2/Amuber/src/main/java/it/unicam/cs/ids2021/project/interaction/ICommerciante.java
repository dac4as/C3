package it.unicam.cs.ids2021.project.interaction;

import com.sun.glass.ui.Cursor;
import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.sources.MagManagerController;
import it.unicam.cs.ids2021.project.users.Commerciante;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

public class ICommerciante {

    private Commerciante commerciante;

    public Commerciante getCommerciante() {
        return commerciante;
    }

    public void setCommerciante(Commerciante commerciante) {
        this.commerciante = commerciante;
    }

    public void aggiungiProdotto(Prodotto prodotto, Magazzino magazzino) {

    }


    @FXML
    private Button btnConferma;
    @FXML
    private Label labelNominativo;
    @FXML
    private Label labelNumero;
    @FXML
    private Label labelMail;
    @FXML
    private Label labelID;
    @FXML
    private Label ID;
    @FXML
    private Label labelInfo;
    @FXML
    private ChoiceBox<Commerciante> boxCommercianti = new ChoiceBox<>();
    @FXML
    private Button btnAddProd;
    @FXML
    private Button btnVisualProd;

    public void initialize() {
        for (Commerciante tmp : DBManager.getIstance().getCommercianti())
            boxCommercianti.getItems().add(tmp);
        System.out.println("Item caricati: " + boxCommercianti.getItems());
    }

    public void sessionStart() {
        System.out.println("Selezionato: " + boxCommercianti.getValue());
        btnConferma.setDisable(true);
        boxCommercianti.setDisable(true);
        btnAddProd.setDisable(false);
        btnVisualProd.setDisable(false);
        labelInfo.setVisible(true);
        ID.setVisible(true);
        this.commerciante = boxCommercianti.getValue();
        labelNominativo.setText(commerciante.getNome() + " " + commerciante.getCognome());
        labelID.setText(commerciante.getHashID());
        labelNumero.setText(commerciante.getRecapito());
        labelMail.setText(commerciante.getEmail());
    }

    public void reset() {
        btnConferma.setDisable(false);
        boxCommercianti.setDisable(false);
        labelInfo.setVisible(false);
        ID.setVisible(false);
        btnAddProd.setDisable(true);
        btnVisualProd.setDisable(true);
        labelNominativo.setText("");
        labelID.setText("");
        labelNumero.setText("");
        labelMail.setText("");
    }

    public void newProdotto(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("Magazzino");
        //MagManagerController magm = new MagManagerController(getCommerciante());
        Parent newProdRoot = FXMLLoader.load(new File("src/main/java/it/unicam/cs/ids2021/project/sources/MagManager.fxml").toURI().toURL());
        Scene newProdScena = new Scene(newProdRoot);
        //recupero le informazioni della scena
        Stage nextWindow = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        nextWindow.setScene(newProdScena);
        nextWindow.show();
    }

}

