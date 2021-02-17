package Amuber;

import java.io.IOException;

public interface SystemIO {

    Object readList(String path) throws IOException;

    void writeList(String path, Magazzino list) throws IOException;

}