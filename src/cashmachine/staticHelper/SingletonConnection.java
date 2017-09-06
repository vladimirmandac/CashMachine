package cashmachine.staticHelper;

import static cashmachine.model.DatabaseConnection.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Vladimir Mandač
 */
// Singleton
public class SingletonConnection {

    private static Connection connection;

    public SingletonConnection() {
        
    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(server + database , databaseUser , databasePassword);
        }
        return connection;
    }
}
