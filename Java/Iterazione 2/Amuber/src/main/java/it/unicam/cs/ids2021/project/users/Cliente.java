package it.unicam.cs.ids2021.project.users;

import it.unicam.cs.ids2021.project.Carrello;

public class Cliente extends User {

    private final Carrello carrello;
    private String indirizzo;

    public Cliente(String nome, String cognome, String email, String recapito, String indirizzo, Carrello carrello) {
        super(nome, cognome, email, recapito);

        this.indirizzo = indirizzo;
        this.carrello = new Carrello();
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }
}
