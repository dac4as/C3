package it.unicam.cs.ids2021.project.users;

import it.unicam.cs.ids2021.project.Carrello;
import org.junit.jupiter.api.Test;

class ClienteTest {

    @Test
    void generateCliente() {
        Cliente cli = new Cliente("Sandra", "Mirti", "sandra.mirti@gmail.com", "3563428964", "Via vittorio emanuele 2");
        System.out.println(cli.getHashID());
    }

}