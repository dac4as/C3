/**
 * Classe che contiene l'istanziazione di un oggetto di tipo prodotto, il prodotto verrà creato al momento dell'aggiunta da parte
 * di un comemrciante al magazzino (che sono quindi disponibili per la vendita), che è una lista ed eventualmente salvato.
 */
public class Prodotto {

    private String nome;

    private int codice;

    private int disponibilita;

    private float prezzo;

    private String descrizione;

    private Categoria categoria;


    public Prodotto(int codice, String nome, int disponibilita, float prezzo, String descrizione, Categoria categoria) {
        this.codice = codice;
        this.nome = nome;
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

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    public float getPrezzo() {
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

    @Override
    public String toString() {
        return "Prodotto{" +
                "nome='" + nome + '\'' +
                ", codice=" + codice +
                ", disponibilita=" + disponibilita +
                ", prezzo=" + prezzo +
                ", descrizione='" + descrizione + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}