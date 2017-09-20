package cashmachine.gui.system;

import cashmachine.gui.LoginPanel;
import cashmachine.gui.MainFormJFrame;
import static cashmachine.staticHelper.StaticMethods.clickOnHyperlink;

/**
 *
 * @author Vladimir Mandač
 */
public class MaintenanceSystemPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaintenanceSystemPanel
     */
    public MaintenanceSystemPanel() {
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        jLabelFooter = new javax.swing.JLabel();
        jLabelDeveloper = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 102));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Back to login page");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(293, 332, 0, 0);
        add(jButton1, gridBagConstraints);

        jLabelFooter.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabelFooter.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.color1"));
        jLabelFooter.setText("Cash Machine © 2017 - made by ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(258, 286, 0, 0);
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
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(258, 3, 0, 270);
        add(jLabelDeveloper, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MainFormJFrame.cashMachine.changePanel(new LoginPanel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelDeveloperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeveloperMouseClicked
        // TODO add your handling code here:
        clickOnHyperlink();
    }//GEN-LAST:event_jLabelDeveloperMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelDeveloper;
    private javax.swing.JLabel jLabelFooter;
    // End of variables declaration//GEN-END:variables
}
