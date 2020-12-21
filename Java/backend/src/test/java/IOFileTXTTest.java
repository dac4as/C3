import Users.Commerciante;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class IOFileTXTTest {

    @Test
    void writeList() throws IOException {
        IOFileTXT write = new IOFileTXT();
        String filePath = "src/test/resources/Magazzino.txt";
        //String filePath="resources/Magazzino.txt";
        Prodotto prod1 = new Prodotto(123, "Palla", 10, 5, "Oggetto sferico che rimbalza", Categoria.Sport);
        Prodotto prod2 = new Prodotto(456, "Drone", 8, 70.99f, "Coso che vola", Categoria.Elettronica);
        Prodotto prod3 = new Prodotto(0, "NullPointer", 0, 0.0f, "Coso che (non) crasha", null);//throws NullPointer()
        Prodotto prod4 = new Prodotto(789, "Carte", 3, 500.99f, "Carte da gioco", null);//not throws anything

        //modificata la lista di prodotti in Magazzino (vecchio metodo)
        List<Prodotto> magazzino = new ArrayList<>();
        magazzino.add(prod1);
        magazzino.add(prod2);
        //write.writeList(filePath, magazzino);deprecated
        //System.out.println(magazzino.toString());


        //nuovo metodo
        Commerciante comm = new Commerciante(123, "dac4as", "Nick", "Donato", "5555");//un prodotto può essere senza categoria
        //Commerciante cattivo;
        assertThrows(NullPointerException.class, ()->  new Commerciante(0, null, null, null, "666"));
        Magazzino m = new Magazzino(magazzino, comm);

        assertTrue(m.addProdotto(prod1));
        assertTrue(m.addProdotto(prod2));
        assertThrows(IllegalArgumentException.class, () -> m.addProdotto(prod3));
        assertDoesNotThrow(() -> m.addProdotto(prod4));
        assertTrue(m.addProdotto(prod4));
        write.writeList(filePath, m);
        System.out.println("Sto visualizzando il magazzino del negozio di " + m.getProprietario().getNome() +" "+ m.getProprietario().getCognome());
        System.out.println(magazzino);
    }
}