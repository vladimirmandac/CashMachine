package cashmachine.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vladimir Mandač
 */

// Class for connect to database
public class DatabaseConnection {
    
    public Connection connecion;
    
    // localhost
    public static String server = "jdbc:mysql://localhost:3306/";
    public static String port = "3306";
    public static String database = "sql12192580";
    public static String databaseUser = "root";
    public static String databasePassword = "Nikolica2004@";
    
    // remote server 1
//    public static String server = "jdbc:mysql://sql12.freemysqlhosting.net:3306/";
//    public static String port = "3306";
//    public static String database = "sql12192580";
//    public static String databaseUser = "sql12192580";
//    public static String databasePassword = "Nikolica2004@";

    // connection with database
    public void connectionToDatabase() throws SQLException {
         connecion = DriverManager.getConnection(server + database , databaseUser, databasePassword);
    }    
}
