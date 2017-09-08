package cashmachine.staticHelper;

import cashmachine.gui.MainFormJFrame;
import cashmachine.gui.UserPanel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Vladimir Mandač
 */
public class StaticMethods {

    //Method for User Login
    public static String login(JComboBox a, JTextField b, JPasswordField c) {
//        if (a.getSelectedItem().equals("")) {
//            JOptionPane.showMessageDialog(null, "Must select User or Administrator.", "Error", JOptionPane.ERROR_MESSAGE);
//            a.requestFocus();
//        }
        if (a.getSelectedItem().equals("User") || a.getSelectedItem().equals("Administrator")) {
            if (b.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Must enter username.", "Error", JOptionPane.ERROR_MESSAGE);
                b.requestFocus();
            }
            
            if (c.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Must enter password.", "Error", JOptionPane.ERROR_MESSAGE);
                c.requestFocus();
            } else {
                try {
                    
//                    String choiceOfPrivilege = (String) a.getSelectedItem(); // not yet finished
                    
                    Connection connection = SingletonConnection.getConnection();
                    
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT `username`, `password` FROM users" /*+ choiceOfPrivilege*/ );
                    ResultSet rs = preparedStatement.executeQuery();
                    
                    String username;
                    String password;
                    
                    while (rs.next()) {                        
                        username = rs.getString(1);
                        password = rs.getString(2);
                        if (username.equals(b.getText()) && password.equals(c.getText())) {
                            MainFormJFrame.cashMachine.changePanel(new UserPanel());
                        } else {
                            JOptionPane.showMessageDialog(null, "The username or password you entered is not correct. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            b.requestFocus();
                        }
                    }
                } catch (SQLException ex) {
                }
            }
        }
        return a.getSelectedItem().toString();
    }
}
