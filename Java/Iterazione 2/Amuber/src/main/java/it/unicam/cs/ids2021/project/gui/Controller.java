package it.unicam.cs.ids2021.project.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class Controller {

    @FXML
    private Button btnCommerciante;
    @FXML
    private Button btnCorriere;
    @FXML
    private Button btnCliente;
    @FXML
    private Button sysOut;

    public void consoleMode(javafx.event.ActionEvent actionEvent) throws IOException {
        //per test
    }

    public void pressBtnCliente(javafx.event.ActionEvent actionEvent) {
        System.out.println("cliente");
        //TODO Lancio interfaccia utente ICliente
    }

    /**
     * Quando verà premuto il btnCommerciante, verrà eseguito questo metodo per cambiare scena per ICommerciante
     *
     * @param actionEvent
     */
    public void pressBtnCommerciante(javafx.event.ActionEvent actionEvent) throws IOException {
        System.out.println("commerciante");
        Parent commercianteRoot = FXMLLoader.load(new File("src/main/java/it/unicam/cs/ids2021/project/sources/icommerciante.fxml").toURI().toURL());
        Scene commercianteScena = new Scene(commercianteRoot);
        //recupero le informazioni della scena
        Stage nextWindow = (Stage) ((javafx.scene.Node) actionEvent.getSource()).getScene().getWindow();
        nextWindow.setScene(commercianteScena);
        nextWindow.show();

    }

    public void pressBtnCorriere(javafx.event.ActionEvent actionEvent) {
        //TODO Classe Corriere
        //TODO lancio interfaccia ICorriere
    }

}
