/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.orp.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PRAISON
 */
public class ConnectionManager {

    private static ConnectionManager jdbc;

    protected ConnectionManager() {
    }

    /**
     * Singleton class to always return single instance
     *
     * @return
     */
    public static ConnectionManager getInstance() {
        if (jdbc == null) {
            jdbc = new ConnectionManager();
        }
        return jdbc;
    }

    /**
     * Logic to get connection
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    protected Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/orp", "orp", "orp");
       // con = DriverManager.getConnection("jdbc:mysql://localhost/orp?user=root&password=root");
        
        return con;
    }
}
