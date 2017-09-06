package cashmachine.testDatabase;

import cashmachine.staticHelper.SingletonConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vladimir Mandač
 */
public class NewClass {
    public void testDatabase() throws SQLException{
        User user = User.getInstance();
        System.out.println(user);
        Connection connection = SingletonConnection.getConnection();
        System.out.println(connection.isClosed());
    }
}