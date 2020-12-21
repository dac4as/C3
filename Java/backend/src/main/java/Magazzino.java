import Users.Commerciante;

import java.util.ArrayList;
import java.util.List;


/**
 lista di Prodotti, getters and setters
 Il Magazzino è concepito per essere "personale" per ogni commerciante/negozio.
 In pratica è un OGGETTO che oltre a contenere la lista dei prodotti messi in vendita, conterrà le informazioni (penso statiche)
 del commerciante a cui appartiene
 */
public class Magazzino {

    private List<Prodotto> listaProdotti;//Prodotti dovrebbe essere un ArrayList
    private Commerciante proprietario;

    public Magazzino(List<Prodotto> listaProdotti, Commerciante proprietario) {
        this.listaProdotti = new ArrayList<Prodotto>(listaProdotti);
        this.proprietario = proprietario;
    }

    public List<Prodotto> getListaProdotti(){
        return listaProdotti;//.toString()?
    }

    /*public Commerciante getProprietario(){
       String nome=this.proprietario.nome;
       String cognome=this.proprietario.cognome;
       return proprietario.nome;//.toString()?
    }*/

    public boolean addProdotto(Prodotto p){
        if (p==null) throw new NullPointerException();
        return listaProdotti.add(p);
    }


}
