package Amuber;

import Amuber.Users.Commerciante;

abstract class Attivita {
    String nome;
    String indirizzo;
    Commerciante proprietario;

    public Attivita(String nome, String indirizzo, Commerciante proprietario) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.proprietario = proprietario;
    }
}