package Users;

import java.util.Objects;

/**Classe astratta (non istanziabile) che contiene tutte le informazioni che un utente registrato deve avere per poter utilizzare la piattaforma
 * in modo corretto
 *
 *  nomeUtente
 *  password
 *  email, forse o qualcosa del genere
 *  recapito ---->il num di telefono sarà String
 * etc.
 *
 *
 */
public abstract class  User {
    private String nomeUtente;
    private String nome;
    private String cognome;
    //private String email;
    private String recapito;
    private int hashID;

    //un user a livello concettuale è composto da....:
    public User(int hashID, String nomeUtente, String nome, String cognome, String recapito)
    {
        if(nomeUtente==null||nome==null||cognome==null) throw new NullPointerException();
        this.hashID=this.hashCode();
        this.nomeUtente=nomeUtente;
        this.nome=nome;
        this.cognome=cognome;
        this.recapito=recapito;
        //più tutti gli altri parametri specifici per tipologia di utente
    }


    public int hashCode(){
        return Objects.hash(nomeUtente,cognome);//identificativo basato sull'hash di Objects sul nomeUtente e cognome, i parametri si possono modificare e al momento li ho messi arbitrari
    }


    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
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

}
