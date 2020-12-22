

import Users.Commerciante;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


/**
 lista di Prodotti, getters and setters
 Il Magazzino è concepito per essere "personale" per ogni commerciante/negozio.
 In pratica è un OGGETTO che oltre a contenere la lista dei prodotti messi in vendita, conterrà le informazioni (penso statiche)
 del commerciante a cui appartiene
 */
public class Magazzino implements Comparable<Prodotto> {

    private List<Prodotto> listaProdotti;//Prodotti dovrebbe essere un ArrayList
    private Commerciante proprietario;

    public Magazzino(List<Prodotto> listaProdotti, Commerciante proprietario) {
        if(listaProdotti==null||proprietario==null) throw new NullPointerException();
        this.listaProdotti = new ArrayList<Prodotto>(listaProdotti);
        this.proprietario = proprietario;
    }


    public List<Prodotto> getListaProdotti(){
        return listaProdotti;
    }

    /*public Prodotto increaseQuantity(Prodotto p){
        int indexP = this.listaProdotti.indexOf(p);
        Prodotto tmp = this.listaProdotti.get(indexP);
        listaProdotti.set()
    }*/

    public boolean addProdotto(Prodotto p) throws IOException {
        if (p==null || p.getNome()==null) throw new NullPointerException();
        if(listaProdotti.contains(p))//aumenta la quantità
        {
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            int scelta;
            System.out.println("Prodotto già presente nel Magazzino\nAnnullare(1) o aggiornare(2)?[1/2]");
            scelta = console.read();
            switch(scelta) {
                case 1:
                    return false;
                case 2:
                    int indexP = this.listaProdotti.indexOf(p);
                    System.out.println("Bella zio");
                    return false;
                    //listaProdotti.set()
                default: return false;
            }
        }
        return listaProdotti.add(p);
    }

    public Commerciante getProprietario(){
        return this.proprietario;
    }

    @Override
    public int compareTo(Prodotto o) {//viene/gono comparato/i il/i seguente/i parametro/i (di Prodotto): codice
        return -1;
    }
}
