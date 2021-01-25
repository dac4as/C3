import java.io.*;

public class IOFileTXT implements SystemIO {

    //TODO implementare scrittura in locale
    @Override
    public Magazzino readList(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String test = br.readLine();
        return null;
    }

    @Override
    public void writeList(String path, Magazzino mag) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        for (Prodotto p : mag.getListaProdotti()) {
            bufferedWriter.append(p.toFile());
        }
        bufferedWriter.close();
    }
}

/*toString(?)
for (Categoria cat : Categoria.values()) {
    System.out.println(":" + cat + "\n" + ";");
}
*/
