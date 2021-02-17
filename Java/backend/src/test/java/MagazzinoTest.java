import Amuber.Enums.Categoria;
import Amuber.Prodotto;
import org.junit.jupiter.api.Test;

class MagazzinoTest {
    @Test
    void addProdotto() {
        /*
        Amuber.Prodotto prod1 = new Amuber.Prodotto("Palla", "Adidas", 10, 5, "Oggetto sferico che rimbalza", Amuber.Enums.Categoria.Sport);
        Amuber.Prodotto prod2 = new Amuber.Prodotto("Drone", "DJY", 8, 70.99f, "Coso che vola", Amuber.Enums.Categoria.Elettronica);
        ArrayList<Amuber.Prodotto> listaP = new ArrayList<>();

        Commerciante comm = new Commerciante( "dac4as", "Nick", "Donato", "5555", "Paradiso della Brugola");
        Amuber.Magazzino m = new Amuber.Magazzino(listaP, comm);

        assertTrue(m.addProdotto(prod1));
        assertTrue(m.addProdotto(prod2));
        System.out.println(m.toString());

         */
    }

    @Test
    void increaseQuantity() {
        Prodotto prod1 = new Prodotto("Razzetto", "China", 12, 5, "Razzetti per capodanno", Categoria.valueOf("Bricolage"));
        System.out.println(prod1.toString());

    }
}
