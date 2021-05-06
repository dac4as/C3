package it.unicam.cs.ids2021.project;

import it.unicam.cs.ids2021.project.enums.Categoria;
import it.unicam.cs.ids2021.project.users.Commerciante;

import java.util.HashMap;
import java.util.Set;

public class Magazzino {

    private HashMap<Categoria, Set<Prodotto>> listaProdotti;//è una mappa

    private final String nome;
    private final Commerciante proprietario;
    private final String indirizzo;
    private final String hashID;


    public Magazzino(String nome, String indirizzo, Commerciante commerciante) {
        this.nome = nome;
        this.proprietario = commerciante;
        this.indirizzo = indirizzo;
        this.hashID = MD5.getHash2(nome, proprietario.getHashID());
    }

    public String getNome() {
        return nome;
    }

    public Commerciante getProprietario() {
        return proprietario;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public String getHashID() {
        return hashID;
    }
}
