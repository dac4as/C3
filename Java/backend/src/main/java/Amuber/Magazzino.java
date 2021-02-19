package Amuber;

import Amuber.Enums.Categoria;
import Amuber.Users.Commerciante;

import java.io.IOException;
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
public class Magazzino{

    /**
     * HashMap<K,V>
     * K -> Amuber.Enums.Categoria
     * V -> Set<Amuber.Prodotto> = new HashSet<>()
     **/
    private HashMap<Categoria, Set<Prodotto>> listaProdotti;//è una mappa
    private Set<Prodotto> prodotti; //(hashset)

    public String nome;
    public String indirizzo;
    public Commerciante proprietario;
    private final String hashID;
    private final IOFileTXT interacter = new IOFileTXT();

    public Magazzino(String nome, Commerciante commerciante, String indirizzo) {
        this.nome = nome;
        this.proprietario = commerciante;
        this.indirizzo = indirizzo;
        this.hashID = this.setCodice();
        this.listaProdotti = new HashMap<>();
    }

    public String getHashID() {
        return hashID;
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

    public String getNome() {
        return nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Commerciante getProprietario() {
        return proprietario;
    }

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

    public void aggiuntaProdotto(Prodotto p) throws IOException {
        getListaProdotti(p.getCategoria());
        if(prodotti.contains(p))
            increaseQuantity(p);
        else
            prodotti.add(p);
        interacter.updaterByCategoria(prodotti, this, p.getCategoria());
    }

    public void getListaProdotti(Categoria c) {
        prodotti = interacter.readProdottiByCategoria(c,this);
    }

    @Override
    public String toString() {
        return "Magazzino{\n" +
                "\tlistaProdotti=" + listaProdotti.toString() +
                "\n\tproprietario=" + proprietario.getCognome() +
                "}\n";
    }


    public void increaseQuantity(Prodotto p) {
        for(Prodotto tmp : prodotti)
        {
            if(tmp.compareTo(p)==0) {
                tmp.setDisponibilita(tmp.getDisponibilita() + p.getDisponibilita());
                return;
            }
        }
    }


}
