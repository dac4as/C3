package Amuber;

import Amuber.Enums.Categoria;
import Amuber.Users.Commerciante;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Set;

/**
 * lista di Prodotti, getters and setters
 * Il Amuber.Magazzino è concepito per essere "personale" per ogni commerciante/negozio.
 * In pratica è un OGGETTO che oltre a contenere la lista dei prodotti messi in vendita, conterrà le informazioni
 * del commerciante a cui appartiene
 */
public class Magazzino implements Comparable<Prodotto> {

    /**
     * HashMap<K,V>
     * K -> Amuber.Enums.Categoria
     * V -> Set<Amuber.Prodotto> = new HashSet<>()
     **/
    private HashMap<Categoria, Set<Prodotto>> listaProdotti;

    public String nome;
    public String indirizzo;
    public Commerciante proprietario;
    private final String hashID;

    public Magazzino(String nome, Commerciante commerciante, String indirizzo) {
        this.nome = nome;
        this.proprietario = commerciante;
        this.indirizzo = indirizzo;
        this.hashID = this.setCodice();
        this.listaProdotti = new HashMap<>();
    }

    public String setCodice() {
        String toReturn = nome + proprietario.getHashID();
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

    public String getHashID() {
        return hashID;
    }

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Commerciante getProprietario() {
        return proprietario;
    }

    public void getListaProdotti() {
        IOFileTXT filereader = new IOFileTXT();

    }

    @Override
    public String toString() {
        return "Amuber.Magazzino{\n" +
                "\tlistaProdotti=" + listaProdotti.toString() +
                "\n\tproprietario=" + proprietario.getCognome() +
                "}\n";
    }

    /*
    public ArrayList<Amuber.Prodotto> getListaProdotti() {
        return listaProdotti;
    }
     */

    /*
    public void increaseQuantity(Amuber.Prodotto p, int newQuantity) {
        if (newQuantity < 0) throw new IllegalArgumentException("La quantità deve essere maggiore di zero.");
        int indexP = this.listaProdotti.indexOf(p);
        Amuber.Prodotto tmp = listaProdotti.get(indexP);
        tmp.setDisponibilita(tmp.getDisponibilita() + newQuantity);
        listaProdotti.set(indexP, tmp);
    }

    public void decreaseQuantity(Amuber.Prodotto p, int newQuantity) {
        if (newQuantity < 0) throw new IllegalArgumentException("La quantità deve essere maggiore di zero.");
        int indexP = this.listaProdotti.indexOf(p);
        Amuber.Prodotto tmp = listaProdotti.get(indexP);
        if (newQuantity > tmp.getDisponibilita())
            throw new IllegalArgumentException("La quantità da rimuovere eccede lo stock.");
        tmp.setDisponibilita(tmp.getDisponibilita() - newQuantity);
        listaProdotti.set(indexP, tmp);
    }

     */

    /**
     * in main:
     * try{
     * magazzino.addProdotto(prodotto);
     * }
     * catch(IllegalArgumentException)
     * {
     * richiama modificaProdotto();
     * }
     */
    /*
    public boolean addProdotto(Amuber.Prodotto p) {
        if (listaProdotti.contains(p)) throw new IllegalArgumentException("Amuber.Prodotto già presente nel magazzino.");
        return listaProdotti.add(p);
    }

     */
    @Override
    public int compareTo(Prodotto o) {//viene/gono comparato/i il/i seguente/i parametro/i (di Amuber.Prodotto): codice
        return -1;
    }
}
