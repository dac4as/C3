package Amuber.Users;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
        this.hashID = this.setCodice();
        //più tutti gli altri parametri specifici per tipologia di utente
    }

    /**
     * @return hashcode made by email and cognome of a user.
     */
    public String setCodice() {
        String toReturn = email + cognome;
        try {

            // Static getInstance method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // digest() method is called to calculate message digest
            //  of an input digest() return array of byte
            byte[] messageDigest = md.digest(toReturn.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }

        // For specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        //return Objects.hash(email, cognome);
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
