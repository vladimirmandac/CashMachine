package cashmachine.staticHelper;

import cashmachine.gui.administrator.AdministratorPanel;
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
import static cashmachine.gui.LoginPanel.jCheckBoxShowPswL;
import cashmachine.gui.MainFormJFrame;
import static cashmachine.gui.RegisterPanel.jComboBoxCountry;
import cashmachine.gui.SplashScreen;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.internet.*;
import javax.mail.*;

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
                    
                    else {
                        System.out.println("");
                    }
                }
                
                if (!rs.next()) {
                    b.setText("Wrong username ..");
                    jCheckBoxShowPswL.setSelected(true);
                    c.setEchoChar((char)0);
                    c.setText(".. or wrong password!");
                    b.setForeground(Color.red);
                    c.setForeground(Color.red);
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
    
    // Method for registering a new user
//    public static void registerNewUser() {
//        
//    }
    
    // Method for retrieving data from database column(countries.country) and display in JcomboBox
    public static void countryJcBFillData() {
        try {
            Connection connection = SingletonConnection.getConnection();
                
                Statement statement = connection.createStatement();
                String queryString = ("SELECT `country` FROM countries");
                ResultSet rs = statement.executeQuery(queryString);
                
                String countries;
                
                while (rs.next()) {
                    countries = rs.getString(1);
                    jComboBoxCountry.addItem(countries);
                }
                
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    
    // Method to open hyperlink in browser after click
    public static void clickOnHyperlink() {
        try {
            // Click to jLabelDeveloper from footer
            String strURL = "https://goo.gl/nXcjBn";    
            Desktop.getDesktop().browse(URI.create(strURL));
        } catch (IOException ex) {
            Logger.getLogger(StaticMethods.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    // Method for splash screen
    public static void startSplashScreen() {
        
        SplashScreen splashScreen = new SplashScreen();
        MainFormJFrame mainFormJFrame = new MainFormJFrame();
        
        splashScreen.setVisible(true);
        mainFormJFrame.setVisible(false);
        
        try {
            for (int i = 0; i <= 100; i++) {
//                Thread.sleep(100);
                Thread.sleep(30);
                
                SplashScreen.jLabelLoading.setText(Integer.toString(i) + "%");
                SplashScreen.jProgressBarLoading.setValue(i);
                
                if (i > 2 && i <= 23) {
                    SplashScreen.jLabelChecking.setText("Loading Modules...");
                }
                else if (i > 23 && i <= 30) {
                    SplashScreen.jLabelChecking.setText("Loading Modules done...");
                }
                else if (i > 30 && i <= 60) {
                    SplashScreen.jLabelChecking.setText("Checking system...");
                }
                else if (i > 60 && i <= 85) {
                    SplashScreen.jLabelChecking.setText("Checking system updates...");
                }
                else if (i > 85 && i <= 92) {
                    SplashScreen.jLabelChecking.setText("Checking system done...");
                }
                else if (i > 92 && i <= 99) {
                    SplashScreen.jLabelChecking.setText("Starting system...");
                }
                else if (i == 100) {
                    splashScreen.setVisible(false);
                    mainFormJFrame.setVisible(true);
                }
            }
        } catch (InterruptedException ex) {
            System.out.println(ex);
            SplashScreen.jPanelErrorMsg.setVisible(true);
            SplashScreen.jLabelErrorMsg.setText("An unexpected error occurred, please try later.");
        }
    }
    
    // Method for configuring email client
    public static void emailClient(String to, String emailFromSystem, String emailPassword, 
            String emailSubject, String messageFromSystem /* ,String forgotenPsw*/ ) throws SQLException {
        
//        try {
//            Connection connection = SingletonConnection.getConnection();
//            Statement statement = connection.createStatement();
//                String queryString = ("SELECT `email`, `emailpassword` FROM admins");
//                ResultSet rs = statement.executeQuery(queryString);
//
//                while (rs.first()) {
//
//                emailFromSystem = rs.getString(1);
//                emailPassword = rs.getString(2);
//                }
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
        
        // Get the session object
        Properties properties = new Properties();
        properties.put("mail.smtp.host" , "smtp.gmail.com");
        properties.put("mail.smtp.socketFactory.port", "465");
        properties.put("mail.smtp.socketFactory.class" , "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.auth" , "true");
        properties.put("mail.smtp.port" , "465");
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emailFromSystem, emailPassword);
            }
        });
        
        // Compose message
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(emailFromSystem));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(emailSubject);
            message.setText(messageFromSystem);
        } catch (Exception e) {
        }
    }
}
