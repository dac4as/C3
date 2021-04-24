/**
 * - Può ricercare un prodotto e ricevere come risultato i negozi che lo vendono;
 * - Crea/Elimina/modifica ordine;
 * - Effettua pagamenti al Commerciante;
 * - Riceve alert:
 * - Per le promozioni (che possono essere filtrate)
 * - Tracciamento pacco (arrivo al punto di ritiro)
 * - Eventuali problemi di spedizione/ordine
 * - Viene autenticato al momento della ricezione del pacco tramite il codice emesso dal venditore
 */

package Amuber.Users;

import Amuber.Carrello;
import Amuber.Interfacce.IOFileTXT;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Cliente extends User {

    private final Carrello carrello;

    private String indirizzo;

    public Cliente(String email, String nome, String cognome, String recapito, String indirizzo, Carrello carrello) {
        super(email, nome, cognome, recapito);

        String path = "src/test/Amuber/Users/Cliente/" + this.getHashID();
        File directory = new File(path);
        if (!directory.exists()) {
            try {
                Files.createDirectories(Paths.get(path));
                System.out.println("Directory is created for " + this.getEmail() + " !");
            } catch (IOException e) {
                System.err.println("Failed to create directory for " + this.getEmail() + " ! -> " + e.getMessage());
            }
        } else System.out.println("Directory exist for " + this.getEmail() + " !");


        this.indirizzo = indirizzo;
        this.carrello = IOFileTXT.readCarrello(this);
    }

    public Carrello getCarrello() {
        return this.carrello;
    }
}