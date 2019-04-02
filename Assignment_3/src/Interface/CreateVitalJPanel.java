/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Patient;
import Business.PatientList;
import Business.VitalSignHistory;

import Business.VitalSigns;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tnaxy
 */
public class CreateVitalJPanel extends javax.swing.JPanel {

 
    /**
     * Creates new form CreateVitalJPanel
     */
    public CreateVitalJPanel() {
        initComponents();
    }
    private VitalSignHistory vsh;
    private PatientList pl;
    private JPanel rightJPanel;
    public CreateVitalJPanel(VitalSignHistory vsh,PatientList pl) {
        initComponents();
      this.vsh = vsh;
      this.pl=pl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTemperature = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtRepiratoryRate = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtWeightInPounds = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        labelTemperature.setText("Temperature");

        jLabel2.setText("Blood Pressure");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        txtRepiratoryRate.setPreferredSize(new java.awt.Dimension(6, 29));
        txtRepiratoryRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRepiratoryRateActionPerformed(evt);
            }
        });

        txtDate.setPreferredSize(new java.awt.Dimension(6, 29));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel3.setText("RepiratoryRate");

        labelDate.setText("Date");

        jLabel1.setFont(new java.awt.Font("等线", 1, 18)); // NOI18N
        jLabel1.setText("Create Vital Signs");

        btnSave.setText("save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtWeightInPounds.setPreferredSize(new java.awt.Dimension(6, 29));
        txtWeightInPounds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightInPoundsActionPerformed(evt);
            }
        });

        txtHeartRate.setPreferredSize(new java.awt.Dimension(6, 29));
        txtHeartRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeartRateActionPerformed(evt);
            }
        });

        jLabel4.setText("Weight(Pounds)");

        jLabel5.setText("Heart Rate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(labelTemperature)
                            .addComponent(jLabel3)
                            .addComponent(labelDate)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSave)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtBloodPressure)
                            .addComponent(txtRepiratoryRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtWeightInPounds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHeartRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRepiratoryRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWeightInPounds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(40, 40, 40)
                .addComponent(btnSave)
                .addGap(145, 145, 145))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtRepiratoryRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRepiratoryRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepiratoryRateActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        double temperature =Double.parseDouble( txtTemperature.getText());
        double  bp = Double.parseDouble(txtBloodPressure.getText());
        int pulse = Integer.parseInt(txtRepiratoryRate.getText());
        int RepiratoryRate = Integer.parseInt(txtRepiratoryRate.getText());
        int weight = Integer.parseInt(txtWeightInPounds.getText());
        String date = txtDate.getText();
        Patient pt = pl.addPatient();
        VitalSigns v = vsh.addVitals();
        v.setBloodPressure(bp);
        v.setDate(date);
        v.setHeartRate(pulse);
        v.setTemperature(temperature);
        v.setRepiratoryRate(RepiratoryRate);
        v.setWeightInPounds(weight);
        v.setWeightInKilo();
        pt.setPatientsVS(v);
        JOptionPane.showMessageDialog(null, "VitalSigns Added Successfully!!");
        
        txtBloodPressure.setText("");
        txtDate.setText("");
        txtRepiratoryRate.setText("");
        txtTemperature.setText("");
        txtWeightInPounds.setText("");
        txtHeartRate.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtWeightInPoundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightInPoundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightInPoundsActionPerformed

    private void txtHeartRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeartRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeartRateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTemperature;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtRepiratoryRate;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtWeightInPounds;
    // End of variables declaration//GEN-END:variables
}
