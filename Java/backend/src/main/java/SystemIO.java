

import java.io.IOException;
import java.util.List;

public interface SystemIO {

    List<Prodotto> readList(String path);

    void writeList(String path, Magazzino list) throws IOException;

}