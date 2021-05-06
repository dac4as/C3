package it.unicam.cs.ids2021.project.users;


import it.unicam.cs.ids2021.project.MD5;

public abstract class User {

    //private String nomeUtente;
    private final String nome;
    private final String cognome;
    private final String email;
    private final String recapito;
    private final String hashID;

    //un user a livello concettuale è composto da....:
    public User(String nome, String cognome, String email, String recapito) {
        if (nome == null || cognome == null || email == null || recapito == null)
            throw new NullPointerException("Errore dati inseriti.");
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.recapito = recapito;
        this.hashID = MD5.getHash2(email, cognome);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getRecapito() {
        return recapito;
    }

    public String getEmail() {
        return email;
    }

    public String getHashID() {
        return hashID;
    }

    public String toString() {
        return this.nome + " " + this.cognome + " " + this.email;
    }

}
