import java.io.*;
import java.util.*;

public class IOFileTXT implements SystemIO{

    @Override
    public Set<Prodotto> readList(String path) {
        return null;
    }

    @Override
    public void writeList(String path, List<Prodotto> list) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        for (Prodotto p : list) {
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
