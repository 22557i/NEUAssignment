/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.EcoSystem;
import Business.Enterprise.CargoDelivery.CargoDelivery;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PickupService.PickupService;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.CustomerAccount;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author Hui Huang
 */
public class ChooseCompanyJPanel extends javax.swing.JPanel {
    
        private EcoSystem system;
        private JPanel container;
        private CustomerAccount account;
        private Network network;
        
        private JFrame frame;
        private Organization organizaiton; 
        private boolean pivot;

    /**
     * Creates new form DrivingServiceJPanel
     */
    public ChooseCompanyJPanel(EcoSystem system, Network network, JPanel container, CustomerAccount account,String s, JFrame frame) {
        initComponents();
        this.system = system;
        this.container = container;
        this.account = account;
        this.frame = frame;
        this.network = network;
        pivot =   s.toLowerCase().contains("cargo")?true: false;
        
        
        populateTableCompany();
    }
    
    private void populateTableCompany() {
        DefaultTableModel dtm = (DefaultTableModel) tableCompany.getModel();
        dtm.setRowCount(0);
        if (pivot) {
            for (Enterprise res : network.getEnterpriseDir().getEnterpriseList()) {
                if(res instanceof  CargoDelivery){
                Object row[] = new Object[2];
                row[0] = res; //name
                row[1] = 8.8; //overall score
                dtm.addRow(row);
                }
            }
        }
       else {
            for (Enterprise res : network.getEnterpriseDir().getEnterpriseList()) {
               if(res instanceof PickupService){
                Object row[] = new Object[2];
                row[0] = res; //name
                row[1] = res.getOverallScore(); //overall score
                dtm.addRow(row);
               
               }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCompany = new javax.swing.JTable();
        detailPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(161, 23, 21));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNext.setForeground(new java.awt.Color(161, 23, 21));
        btnNext.setText("Next >>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        tableCompany.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableCompany.setForeground(new java.awt.Color(161, 23, 21));
        tableCompany.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Overall Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCompany.setPreferredSize(new java.awt.Dimension(120, 300));
        tableCompany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCompanyMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCompany);

        detailPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        detailPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 59, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void tableCompanyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCompanyMouseClicked
        // TODO add your handling code here:
         int index = tableCompany.getSelectedRow();
        TableModel model = tableCompany.getModel();

         if (index >= 0) {
            if (pivot) {
                CargoDelivery cargoAgency = (CargoDelivery) model.getValueAt(index, 0);
                CompanyDetailsJPanel panel = new CompanyDetailsJPanel(this.system, cargoAgency, this.account, network);
                detailPanel.remove(this);
                detailPanel.add(panel);
            }
            else{
                PickupService pickupAgency = (PickupService) model.getValueAt(index, 0);
                CompanyDetailsJPanel panel = new CompanyDetailsJPanel(this.system,pickupAgency, this.account, network);
                detailPanel.remove(this);
                detailPanel.add(panel);
            }

            CardLayout layout = (CardLayout) this.detailPanel.getLayout();
            layout.next(detailPanel);
        }
    }//GEN-LAST:event_tableCompanyMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
       int row = tableCompany.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(pivot){
            CargoDelivery organization1 = (CargoDelivery)tableCompany.getValueAt(row, 0);
            CardLayout layout = (CardLayout) this.container.getLayout();
            OrderDetailJPanel odjp = new OrderDetailJPanel(system, container, this.account, frame, organization1);
            this.container.add(odjp);
            
        layout.next(this.container);
        }else{
            PickupService organization2 = (PickupService)tableCompany.getValueAt(row, 0);
            CardLayout layout = (CardLayout) this.container.getLayout();
            OrderDetailJPanel odjp = new OrderDetailJPanel(system, container, this.account, frame, organization2);
            this.container.add(odjp);
            layout.next(this.container);
        }
      
        
      
        
       
    }//GEN-LAST:event_btnNextActionPerformed

    public void SetUpNetwork(Network network){
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCompany;
    // End of variables declaration//GEN-END:variables
}
