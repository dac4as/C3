import java.io.*;
import java.util.TreeSet;

public class IOFileTXT {
    public static void writeList(String path, TreeSet<Prodotto> fileContent) throws IOException
    {
        File file=new File(path);
        FileWriter fileWriter=new FileWriter(file,false);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for(Prodotto p : fileContent) {
            bufferedWriter.append(p.toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
