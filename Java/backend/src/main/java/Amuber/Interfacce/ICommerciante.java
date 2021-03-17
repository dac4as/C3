package Amuber.Interfacce;

import Amuber.Enums.Categoria;
import Amuber.Magazzino;
import Amuber.Prodotto;
import Amuber.Users.Commerciante;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EnumSet;

public class ICommerciante {

    @FXML
    private ChoiceBox<Commerciante> listaCommercianti = new ChoiceBox<>();

    @FXML
    public void initialize() throws FileNotFoundException {
        for(Commerciante c : IOFileTXT.getSetCommercianti())
            listaCommercianti.getItems().add(c);
    }

    public void aggiungiProdotto(Magazzino magazzino) throws IOException {//interfaccia dovrà essere senza firma

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            //andrebbe fatto qualche try-catch sennò bisogna rifare il prodotto da capo (in
            // caso di errore di input)
            System.out.println("\n### Aggiunta prodotto ###");

            //nome
            System.out.print("\nNome prodotto: ");
            String nomeP = console.readLine();

            //marca
            System.out.print("\nMarca di " + nomeP + ": ");
            String marcaP = console.readLine();

            //disponibilità
            System.out.print("\nInserire la disponibilità del prodotto (quantità): ");
            int disponibilita = Integer.parseInt(console.readLine());//Integer.parseInt(scanner.nextLine())

            //prezzo
            System.out.print("\nInserire il prezzo per un singolo pezzo: ");
            double prezzo = Double.parseDouble(console.readLine());//Double.parseDouble(System.console().readLine());

            //descrizione
            System.out.print("\nInserire una descrizione per " + nomeP + " (può essere lasciato vuoto): ");
            String descrizione = console.readLine();
            if (descrizione.isEmpty()) descrizione = "[NULL]";

            //categoria
            int i = 1;
            System.out.println();
            for (Categoria categoria : EnumSet.allOf(Categoria.class)) {
                System.out.println(i++ + " - " + categoria);
            }
            System.out.print("Categoria di " + nomeP + ": ");
            Categoria categoria = null;

            switch (Integer.parseInt(console.readLine())) {
                case 1:
                    categoria = Categoria.Elettronica;
                    break;
                case 2:
                    categoria = Categoria.Alimentare;
                    break;
                case 3:
                    categoria = Categoria.Abbigliamento;
                    break;
                case 4:
                    categoria = Categoria.Bricolage;
                    break;
                case 5:
                    categoria = Categoria.Sport;
                    break;
                case 6:
                    categoria = Categoria.Cancelleria;
                    break;
                default:
                    System.err.println("Valore non accettato");
                    break;
            }

            //System.out.print("\nIl prodotto " + nomeP + " verrà inserito nella categoria " + categoria.toString() + ".");

            console.close();

            if (magazzino.aggiuntaProdotto(new Prodotto(nomeP, marcaP, disponibilita, prezzo, descrizione, categoria))) {
                System.out.println("\n#### Prodotto modificato ####");
            } else System.out.println("\n#### Prodotto aggiunto ####");

        } catch (IOException e) {
            System.err.println("Errore di input/output!");
            System.exit(1);
        } catch (NullPointerException e) {
            System.err.println("ERRORE: " + e.getMessage());
            System.exit(2);
        } catch (IllegalArgumentException e) {
            System.err.println("ERRORE: " + e.getMessage());
            System.exit(2);
        }

        //new Prodotto("Penna a sfera", "Bic", 10, 0.99, "Penna nera in plastica", Categoria.Cancelleria)
    }
}
