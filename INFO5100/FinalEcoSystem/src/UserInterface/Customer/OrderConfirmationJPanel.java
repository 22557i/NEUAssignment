/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;


import Business.WorkQueue.OrderRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;

/**
 *
 * @author Hui Huang
 */
public class OrderConfirmationJPanel extends javax.swing.JPanel {
   
    private JPanel container;
    private OrderRequest orderRequest;
    
    /**
     * Creates new form CarOrderConfirmationJPanel
     */
    public OrderConfirmationJPanel(JPanel container, OrderRequest orderRequest) {
        initComponents();
        this.orderRequest = orderRequest;
        this. container = container;
        showinfo();
    }
    public void showinfo(){
        lblShowOrderID.setText(orderRequest.getId());
        lblShowOrderDate.setText(orderRequest.getDateString());
        lblShowCustomerName.setText(orderRequest.getCustomerName());
        lblShowPhone.setText(orderRequest.getCustomerPhone());
        lblShowRemark.setText(orderRequest.getRemark());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblOrderID = new javax.swing.JLabel();
        lblOrderDate = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblRemark = new javax.swing.JLabel();
        lblShowOrderID = new javax.swing.JLabel();
        lblShowOrderDate = new javax.swing.JLabel();
        lblShowCustomerName = new javax.swing.JLabel();
        lblShowPhone = new javax.swing.JLabel();
        lblShowRemark = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1200, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(161, 23, 21));
        jLabel1.setText("Order Submitted Successfully!");

        lblOrderID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrderID.setForeground(new java.awt.Color(161, 23, 21));
        lblOrderID.setText("Order ID");

        lblOrderDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOrderDate.setForeground(new java.awt.Color(161, 23, 21));
        lblOrderDate.setText("Order Date");

        lblCustomerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCustomerName.setForeground(new java.awt.Color(161, 23, 21));
        lblCustomerName.setText("Customer Name");

        lblPhone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(161, 23, 21));
        lblPhone.setText("Phone");

        lblRemark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRemark.setForeground(new java.awt.Color(161, 23, 21));
        lblRemark.setText("Remark");

        lblShowOrderID.setForeground(new java.awt.Color(161, 23, 21));
        lblShowOrderID.setText("<Order ID>");

        lblShowOrderDate.setForeground(new java.awt.Color(161, 23, 21));
        lblShowOrderDate.setText("<Order Date>");

        lblShowCustomerName.setForeground(new java.awt.Color(161, 23, 21));
        lblShowCustomerName.setText("<Customer Name>");

        lblShowPhone.setForeground(new java.awt.Color(161, 23, 21));
        lblShowPhone.setText("<Phone>");

        lblShowRemark.setForeground(new java.awt.Color(161, 23, 21));
        lblShowRemark.setText("<Remark>");

        backbtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backbtn.setForeground(new java.awt.Color(161, 23, 21));
        backbtn.setText("<< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jButton1.setText("Exit!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backbtn)
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblOrderDate)
                            .addComponent(lblOrderID)
                            .addComponent(lblCustomerName)
                            .addComponent(lblPhone)
                            .addComponent(lblRemark))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(lblShowOrderDate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblShowCustomerName)
                                    .addComponent(lblShowOrderID)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblShowRemark)
                                    .addComponent(lblShowPhone)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(471, 471, 471)
                        .addComponent(jButton1)))
                .addContainerGap(437, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtn)))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOrderID)
                    .addComponent(lblShowOrderID))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderDate)
                    .addComponent(lblShowOrderDate))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerName)
                    .addComponent(lblShowCustomerName))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(lblShowPhone))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRemark)
                    .addComponent(lblShowRemark))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(106, 106, 106))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblOrderDate;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRemark;
    private javax.swing.JLabel lblShowCustomerName;
    private javax.swing.JLabel lblShowOrderDate;
    private javax.swing.JLabel lblShowOrderID;
    private javax.swing.JLabel lblShowPhone;
    private javax.swing.JLabel lblShowRemark;
    // End of variables declaration//GEN-END:variables
}
