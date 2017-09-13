package cashmachine.staticHelper;

import cashmachine.gui.administrator.AdministratorPanel;
import static cashmachine.gui.LoginForm.jCheckBoxShowPsw;
import cashmachine.gui.MainFormJFrame;
import cashmachine.gui.user.UserPanel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Vladimir Mandač
 */
public class StaticMethods {
    
    // Method for User Login
    public static String login(JComboBox a, JTextField b, JPasswordField c) {

        if (a.getSelectedItem().equals("User") || a.getSelectedItem().equals("Administrator")) {
            try {

                Connection connection = SingletonConnection.getConnection();
                
                Statement statement = connection.createStatement();
                String queryString = ("SELECT `username`, `password`, `administrator` FROM users");
                ResultSet rs = statement.executeQuery(queryString);

                String username;
                String password;
                boolean adminStatus;

                while (rs.next()) {

                    username = rs.getString(1);
                    password = rs.getString(2);
                    adminStatus = rs.getBoolean(3);

                    if ((a.getSelectedItem().equals("User") && username.equals(b.getText()) && password.equals(c.getText()) && adminStatus == true) || (a.getSelectedItem().equals("User") && username.equals(b.getText()) && password.equals(c.getText()) && adminStatus == false)) {
                        MainFormJFrame.cashMachine.changePanel(new UserPanel());
                        break;
                    }
                    
                    else if (a.getSelectedItem().equals("Administrator") && username.equals(b.getText()) && password.equals(c.getText()) && adminStatus == false) {
                        JOptionPane.showMessageDialog(null, "You don't have access to the administration panel.\nTry again as a user.", "Error", JOptionPane.ERROR_MESSAGE);
                        a.requestFocus();
                        break;
                    }
                    
                    else if (a.getSelectedItem().equals("Administrator") && username.equals(b.getText()) && password.equals(c.getText()) && adminStatus == true) {
                        MainFormJFrame.cashMachine.changePanel(new AdministratorPanel());
                        break;
                    }
                    
                    else if (username.equals(b.getText().isEmpty()) && password.equals(c.getText())) {
                        JOptionPane.showMessageDialog(null, "Must enter username.", "Error", JOptionPane.ERROR_MESSAGE);
                        Border changeBorderUsername = BorderFactory.createLineBorder(Color.red, 2);
                        b.setBorder(changeBorderUsername);
                        Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                        c.setBorder(defaultBorder);
                        b.requestFocus();
                        break;
                    }
                    
                    else if (username.equals(b.getText()) && password.equals(c.getText().isEmpty())) {
                        JOptionPane.showMessageDialog(null, "Must enter password.", "Error", JOptionPane.ERROR_MESSAGE);
                        Border changeBorderPassword = BorderFactory.createLineBorder(Color.red, 2);
                        c.setBorder(changeBorderPassword);
                        Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                        b.setBorder(defaultBorder);
                        c.requestFocus();
                        break;
                    }
                    
                    else {
                        System.out.println("");
                    }
                }
                
                if (!rs.next()) {
                    b.setText("Wrong username ..");
                    jCheckBoxShowPsw.setSelected(true);
                    c.setEchoChar((char)0);
                    c.setText(".. or wrong password!");
                    b.setForeground(Color.red);
                    c.setForeground(Color.red);
//                    JOptionPane.showMessageDialog(null, "The username or password you entered is not correct. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
//                    b.setText("");
//                    c.setText("");
                    Border changeBorder = BorderFactory.createLineBorder(Color.red, 2);
                    b.setBorder(changeBorder);
                    c.setBorder(changeBorder);

                    b.requestFocus();
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
        return b.getText();
    }
}
