

import java.io.IOException;
import java.util.List;
import java.util.Set;

public interface SystemIO {

    Set<Prodotto> readList(String path);

    void writeList(String path, List<Prodotto> list) throws IOException;

}