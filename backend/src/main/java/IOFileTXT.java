import java.io.*;
import java.util.*;

public class IOFileTXT {

    public void writeList(String path, List<Prodotto> fileContent) throws IOException
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
