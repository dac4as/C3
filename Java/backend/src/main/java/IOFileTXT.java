import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IOFileTXT implements SystemIO{

    //TODO implementare scrittura in locale
    @Override
    public List<Prodotto> readList(String path) {
        return null;
    }

    @Override
    public void writeList(String path, Magazzino mag) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        for (Prodotto p : mag.getListaProdotti()) {
            bufferedWriter.append(p.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

/*
for (Categoria cat : Categoria.values()) {
    System.out.println(":" + cat + "\n" + ";");
}
*/
