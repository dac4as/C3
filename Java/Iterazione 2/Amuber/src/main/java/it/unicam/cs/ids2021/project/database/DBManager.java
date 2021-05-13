package it.unicam.cs.ids2021.project.database;

import it.unicam.cs.ids2021.project.Magazzino;
import it.unicam.cs.ids2021.project.Prodotto;
import it.unicam.cs.ids2021.project.users.Commerciante;

import java.sql.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DBManager {

    /**
     * e152bebdada49257c309f26518099257 - mario rossi
     * af60bcd80b2ff878a09c67ed2b4ee885 - antonio corradi
     */

    private static DBManager istance;
    private final String url = "jdbc:mysql://crivelliserver.ddns.net:3306/amuber";
    private final String user = "admin";
    private final String password = "amuber99";
    private Connection connection;
    private Statement statement;

    public Statement getStatement() {
        return statement;
    }

    private DBManager() {
        testDB();
    }

    public static DBManager getIstance() {
        return istance == null ? istance = new DBManager() : istance;
    }

    public boolean testDB() {
        boolean result = true;
        try {
            if (connection == null || connection.isClosed()) {
                connectDB();
                result = false;
            }
            DatabaseMetaData data = connection.getMetaData();
            System.out.println("#####################################\n"
                    + "Database connected, ready to go!\n"
                    + "User: " + data.getUserName() + "\n"
                    + "#####################################");
            disconnectDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    private void disconnectDB() {
        try {
            connection.close();
            istance = null;
            statement = null;
        } catch (SQLException e) {
            System.out.println("Problems in closing the connection to the DB");
            e.printStackTrace();
        }
    }

    private void connectDB() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Problems in opening a connection to the DB");
            e.printStackTrace();
        }
    }

    public void executeQuery(String sql) {
        connectDB();
        try {
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        disconnectDB();
    }

    public Set<Commerciante> getCommercianti() {
        connectDB();

        Set<Commerciante> commerciantes = new HashSet<>();

        String sql = "SELECT * FROM amuber.Commerciante";
        try {
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                commerciantes.add(new Commerciante(
                        res.getString("nome"),
                        res.getString("cognome"),
                        res.getString("email"),
                        res.getString("recapito")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
        return commerciantes;
    }

    public void addCommerciante(Commerciante commerciante) {
        connectDB();

        String sql = "INSERT INTO amuber.Commerciante (idCommerciante, nome, cognome, email, recapito) VALUES ('"
                + commerciante.getHashID() + "', '"
                + commerciante.getNome() + "', '"
                + commerciante.getCognome() + "', '"
                + commerciante.getEmail() + "', '"
                + commerciante.getRecapito() + "')";
        try {
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
    }

    public Set<Magazzino> getMagazzini(Commerciante commerciante) {
        connectDB();

        String sql = "SELECT * FROM amuber.Magazzino WHERE idCommerciante = '"
                + commerciante.getHashID() + "'";

        Set<Magazzino> magazzinos = new HashSet<>();

        try {
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                magazzinos.add(new Magazzino(
                        res.getString("nome"),
                        res.getString("indirizzo"),
                        commerciante));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
        return magazzinos;
    }

    public void addMagazzino(Magazzino magazzino) {
        connectDB();

        String sql = "INSERT INTO amuber.Magazzino (idMagazzino, nome, indirizzo, idCommerciante) VALUES ('"
                + magazzino.getHashID() + "', '"
                + magazzino.getNome() + "', '"
                + magazzino.getIndirizzo() + "', '"
                + magazzino.getProprietario().getHashID() + "')";

        try {
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
    }

    //TODO sistemare (aggiungere categoria)
/*    public Set<Prodotto> getProdotti(Magazzino magazzino) {
        connectDB();

        String sql = "SELECT * FROM amuber.Prodotto WHERE idMagazzino = '"
                + magazzino.getHashID() + "'";

        Set<Prodotto> prodottos = new HashSet<>();

        try {
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                prodottos.add(new Prodotto(
                        res.getString("nome"),
                        res.getString("marca"),
                        Integer.getInteger(res.getString("disponibilita")),
                        Double.parseDouble(res.getString("prezzo")),
                        magazzino,
                        res.getString("descrizione")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
        return prodottos;
    }
    */

    public void addProddotto(Prodotto prodotto) {
        connectDB();

        String sql = "INSERT INTO amuber.Prodotto (idProdotto, nome, marca, disponibilita, prezzo, idMagazzino, descrizione) VALUES ('"
                + prodotto.getHashID() + "', '"
                + prodotto.getNome() + "', '"
                + prodotto.getMarca() + "', '"
                + prodotto.getQuantita() + "', '"
                + prodotto.getPrezzo() + "', '"
                + prodotto.getMagazzino().getHashID()
                + prodotto.getDescrizione() + "')";
        try {
            statement.execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        disconnectDB();
    }
}

/*public static void main(String[] args) {

    try {
        //Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        //String addUser = "insert into Commerciante (idCommerciante, nome, cognome, email, recapito) values ();";

        String sql = "select * from amuber.Commerciante where Commerciante.idCommerciante like 'af60bcd80b2ff878a09c67ed2b4ee885'";
        //String sql = "select * from amuber.Commerciante";
        ResultSet resultSet = statement.executeQuery(sql);

        //Commerciante commerciante = new Commerciante(resultSet.getString("nome"), resultSet.getString("cognome"),resultSet.getString("email"),resultSet.getString("recapito"));

        while (resultSet.next()) {
            Commerciante commerciante = new Commerciante(resultSet.getString("nome"), resultSet.getString("cognome"),resultSet.getString("email"),resultSet.getString("recapito"));
            System.out.println(resultSet.getString(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + " - " + resultSet.getString(4) + " - " + resultSet.getString(5));
            System.out.println(commerciante.getNome());
        }

    } catch (SQLException /*| ClassNotFoundException throwables) {
        throwables.printStackTrace();
    }
*/



