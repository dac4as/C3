package it.unicam.cs.ids2021.project.database;

import it.unicam.cs.ids2021.project.users.Commerciante;

import java.sql.*;

public class DBManager {

    /**
     * e152bebdada49257c309f26518099257 - mario rossi
     * af60bcd80b2ff878a09c67ed2b4ee885 - antonio corradi
     */

    public static void main(String[] args) {
        String url = "jdbc:mysql://192.168.1.235:3306/amuber";
        String user = "root";
        String password = "amuber99";
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

        } catch (SQLException /*| ClassNotFoundException*/ throwables) {
            throwables.printStackTrace();
        }




    }
}