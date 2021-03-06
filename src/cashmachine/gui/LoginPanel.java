package cashmachine.gui;

import static cashmachine.staticHelper.StaticMethods.clickOnHyperlink;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;

/**
 *
 * @author Vladimir Mandač
 */
public class LoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        jLabel5.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel5 = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        jButtonRegister = new javax.swing.JButton();
        jCheckBoxShowPswL = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLogin = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordFieldLogin = new javax.swing.JPasswordField();
        jTextFieldLogin = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jButtonForgotPsw = new javax.swing.JButton();
        jLabelFooter = new javax.swing.JLabel();
        jLabelDeveloper = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(60, 63, 65));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cashmachine/images/cashmachine-gui.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 351;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 10, 0, 4);
        add(jLabel5, gridBagConstraints);

        jPanelLogin.setBackground(new java.awt.Color(153, 153, 153));
        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 30), java.awt.Color.white)); // NOI18N
        jPanelLogin.setForeground(new java.awt.Color(60, 63, 65));
        jPanelLogin.setToolTipText("");
        jPanelLogin.setMinimumSize(new java.awt.Dimension(400, 200));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(400, 200));

        jButtonRegister.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(102, 0, 0));
        jButtonRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cashmachine/images/icons/signup-icon.png"))); // NOI18N
        jButtonRegister.setText("Register");
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jCheckBoxShowPswL.setText("Show Password");
        jCheckBoxShowPswL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowPswLActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Choose:");

        jComboBoxLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Administrator" }));
        jComboBoxLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxLogin.setMaximumSize(new java.awt.Dimension(159, 26));
        jComboBoxLogin.setMinimumSize(new java.awt.Dimension(159, 26));
        jComboBoxLogin.setPreferredSize(new java.awt.Dimension(159, 26));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Password:");

        jPasswordFieldLogin.setMaximumSize(new java.awt.Dimension(159, 26));
        jPasswordFieldLogin.setMinimumSize(new java.awt.Dimension(159, 26));
        jPasswordFieldLogin.setPreferredSize(new java.awt.Dimension(159, 26));
        jPasswordFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldLoginKeyPressed(evt);
            }
        });

        jTextFieldLogin.setMaximumSize(new java.awt.Dimension(159, 26));
        jTextFieldLogin.setMinimumSize(new java.awt.Dimension(159, 26));
        jTextFieldLogin.setPreferredSize(new java.awt.Dimension(159, 26));

        jButtonLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(0, 73, 147));
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cashmachine/images/icons/inside-logout-icon.png"))); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonForgotPsw.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButtonForgotPsw.setForeground(new java.awt.Color(0, 73, 147));
        jButtonForgotPsw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cashmachine/images/icons/Emoticon-Realize-Shock-Forgot-icon.png"))); // NOI18N
        jButtonForgotPsw.setText("Forgot Password");
        jButtonForgotPsw.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonForgotPsw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForgotPswActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addGap(16, 16, 16)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLoginLayout.createSequentialGroup()
                                .addComponent(jButtonLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBoxShowPswL, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLoginLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel2)
                            .addGap(15, 15, 15)
                            .addComponent(jComboBoxLogin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelLoginLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(15, 15, 15)
                            .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButtonForgotPsw)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(jComboBoxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPasswordFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckBoxShowPswL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonForgotPsw)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(97, 197, 0, 0);
        add(jPanelLogin, gridBagConstraints);

        jLabelFooter.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelFooter.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color1"));
        jLabelFooter.setText("Cash Machine © 2017 - made by ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 258, 0, 0);
        add(jLabelFooter, gridBagConstraints);

        jLabelDeveloper.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelDeveloper.setForeground(new java.awt.Color(0, 73, 147));
        jLabelDeveloper.setText("Vladimir Mandac");
        jLabelDeveloper.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelDeveloper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeveloperMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 3, 0, 0);
        add(jLabelDeveloper, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        
        cashmachine.staticHelper.StaticMethods.login(jComboBoxLogin, jTextFieldLogin, jPasswordFieldLogin);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jCheckBoxShowPswLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPswLActionPerformed
        // TODO add your handling code here:
        if (jCheckBoxShowPswL.isSelected()) {
            jPasswordFieldLogin.setEchoChar((char)0);
        } else {
            jPasswordFieldLogin.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPswLActionPerformed

    private void jPasswordFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldLoginKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            cashmachine.staticHelper.StaticMethods.login(jComboBoxLogin, jTextFieldLogin, jPasswordFieldLogin);
        }
    }//GEN-LAST:event_jPasswordFieldLoginKeyPressed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        MainFormJFrame.cashMachine.changePanel(new RegisterPanel());
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jButtonForgotPswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForgotPswActionPerformed
        // TODO add your handling code here:
        ForgotPassword forgotPassword = new ForgotPassword();
        forgotPassword.setVisible(true);
    }//GEN-LAST:event_jButtonForgotPswActionPerformed

    private void jLabelDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeveloperMouseClicked
        // TODO add your handling code here:
        clickOnHyperlink();
    }//GEN-LAST:event_jLabelDeveloperMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonForgotPsw;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegister;
    public static javax.swing.JCheckBox jCheckBoxShowPswL;
    private javax.swing.JComboBox<String> jComboBoxLogin;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDeveloper;
    private javax.swing.JLabel jLabelFooter;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldLogin;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
