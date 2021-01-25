import java.util.ArrayList;
import java.util.List;

public class GestoreMagazzino {

    private ArrayList<Magazzino> listaMagazzini;

    public GestoreMagazzino(List<Magazzino> listaMagazzini) {
        this.listaMagazzini = new ArrayList<>(listaMagazzini);
    }


    public ArrayList<Prodotto> ricerca(String nome, Categoria categoria) {
        if (categoria == null) throw new NullPointerException();
        IOFileTXT IOFile = new IOFileTXT();

        if (nome == null)//ricerca per solo categoria, caricamento in memoria dei file
        {
            String path = "Java/backend/src/test/resources - 2/Magazzini/";
            //IOFile.readList(path);
            return null;
        }
        return null;
    }

}
