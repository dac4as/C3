package Amuber;

import Amuber.Enums.Categoria;
import Amuber.Users.Commerciante;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Set;

public class IOFileTXT {

    public HashMap<Categoria, Set<Prodotto>> readProdotti(Commerciante commerciante, Magazzino magazzino) {
        HashMap<Categoria, Set<Prodotto>> prodotti = new HashMap<>();

        String pathMagazzino = "Java/backend/src/test/Amuber/Users/Commerciante/" + commerciante.getHashID() + "/" + magazzino.getHashID();

        for(Categoria categoria: EnumSet.allOf(Categoria.class)) {
            //File file = new File(pathMagazzino + categoria);
            System.out.println(pathMagazzino + categoria);
        }


        return null;
    }


    //TODO implementare scrittura in locale
    public Magazzino readList(String path) throws IOException {
        /*
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String test = br.readLine();
         */
        return null;
    }

    public void writeList(String path, Magazzino mag) throws IOException {

        /*
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


        for (Amuber.Prodotto p : mag.getListaProdotti()) {
            bufferedWriter.append(p.toFile());
        }
        bufferedWriter.close();
         */
    }

}

/*toString(?)
for (Amuber.Enums.Categoria cat : Amuber.Enums.Categoria.values()) {
    System.out.println(":" + cat + "\n" + ";");
}
*/
