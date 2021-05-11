package it.unicam.cs.ids2021.project.database;

import it.unicam.cs.ids2021.project.users.Commerciante;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    private DBManager() {
        testDB();
    }

    public static DBManager getIstance() {
        return istance == null ? istance = new DBManager() : istance;
    }

    private boolean testDB() {
        boolean result = true;
        try {
            if (connection == null || connection.isClosed()) {
                connectDB();
                result = false;
            }
            DatabaseMetaData data = connection.getMetaData();
            System.out.println("Database connected, ready to go!");
            System.out.println("User: " + data.getUserName() + "\n");
            disconnectDB();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void disconnectDB() {
        try {
            connection.close();
            istance = null;
            statement = null;
        } catch (SQLException e) {
            System.out.println("Problems in closing the connection to the DB");
            e.printStackTrace();
        }
    }

    public void connectDB() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Problems in opening a connection to the DB");
            e.printStackTrace();
        }
    }

    public List<Commerciante> getCommercianti() {
        connectDB();
        List<Commerciante> commercianteList = new ArrayList<>();
        String sql = "SELECT * FROM amuber.Commerciante";
        try {
            ResultSet res = statement.executeQuery(sql);
            while (res.next()) {
                commercianteList.add(new Commerciante(
                        res.getString("nome"),
                        res.getString("cognome"),
                        res.getString("email"),
                        res.getString("recapito")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        disconnectDB();
        return commercianteList;
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



