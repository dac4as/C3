package it.unicam.cs.ids2021.project;

public class Prodotto {

    private final String nome;
    private final String marca;
    private final int quantita;
    private final double prezzo;
    private final String descrizione;
    //TODO codice prodotto

    public Prodotto(String nome, String marca, int disponibilita, double prezzo, String descrizione) {
        this.nome = nome;
        this.marca = marca;
        this.quantita = disponibilita;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
