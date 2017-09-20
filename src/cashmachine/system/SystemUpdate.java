package cashmachine.system;

import cashmachine.gui.LoginPanel;
import cashmachine.gui.MainFormJFrame;
import cashmachine.gui.system.UpdateSystemPanel;
import cashmachine.staticHelper.SingletonConnection;
import static cashmachine.staticHelper.StaticAttributes.softwareVersion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vladimir Mandač
 */
public class SystemUpdate {
    
    // Method for checking software version
    public static String checkSystemUpdate(String version) {
        
        if (MainFormJFrame.cashMachine.isEnabled()) {
            try {
                
                Connection connection = SingletonConnection.getConnection();
                
                Statement statement = connection.createStatement();
                String queryString = ("SELECT newversion FROM system_update");
                ResultSet rs = statement.executeQuery(queryString);
                
                String checkVersion;
                
                while (rs.next()) {
                    
                    System.out.println(rs.getString(1));
                    
                    checkVersion = rs.getString(1);
                    
                    if (!softwareVersion.equals(checkVersion)) {
                        MainFormJFrame.cashMachine.changePanel(new UpdateSystemPanel());
                    }
                    
                    else {
                        MainFormJFrame.cashMachine.changePanel(new LoginPanel());
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        return softwareVersion;
    }
    
    // Method for system maintenance
    public static boolean maintenance(boolean maintenance) {
        return false;
    }
}
