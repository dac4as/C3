package Users;


public class Commerciante extends User{

    private String attivita;

    public Commerciante(String nomeUtente, String nome, String cognome, String recapito, String attivita) {
        super(nomeUtente, nome, cognome, recapito);
        if(attivita==null) throw new NullPointerException();
        this.attivita=attivita;

    }

//TODO aggiungere i parametri specifici del commerciante

    public String getAttivita() {
        return attivita;
    }

    public void setAttivita(String attivita) {
        this.attivita = attivita;
    }
}
