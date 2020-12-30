/**
 * - Può ricercare un prodotto e ricevere come risultato i negozi che lo vendono;
 * - Crea/Elimina/modifica ordine;
 * - Effettua pagamenti al Commerciante;
 * - Riceve alert:
 * - Per le promozioni (che possono essere filtrate)
 * - Tracciamento pacco (arrivo al punto di ritiro)
 * - Eventuali problemi di spedizione/ordine
 * - Viene autenticato al momento della ricezione del pacco tramite il codice emesso dal venditore
 */

package Users;

public class Cliente extends User{

    public Cliente(String nomeUtente, String nome, String cognome, String recapito) {
        super(nomeUtente, nome, cognome, recapito);
    }

}