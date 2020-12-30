
import java.io.IOException;
import java.util.List;

public interface SystemIO {

    Object readList(String path) throws IOException;

    void writeList(String path, Magazzino list) throws IOException;

}