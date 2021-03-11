package Amuber.Users;

import Amuber.Interfacce.MD5;

/**
 * Classe astratta (non istanziabile) che contiene tutte le informazioni che un utente registrato deve avere per poter utilizzare la piattaforma
 * in modo corretto
 * <p>
 * nomeUtente
 * email, forse o qualcosa del genere
 * recapito ---->il num di telefono sarà String
 * etc.
 */
public abstract class User {
    //private String nomeUtente;
    private String nome;
    private String cognome;
    private final String email;
    private String recapito;
    private final String hashID;

    //un user a livello concettuale è composto da....:
    public User(String email, String nome, String cognome, String recapito) {
        if (email == null || nome == null || cognome == null || recapito == null) throw new NullPointerException();
        this.email = email;
        this.nome = nome;
        this.cognome = cognome;
        this.recapito = recapito;
        this.hashID = MD5.setCodice(new String[]{email, cognome});
        //più tutti gli altri parametri specifici per tipologia di utente
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setRecapito(String recapito) {
        this.recapito = recapito;
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
}
