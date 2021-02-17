import Amuber.Carrello;
import Amuber.Enums.Categoria;
import Amuber.Prodotto;
import Amuber.Users.Commerciante;
import org.junit.jupiter.api.Test;

class CarrelloTest {

    @Test
    void test() {
        Carrello test = new Carrello();
        Commerciante com1 = new Commerciante("prova@gmail.com", "pippo", "pluto", "234234234");
        Prodotto pro1 = new Prodotto("acqua", "dabeve", 1, 2.50, "dissetante e senza olio di palma", Categoria.Alimentare);
        Prodotto pro2 = new Prodotto("acqua", "disseta", 1, 3.50, "dissetante e senza olio di palma", Categoria.Alimentare);
        Prodotto pro3 = new Prodotto("acqua", "maronn", 1, 1, "dissetante e senza olio di palma", Categoria.Alimentare);

        test.addProdotto(com1, pro1);
        System.out.println(test.getSubtotale());
        test.addProdotto(com1, pro2);
        System.out.println(test.getSubtotale());
        test.addProdotto(com1, pro3);
        System.out.println(test.getSubtotale());
    }
}