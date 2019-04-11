/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.SystemManagerRole;
import Business.UserAccount.CustomerAccount;
import Business.UserAccount.EmployeeAccount;
import Business.UserAccount.UserAccount;
import Interface.CustomerRole.CustomerProfileJPanel;
import java.awt.CardLayout;

/**
 *
 * @author ranranhe
 */
public class SystemManagerMainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SystemManagerMainJFrame
     */

    public SystemManagerMainJFrame(EcoSystem system, Network selectedNetwork, Enterprise selectedEnterprise, 
            String selectedCategory, EmployeeAccount employeeAccount, UserAccount customerAccount, 
            SystemManagerMainJPanel panel) {
        initComponents();
        this.setSize(950, 650);

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        /*if (selectedEnterprise instanceof Restaurant) {
            RestaurantManagerMainJPanel cp = new RestaurantManagerMainJPanel(system, this.jPanel1,
                    selectedNetwork, selectedEnterprise, employeeAccount, this, new SystemManagerRole());
            this.jPanel1.add(cp);
        }
        if (selectedEnterprise instanceof DeliveryCompany) {
            DeliveryCompanyManagerMainJPanel cp = new DeliveryCompanyManagerMainJPanel(system, this.jPanel1,
                    selectedNetwork, selectedEnterprise, employeeAccount, this, new SystemManagerRole());
            this.jPanel1.add(cp);
        }
        if (selectedEnterprise instanceof Store) {
            StoreManagerMainJPanel cp = new StoreManagerMainJPanel(system, this.jPanel1,
                    selectedNetwork, selectedEnterprise, employeeAccount, this, new SystemManagerRole());
            this.jPanel1.add(cp);
        }
        if (selectedEnterprise == null) {
            CustomerProfileJPanel cp = new CustomerProfileJPanel(system, panel, 
                    (CustomerAccount) customerAccount, this, new SystemManagerRole());
            this.jPanel1.add(cp);
        }*/
        CardLayout layout = (CardLayout) this.jPanel1.getLayout();
        layout.next(this.jPanel1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SystemManagerMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SystemManagerMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SystemManagerMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SystemManagerMainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SystemManagerMainJFrame().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
