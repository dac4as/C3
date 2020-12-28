import Users.Commerciante;
import java.util.ArrayList;
import java.util.List;


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
        if (listaProdotti == null || proprietario == null) throw new NullPointerException();
        this.listaProdotti = new ArrayList<>(listaProdotti);
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Magazzino{\n" +
                "\tlistaProdotti=" + listaProdotti.toString() +
                "\n\tproprietario=" + proprietario.getCognome() +
                "}\n";
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void increaseQuantity(Prodotto p, int newQuantity) {
        if (newQuantity < 0) throw new IllegalArgumentException("La quantità deve essere maggiore di zero.");
        int indexP = this.listaProdotti.indexOf(p);
        Prodotto tmp = listaProdotti.get(indexP);
        tmp.setDisponibilita(tmp.getDisponibilita() + newQuantity);
        listaProdotti.set(indexP, tmp);
    }

    public void decreaseQuantity(Prodotto p, int newQuantity) {
        if (newQuantity < 0) throw new IllegalArgumentException("La quantità deve essere maggiore di zero.");
        int indexP = this.listaProdotti.indexOf(p);
        Prodotto tmp = listaProdotti.get(indexP);
        if (newQuantity > tmp.getDisponibilita())
            throw new IllegalArgumentException("La quantità da rimuovere eccede lo stock.");
        tmp.setDisponibilita(tmp.getDisponibilita() - newQuantity);
        listaProdotti.set(indexP, tmp);
    }

    public boolean addProdotto(Prodotto p) {
        if (listaProdotti.contains(p)) throw new IllegalArgumentException("Prodotto già presente nel magazzino.");
        return listaProdotti.add(p);
    }

    public Commerciante getProprietario() {
        return this.proprietario;
    }

    @Override
    public int compareTo(Prodotto o) {//viene/gono comparato/i il/i seguente/i parametro/i (di Prodotto): codice
        return -1;
    }
}
