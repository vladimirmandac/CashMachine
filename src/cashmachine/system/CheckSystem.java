package cashmachine.system;

import cashmachine.gui.LoginPanel;
import cashmachine.gui.MainFormJFrame;
import cashmachine.gui.system.MaintenanceSystemPanel;
import cashmachine.gui.system.UpdateSystemPanel;
import cashmachine.staticHelper.SingletonConnection;
import static cashmachine.staticHelper.StaticAttributes.softwareMaintenance;
import static cashmachine.staticHelper.StaticAttributes.softwareVersion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vladimir Mandač
 */
public class CheckSystem {
    
    // Method for checking software version and maintenance
    public static String checkSystem(String version) {
        
        if (MainFormJFrame.cashMachine.isEnabled()) {
            try {
                
                Connection connection = SingletonConnection.getConnection();
                
                Statement statement = connection.createStatement();
                String queryString = ("SELECT `newversion`, `maintenance` FROM system_update");
                ResultSet rs = statement.executeQuery(queryString);
                
                String checkVersion;
                Boolean checkmaintenance;
                
                while (rs.next()) {
                    
                    System.out.println(rs.getString(1));
                    System.out.println(rs.getBoolean(2));
                    
                    checkVersion = rs.getString(1);
                    checkmaintenance = rs.getBoolean(2);
                    
                    if ((!softwareVersion.equals(checkVersion)) && (checkmaintenance.equals(softwareMaintenance))) {
                        MainFormJFrame.cashMachine.changePanel(new UpdateSystemPanel());
                    }
                    
                    else if ((!softwareVersion.equals(checkVersion)) && (!checkmaintenance.equals(softwareMaintenance)) || ((softwareVersion.equals(checkVersion)) && (!checkmaintenance.equals(softwareMaintenance)))) {
                        MainFormJFrame.cashMachine.changePanel(new MaintenanceSystemPanel());
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
}
