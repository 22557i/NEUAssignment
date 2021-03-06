/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.CustomerAccount;
import Business.UserAccount.UserAccount;
import UserInterface.LoginJFrame;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hui Huang
 */
public class CustomerMainJPanel extends javax.swing.JPanel {

        private EcoSystem system;
        private JPanel container;
        private UserAccount account;
        private CustomerAccount customerAccount;
        private JFrame frame;   
    /**
     * Creates new form CustomerMainJPanel
     */
    public CustomerMainJPanel(EcoSystem system, JPanel container, UserAccount account, JFrame frame) {
        initComponents();
        this.system = system;
        this.container = container;
        this.customerAccount = (CustomerAccount) account;
        this.frame = frame; 
        
        lblUsername.setText(customerAccount.getCustomer().getName());
        
        //给network city传入值
        cbChooseNetwork.removeAllItems();
        ArrayList<Network> networks = system.getNetworkList();
        for(Network network : networks) {
        cbChooseNetwork.addItem(network);
        }
        
        //给service type传入值，选cargo delivery 还是 pickup service
        cbChooseService.removeAllItems();
      
        cbChooseService.addItem("Cargo Delivery");
        cbChooseService.addItem("Pickup Service");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsername = new javax.swing.JLabel();
        btnMyAccount = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        cbChooseNetwork = new javax.swing.JComboBox();
        cbChooseService = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(161, 23, 21));
        lblUsername.setText("<Username> ");

        btnMyAccount.setBackground(new java.awt.Color(255, 255, 255));
        btnMyAccount.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnMyAccount.setForeground(new java.awt.Color(161, 23, 21));
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(161, 23, 21));
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        btnNext.setForeground(new java.awt.Color(161, 23, 21));
        btnNext.setText("Continue >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        cbChooseNetwork.setForeground(new java.awt.Color(161, 23, 21));
        cbChooseNetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbChooseNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseNetworkItemStateChanged(evt);
            }
        });
        cbChooseNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseNetworkActionPerformed(evt);
            }
        });

        cbChooseService.setForeground(new java.awt.Color(161, 23, 21));
        cbChooseService.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbChooseService.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseServiceItemStateChanged(evt);
            }
        });
        cbChooseService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChooseServiceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(161, 23, 21));
        jLabel2.setText("Choose Network");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(161, 23, 21));
        jLabel3.setText("Choose Service");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(161, 23, 21));
        jLabel1.setText("Customer   View");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                        .addComponent(lblUsername)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMyAccount))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbChooseNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChooseService, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNext))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMyAccount))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbChooseService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnLogout)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbChooseNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(btnNext)
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbChooseNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseNetworkActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_cbChooseNetworkActionPerformed

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        // TODO add your handling code here:
        CustomerAccountInfoJPanel caijp = new CustomerAccountInfoJPanel(this.system, this.container, this.customerAccount, this.frame, "customer");
        this.container.add(caijp);
        CardLayout layout = (CardLayout) this.container.getLayout();        
        layout.next(this.container);
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
       this.frame.dispose();//dispose()方法关闭窗体会释放该窗体的占用的部分资源。
        System.out.println(system.getNetworkList().size());
        
        LoginJFrame lf = new LoginJFrame();        
        lf.setLocationRelativeTo(null);//如果组件当前未显示或者 c 为 null，则此窗口将置于屏幕的中央。
        lf.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
       if(cbChooseNetwork.getSelectedItem() != null){
            Network network =(Network) cbChooseNetwork.getSelectedItem();
            
            String type =  (String)cbChooseService.getSelectedItem();
            ChooseCompanyJPanel ccjp = new ChooseCompanyJPanel(system, network, this.container, this.customerAccount, type, this.frame);
            this.container.add(ccjp);
            CardLayout layout = (CardLayout) this.container.getLayout();
            layout.next(this.container);
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a network!");
        }
        
    }//GEN-LAST:event_btnNextActionPerformed

    private void cbChooseServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChooseServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChooseServiceActionPerformed

    private void cbChooseNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseNetworkItemStateChanged
        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_cbChooseNetworkItemStateChanged

    private void cbChooseServiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseServiceItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbChooseServiceItemStateChanged
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnNext;
    private javax.swing.JComboBox cbChooseNetwork;
    private javax.swing.JComboBox cbChooseService;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
