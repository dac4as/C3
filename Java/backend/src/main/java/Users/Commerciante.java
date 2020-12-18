package Users;

public class Commerciante extends User{

    public Commerciante(int hashID, String nomeUtente, String nome, String cognome, String recapito) {
        super(hashID, nomeUtente, nome, cognome, recapito);
        //TODO aggiungere i parametri specifici del commerciante quali la lista Magazzino
    }
}
