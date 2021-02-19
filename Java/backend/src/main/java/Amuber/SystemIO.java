package Amuber;

import java.io.IOException;
/**DEPRECATED, andrà eliminata a meno che non ritorni utile durante la realizzazione dei salvataggi dei file**/
public interface SystemIO {

    Object readList(String path) throws IOException;

    void writeList(String path, Magazzino list) throws IOException;

}