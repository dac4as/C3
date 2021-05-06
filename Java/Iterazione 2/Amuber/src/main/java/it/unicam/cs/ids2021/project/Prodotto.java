package it.unicam.cs.ids2021.project;

public class Prodotto {

    private final String nome;
    private final String marca;
    private final int disponibilita;
    private final double prezzo;
    private final String descrizione;

    public Prodotto(String nome, String marca, int disponibilita, double prezzo, String descrizione) {
        this.nome = nome;
        this.marca = marca;
        this.disponibilita = disponibilita;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
