package it.unicam.cs.ids2021.project.interaction;

import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.database.DBManager;
import it.unicam.cs.ids2021.project.enums.Categoria;
import it.unicam.cs.ids2021.project.users.Commerciante;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IGestoreTest {

    private final DBManager manager = DBManager.getIstance();
    private IGestore iGestore = IGestore.getIstance();

    @Test
    void addCommerciante() {

        Commerciante comm1 = new Commerciante("Giovanna", "Lombardini", "federica.lombardini@gmail.com", "3452377694");

        String sql = "DELETE FROM amuber.Commerciante WHERE idCommerciante LIKE '" + comm1.getHashID() + "' ESCAPE '#' ";
        manager.executeQuery(sql);

        assertTrue(iGestore.addCommerciante(comm1));
        assertFalse(iGestore.addCommerciante(comm1));
    }

    @Test
    void addMagazzino() {
        Commerciante comm1 = new Commerciante("Giovanna", "Lombardini", "federica.lombardini@gmail.com", "3452377694");
        Magazzino mag1 = new Magazzino("Pencil Hub", "Via San Mario 34", comm1);

        String sql = "DELETE FROM amuber.Magazzino WHERE idMagazzino LIKE '" + mag1.getHashID() + "' ESCAPE '#' ";
        manager.executeQuery(sql);

        assertTrue(iGestore.addMagazzino(mag1));
        assertFalse(iGestore.addMagazzino(mag1));

    }

    @Test
    void addProdotto() {
        //TODO da finire
        Commerciante comm1 = new Commerciante("Giovanna", "Lombardini", "federica.lombardini@gmail.com", "3452377694");
        Magazzino mag1 = new Magazzino("Pencil Hub", "Via San Mario 34", comm1);
        //Prodotto pro1 = new Prodotto("Matita", "Staedtler", 10, 2.50, "Matita HB per disegno", Categoria.Cancelleria, mag1);
        //Prodotto pro2 = new Prodotto("Colla", "Print", 12, 5.99, "Colla comune", Categoria.Cancelleria, mag1, "fdssfs");

        String sql = "DELETE FROM amuber.Magazzino WHERE idMagazzino LIKE '" + mag1.getHashID() + "' ESCAPE '#' ";
        manager.executeQuery(sql);

        assertTrue(iGestore.addMagazzino(mag1));
        assertFalse(iGestore.addMagazzino(mag1));

    }
}