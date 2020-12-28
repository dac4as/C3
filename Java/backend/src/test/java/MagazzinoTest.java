import Users.Commerciante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class MagazzinoTest {
    @Test
    void addProdotto() {
        Prodotto prod1 = new Prodotto("Palla", "Adidas", 10, 5, "Oggetto sferico che rimbalza", Categoria.Sport);
        Prodotto prod2 = new Prodotto("Drone", "DJY", 8, 70.99f, "Coso che vola", Categoria.Elettronica);
        ArrayList<Prodotto> listaP = new ArrayList<>();

        Commerciante comm = new Commerciante( "dac4as", "Nick", "Donato", "5555");
        Magazzino m = new Magazzino(listaP, comm);

        assertTrue(m.addProdotto(prod1));
        assertTrue(m.addProdotto(prod2));
        System.out.println(m.toString());

    }
}
