package cashmachine.staticHelper;

import cashmachine.gui.MainFormJFrame;
import cashmachine.gui.UserPanel;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    //Method for User Login
    public static String login(JComboBox a, JTextField b, JPasswordField c) {
        
        if (a.getSelectedItem().equals("User") || a.getSelectedItem().equals("Administrator")) {
            if (b.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Must enter username.", "Error", JOptionPane.ERROR_MESSAGE);
                
                Border changeBorderUsername = BorderFactory.createLineBorder(Color.red , 2);
                b.setBorder(changeBorderUsername);
                Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                c.setBorder(defaultBorder);
//                SwingUtilities.updateComponentTreeUI(c);
                
                b.requestFocus();
            }
            
            else if (c.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Must enter password.", "Error", JOptionPane.ERROR_MESSAGE);
                
                Border changeBorderPassword = BorderFactory.createLineBorder(Color.red , 2);
                c.setBorder(changeBorderPassword);
                Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                b.setBorder(defaultBorder);
//                SwingUtilities.updateComponentTreeUI(b);
                
                c.requestFocus();
            }
            
            else if ((b.getText().isEmpty()) && (c.getText().isEmpty())) {
                Border changeBorder = BorderFactory.createLineBorder(Color.red , 2);
                b.setBorder(changeBorder);
                c.setBorder(changeBorder);
                b.requestFocus();
            } 
            
            else {
                try {
                    Connection connection = SingletonConnection.getConnection();
                    
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT `username`, `password` FROM users");
                    ResultSet rs = preparedStatement.executeQuery();
                    
                    String username;
                    String password;
                    
                    while (rs.next()) {     
                        
                        username = rs.getString(1);
                        password = rs.getString(2);
                        
                        if (username.equals(b.getText()) && password.equals(c.getText())) {
                            MainFormJFrame.cashMachine.changePanel(new UserPanel());
                            break;
                        }
                        
                        else if (username.equals(b.getText()) && password.equals(c.getText().isEmpty())) {
                            Border changeBorderPassword = BorderFactory.createLineBorder(Color.red , 2);
                            c.setBorder(changeBorderPassword);
                            Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                            b.setBorder(defaultBorder);
//                            SwingUtilities.updateComponentTreeUI(b);
                            c.requestFocus();
                            break;
                        }
                        
                        else if (username.equals(b.getText().isEmpty()) && password.equals(c.getText())) {
                            Border changeBorderUsername = BorderFactory.createLineBorder(Color.red , 2);
                            b.setBorder(changeBorderUsername);
                            Border defaultBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
                            c.setBorder(defaultBorder);
//                            SwingUtilities.updateComponentTreeUI(c);
                            b.requestFocus();
                            break;
                        }
                        
                        else {
                            JOptionPane.showMessageDialog(null, "The username or password you entered is not correct. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                            
                            Border changeBorder = BorderFactory.createLineBorder(Color.red, 2);
                            b.setBorder(changeBorder);
                            c.setBorder(changeBorder);
                            
                            b.requestFocus();
                            break;
                        }
                    }
                } catch (SQLException ex) {
                }
            }
        }
        return a.getSelectedItem().toString();
    }
}
