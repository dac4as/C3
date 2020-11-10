# IDS-C3
Centro Commerciale in Centro (.gitignore aggiunto per cardif)

Centro Commerciale in Centro (C3)


Il progetto si rivolge ai centri abitati medi della provincia italiana dove le attività commerciali del centro soffrono la concorrenza di grossi centri commerciali situati nelle periferie. L’idea di fondo è considerare il trasporto della merce una volta acquistata.
Una delle scomodità principali degli acquisti in centro oltre alla più difficile collocazione dei punti vendita in relazione a specifiche categorie merceologiche. 
Il progetto si pone dunque come obiettivo quello di fornire un supporto per rendere l’esperienza degli acquisti in centro più facile e interessante. 
Si identificano in particolare i seguenti chiari attori con alcuni possibili scenari di utilizzo della piattaforma: 

Commerciante: vende la merce e definisce il punto di ritiro della stessa comunicando contestualmente al cliente la merce acquistata e i codici per il ritiro della stessa. Si registra sulla piattaforma e effettua i pagamenti e la gestione del suo account. Può avere delle statistiche sul numero di persone che sono in questo momento nell’area(???:Poco chiaro). Può lanciare vendite promozionali sui prodotti. Può consorziarsi con altri punti vendita per definire vendite combinate... In sostanza può usare la piattaforma per promuovere la propria attività al fine di poter vendere la sua merce 

Cliente: ritira la merce dai punti di prelievo. Può ricercare i punti vendita sulla base di specifiche categorie merceologiche. vuole essere allertato e magari filtrare le promozioni. Riceve alert se il sistema riconosce uno spostamento verso(???)

Corriere: si registra sulla piattaforma e si rende disponibile a effettuare trasporto della merce. Preleva la merce dai punti vendita. Rilascia la merce presso i punti di prelievo (che ne caso per i residenti in centro può essere la propria abitazione). ...   

*************************************************************************************************************************************************

Primo colloquio:
-
Definizione Attori Principali:

COMMERCIANTE----(assegna pacco)---->CORRIERE----(consegna pacco)---->CLIENTE(paga Piattaforma)

La vista dell'app varia in base alla tipologia di utente registrato (tipo UBER)

COMMERCIANTE:
- Vende la merce(gestione prezzi);
- Riceve/gestisce ordini presentati dai clienti;
- Si registra sulla piattaforma come Commerciante;
- Modifica lista prodotti;
- Definisce punto di ritiro merce (assegna codice univoco);
- (Può avere statistiche di utenti locali?);
- Può creare offerte e promozioni merce;
- Può consorziarsi (mettersi d'accordo ndr) con shop di stessa categoria per definire vendite combinate;
il tutto al fine di vendere la propria merce sulla piattaforma

CLIENTE:
- Può ricercare un prodotto e ricevere come risultato i negozi che lo vendono;
- Crea ordine;
- Elimina/modifica ordine;
- Effettua pagamenti al Commerciante;
- Riceve alert:
    - Per le promozioni (che possono essere filtrate)
    - Tracciamento pacco (arrivo al punto di ritiro)
    - Eventuali problemi di spedizione/ordine
- Viene autenticato al momento della ricezione del pacco tramite il codice emesso dal venditore

*************************************************************************************************************************************************

Secondo colloquio:
- 
Continuo definizione attori principali (sono 3 ma ne sono stati descritti 2):

CORRIERE:
- Effettua un login come corriere;
- Ha un sistema di feedback "gestito" da Clienti e Commercianti;
- Ha uno stato (se è in zona ed è libero);
- Ha una "categoria" dove specifica il veicolo che utilizza (leggero, medio, pesante, etc.);
- Consegna i pacchi nei punti di ritrovo (amazon locker);
- Può notificare cliente e/o commerciante per eventuali problemi/info;
