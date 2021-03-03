package Amuber;

import Amuber.Enums.Categoria;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Classe che contiene l'istanziazione di un oggetto di tipo prodotto, il prodotto verrà creato al momento dell'aggiunta da parte
 * di un comemrciante al magazzino (che sono quindi disponibili per la vendita), che è una lista ed eventualmente salvato.
 */
public class Prodotto implements Comparable<Prodotto> {

    final private String codice;

    private String nome;

    private String marca;

    private int disponibilita;

    private double prezzo;

    private String descrizione;

    private Categoria categoria;

    public Prodotto(String nome, String marca, int disponibilita, double prezzo, String descrizione, Categoria categoria) {
        if (nome == null || descrizione == null || categoria == null) throw new NullPointerException();
        if (disponibilita <= 0 || prezzo <= 0)
            throw new IllegalArgumentException("Non è possibile inserire valori non accettati");
        this.codice = this.setCodice(nome, marca, categoria);
        this.nome = nome;
        this.marca = marca;
        this.disponibilita = disponibilita;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.categoria = categoria;
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    private String setCodice(String nome, String marca, Categoria categoria) {
        String toReturn = categoria.toString() + nome + marca;
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
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String toFile() {
        /** codice nome marca disponibilita prezzo descrizione **/
        return codice + ';' + nome + ';' + marca + ';' + disponibilita + ';' + prezzo + ';' + descrizione + "\n";
    }

    @Override
    public String toString() {
        return "{nome=" + nome +
                ", codice=" + codice +
                ", disponibilita=" + disponibilita +
                ", prezzo=" + prezzo +
                ", descrizione=" + descrizione +
                ", categoria=" + categoria +
                "}\n";
    }


    @Override
    public int compareTo(Prodotto o) {
        if(this.getCodice().equals(o.getCodice())) return 0;
        else return 1;
    }
}