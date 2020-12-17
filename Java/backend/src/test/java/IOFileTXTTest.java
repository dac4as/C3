import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IOFileTXTTest {

    @Test
    void writeList() throws IOException {
        IOFileTXT write1 = new IOFileTXT();
        String filePath = "src/test/resources/Magazzino.txt";
        //String filePath="resources/Magazzino.txt";
        Prodotto prod1 = new Prodotto(123, "Palla", 10, 5, "Oggetto sferico che rimbalza", Categoria.Sport);
        List<Prodotto> magazzino = new ArrayList<>();
        magazzino.add(prod1);
        write1.writeList(filePath, magazzino);
        System.out.println(magazzino.toString());
    }
}