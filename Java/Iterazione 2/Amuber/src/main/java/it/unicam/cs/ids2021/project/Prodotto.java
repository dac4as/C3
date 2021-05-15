package it.unicam.cs.ids2021.project;

import it.unicam.cs.ids2021.project.enums.Categoria;

import java.util.Objects;

public class Prodotto {

    private final String nome;
    private final String marca;
    private final Categoria categoria;
    private final int quantita;
    private final double prezzo;


    private final Magazzino magazzino;
    private final String descrizione;
    private final String hashID;

    public Prodotto(String nome, String marca, Categoria categoria, int quantita, double prezzo, Magazzino magazzino, String descrizione) {
        this.nome = nome;
        this.marca = marca;
        this.categoria = categoria;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.magazzino = magazzino;
        this.descrizione = descrizione;
        this.hashID = MD5.getHash2(nome, marca, magazzino.getHashID());
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getHashID() {
        return hashID;
    }

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public String toString() {
        return this.hashID + " - "
                + this.nome + " - "
                + this.marca + " - "
                + this.categoria + " - "
                + this.quantita + " - "
                + this.prezzo + " - "
                + this.magazzino.getHashID() + " - "
                + this.descrizione;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return hashID.equals(prodotto.hashID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashID);
    }
}
