/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JLabel;


/**
 *
 * @author tnaxy
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    private Product product;
    public static File PhotoPath;
    public CreatePanel(Product product) {
        initComponents();
        this.product= product;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PhotoChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        BankAccountNumberTextField = new javax.swing.JTextField();
        LicenseNumberTextField = new javax.swing.JTextField();
        InternetProtocolAddressTextField = new javax.swing.JTextField();
        CreateButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        BirthDateTextField = new javax.swing.JTextField();
        TelephoneNumbersTextField = new javax.swing.JTextField();
        FaxNumberTextField = new javax.swing.JTextField();
        EmailAddressTextField = new javax.swing.JTextField();
        SocialSecurityNumberTextField = new javax.swing.JTextField();
        MedicalRecordNumberTextField = new javax.swing.JTextField();
        LinkedinTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        GeographicDataTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1200, 800));

        jLabel1.setFont(new java.awt.Font("等线", 0, 24)); // NOI18N
        jLabel1.setText("Create Your Product \\(^o^)/~");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Name");

        jLabel3.setText("BankAccount");

        jLabel4.setText("License Number");

        jLabel5.setText("Internet Protocol Address");

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });

        CreateButton.setFont(new java.awt.Font("黑体", 0, 18)); // NOI18N
        CreateButton.setText("Create");
        CreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Click for Create Product→→");

        jLabel7.setText("BirthDate");

        jLabel8.setText("Telephone Number");

        jLabel9.setText("Fax Number");

        jLabel10.setText("Email Address");

        jLabel11.setText("Social Security Number");

        jLabel12.setText("Medical Record Number");

        jLabel13.setText("GeographicData");

        BirthDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BirthDateTextFieldActionPerformed(evt);
            }
        });

        TelephoneNumbersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelephoneNumbersTextFieldActionPerformed(evt);
            }
        });

        FaxNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FaxNumberTextFieldActionPerformed(evt);
            }
        });

        EmailAddressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressTextFieldActionPerformed(evt);
            }
        });

        SocialSecurityNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SocialSecurityNumberTextFieldActionPerformed(evt);
            }
        });

        MedicalRecordNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalRecordNumberTextFieldActionPerformed(evt);
            }
        });

        LinkedinTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkedinTextFieldActionPerformed(evt);
            }
        });

        jLabel14.setText("Linkedin");

        GeographicDataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeographicDataTextFieldActionPerformed(evt);
            }
        });

        jButton1.setText("Browser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Choose Photos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(0, 13, Short.MAX_VALUE)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(NameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(BankAccountNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(LicenseNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(InternetProtocolAddressTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(LinkedinTextField)
                                .addComponent(MedicalRecordNumberTextField)
                                .addComponent(SocialSecurityNumberTextField)
                                .addComponent(EmailAddressTextField)
                                .addComponent(FaxNumberTextField)
                                .addComponent(TelephoneNumbersTextField)
                                .addComponent(BirthDateTextField)
                                .addComponent(GeographicDataTextField))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(750, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(BirthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelephoneNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FaxNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(EmailAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SocialSecurityNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(MedicalRecordNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LinkedinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(GeographicDataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankAccountNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LicenseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(InternetProtocolAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateButtonActionPerformed
        // TODO add your handling code here:
        //Binding the uses input to the product object;
        product.setName(NameTextField.getText());
        product.setBirthDate(BirthDateTextField.getText());
        product.setEmailAddresses(EmailAddressTextField.getText());
        product.setFaxNumber(FaxNumberTextField.getText());
        product.setGeographicData(GeographicDataTextField.getText());
        product.setLinkedin(LinkedinTextField.getText());
        product.setBankAccountNumber(BankAccountNumberTextField.getText());
        product.setLicenseNumber(LicenseNumberTextField.getText());
        product.setInternetProtocolAddress(InternetProtocolAddressTextField.getText());
        product.setMedicalRecordNumber(MedicalRecordNumberTextField.getText());
        product.setSocialSecurityNumber(SocialSecurityNumberTextField.getText());
        product.setTelephoneNumbers(TelephoneNumbersTextField.getText());
     
        
        //Prompt user that product was successfully created;
        
        JOptionPane.showMessageDialog(null,"Create Product Successfully ");
    }//GEN-LAST:event_CreateButtonActionPerformed

    private void BirthDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BirthDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BirthDateTextFieldActionPerformed

    private void TelephoneNumbersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelephoneNumbersTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelephoneNumbersTextFieldActionPerformed

    private void FaxNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FaxNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FaxNumberTextFieldActionPerformed

    private void EmailAddressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressTextFieldActionPerformed

    private void SocialSecurityNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SocialSecurityNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SocialSecurityNumberTextFieldActionPerformed

    private void MedicalRecordNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalRecordNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedicalRecordNumberTextFieldActionPerformed

    private void LinkedinTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkedinTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LinkedinTextFieldActionPerformed

    private void GeographicDataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeographicDataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GeographicDataTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser PhotoChooser= new JFileChooser();
        PhotoChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES );  
        PhotoChooser.showDialog(new JLabel(), "choose");  
        PhotoPath=PhotoChooser.getSelectedFile(); 
        System.out.println(PhotoPath.getAbsolutePath());
        JOptionPane.showMessageDialog(null,"Browse the Face Photo Successfully ");
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BankAccountNumberTextField;
    private javax.swing.JTextField BirthDateTextField;
    private javax.swing.JButton CreateButton;
    private javax.swing.JTextField EmailAddressTextField;
    private javax.swing.JTextField FaxNumberTextField;
    private javax.swing.JTextField GeographicDataTextField;
    private javax.swing.JTextField InternetProtocolAddressTextField;
    private javax.swing.JTextField LicenseNumberTextField;
    private javax.swing.JTextField LinkedinTextField;
    private javax.swing.JTextField MedicalRecordNumberTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JFileChooser PhotoChooser;
    private javax.swing.JTextField SocialSecurityNumberTextField;
    private javax.swing.JTextField TelephoneNumbersTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
