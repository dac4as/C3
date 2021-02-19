import Amuber.Magazzino;
import Amuber.Users.Commerciante;
import org.junit.jupiter.api.Test;

class CommercianteTest {
    @Test
    void test() {

        Commerciante comm1 = new Commerciante("mario.rossi@gmail.com", "Mario", "Rossi", "3225552431");
        Magazzino mag1 = new Magazzino("Pencil Hub", comm1, "Via San Mario 34");

        System.out.println("ComID: " + comm1.getHashID());
        System.out.println("MagID: " + mag1.getHashID());


        Commerciante comm2 = new Commerciante("giulio.marroni@gmail.com", "Giulio", "Marroni", "3224452321");
        Magazzino mag2 = new Magazzino("Copp", comm1, "Via San Mario 2");

        System.out.println("ComID: " + comm2.getHashID());
        System.out.println("MagID: " + mag2.getHashID());

    }
}