package cashmachine.testDatabase;

import cashmachine.staticHelper.SingletonConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Vladimir Mandač
 */
public class CashMachine {
    
    public static void main(String[] args) throws SQLException, InterruptedException {

        // Checking connection with the database
        User user = User.getInstance();
        User user2 = User.getInstance();
        System.out.println(user);
        System.out.println(user == user2);

        NewClass nc = new NewClass();
        nc.testDatabase();

        System.out.println("Testing database..");
        for (int i = 0; i < 10; i++) {
            Connection connection = SingletonConnection.getConnection();
            System.out.println(connection);
        }
        System.out.println("");
        System.out.println("Connection successful!");
    }
}
