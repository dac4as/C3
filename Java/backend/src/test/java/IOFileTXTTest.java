import Users.Commerciante;
import org.junit.jupiter.api.Test;

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

        //modificata la lista di prodotti in Magazzino
        List<Prodotto> magazzino = new ArrayList<>();//ho aggiunto <Prodotto> che mi dava errore
        magazzino.add(prod1);
        magazzino.add(prod2);
        //write.writeList(filePath, magazzino);deprecated
        //System.out.println(magazzino.toString());

        Commerciante c = new Commerciante(123, "dac4as", "Nick", "Donato", "5555");
        Magazzino m = new Magazzino(magazzino, c);
        write.writeList(filePath, m);
        System.out.println(magazzino);
    }
}