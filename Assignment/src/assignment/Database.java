/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author chrispasquali
 */
public class Database {
    public static Connection conn;

	/* NO NEED TO CALL THIS METHOD OUTSIDE THE DATABASE CLASS */
    public static void openConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:fitnessFanaticsDB.db");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

	/* Pass an SQL String into this method when querying the database */
    public ResultSet getResultSet(String sqlstatement) throws SQLException {
        openConnection();
        java.sql.Statement statement = conn.createStatement();
        ResultSet RS = statement.executeQuery(sqlstatement);
        return RS;
    }

	/* Pass an SQL String into this method when inserting data into the database */
    public static void insertStatement(String insert_query) throws SQLException {
        java.sql.Statement stmt = null;
        openConnection();
        try {
            System.out.println("Database opened successfully");
            stmt = conn.createStatement();
            System.out.println("The query was: " + insert_query);
            stmt.executeUpdate(insert_query);
            stmt.close();
//            conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        stmt.close();
    }
    
    public static void createLoginTable() throws SQLException {
       
        String createQuery = "CREATE TABLE login"
                + "(membershipNumber INTEGER PRIMARY KEY AUTOINCREMENT"
                + ", password TEXT NOT NULL"
                + ")";
        insertStatement(createQuery);
        
//        String insertQuery = "INSERT INTO login (username, password) "
//                + "VALUES ('Pretentious', 'Hipster')";
//        insertStatement(insertQuery);

    }
    
    public static void createProfileTable() throws SQLException {
       Connection conn = DriverManager.getConnection("jdbc:sqlite:fitnessFanaticsDB.db");
        Statement st = conn.createStatement();
        String createQuery = "CREATE TABLE musicList"
                + "(album TEXT NOT NULL"
                + ", artist TEXT NOT NULL"
                + ", genre TEXT NOT NULL"
                + ", year INTEGER"
                + ")";
        st.execute(createQuery);
        st.close();
        conn.close(); 
    }
    
}
