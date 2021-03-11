package Amuber.Interfacce;

import Amuber.Enums.Categoria;
import Amuber.Users.Cliente;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface ICliente {

    static void ricercaProdotto(Cliente cliente) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Selezionare la categoria da ricercare: ");
            Categoria categoria = null;

            switch (Integer.parseInt(console.readLine())) {
                case 1:
                    categoria = Categoria.Elettronica;
                    break;
                case 2:
                    categoria = Categoria.Alimentare;
                    break;
                case 3:
                    categoria = Categoria.Abbigliamento;
                    break;
                case 4:
                    categoria = Categoria.Bricolage;
                    break;
                case 5:
                    categoria = Categoria.Sport;
                    break;
                case 6:
                    categoria = Categoria.Cancelleria;
                    break;
                default:
                    System.err.println("Valore non accettato");
                    break;
            }






        } catch (IOException e) {
            System.err.println("Errore di input/output!");
            System.exit(1);
        } catch (NullPointerException e) {
            System.err.println("ERRORE: " + e.getMessage());
            System.exit(2);
        } catch (IllegalArgumentException e) {
            System.err.println("ERRORE: " + e.getMessage());
            System.exit(2);
        }
    }

}
