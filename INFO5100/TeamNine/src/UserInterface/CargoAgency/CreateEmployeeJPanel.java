/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CargoAgency;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.Role;
import javax.swing.JPanel;
import Business.Enterprise.CargoDeliveryCompany.CargoDelivery;
//import Business.Enterprise.DeliveryCompany.DeliveryCompany;
import Business.Enterprise.PickupServiceCompany.PickupService;
import Business.Organization.Organization;
import Business.Role.BossRole;
import Business.Role.Driver;

import Business.Role.ManagerRole;
import UserInterface.PickUpAgency.PickUpAgencyWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author junxiang
 */
public class CreateEmployeeJPanel extends javax.swing.JPanel {
    private EcoSystem system;
    private Enterprise en;
    private JPanel panel;
    private JPanel workPanel;
    private Role role;
    /**
     * Creates new form CreateEmployeeJPanel
     */
    public CreateEmployeeJPanel(EcoSystem system, JPanel panel, JPanel workPanel, Enterprise en, Role role) {
        initComponents();
        this.system = system;
        this.panel = panel;
        this.workPanel = workPanel;
        this.en = en;
        this.role = role;
        
        if (en instanceof CargoDelivery || en instanceof PickupService) {
            if (role.getRoleType().equals(Role.RoleType.SystemManager)) {
                roleComboBox.addItem(Role.RoleType.Boss);
                roleComboBox.addItem(Role.RoleType.Manager);
            }
            if (role.getRoleType().equals(Role.RoleType.Boss)) {
                roleComboBox.addItem(Role.RoleType.Manager);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        roleComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CreateEAjButton1 = new javax.swing.JButton();
        CancelEAjButton2 = new javax.swing.JButton();
        passwordField1 = new javax.swing.JPasswordField();
        passwordField2 = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create Employee Account");

        jLabel2.setText("Username: ");

        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Role: ");

        jLabel4.setText("Email: ");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Phone: ");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Confirm: ");

        jLabel7.setText("Password: ");

        jLabel8.setText("First Name: ");

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Last Name: ");

        CreateEAjButton1.setText("Create");
        CreateEAjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEAjButton1ActionPerformed(evt);
            }
        });

        CancelEAjButton2.setText("Cancel");
        CancelEAjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelEAjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(roleComboBox, 0, 152, Short.MAX_VALUE)
                                    .addComponent(usernameTextField))
                                .addGap(229, 229, 229))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CreateEAjButton1)
                                            .addGap(80, 80, 80)
                                            .addComponent(CancelEAjButton2))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6))
                                            .addGap(42, 42, 42)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(phoneTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                                .addComponent(passwordField1)
                                                .addComponent(passwordField2)))))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(229, 229, 229))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateEAjButton1)
                    .addComponent(CancelEAjButton2))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void CreateEAjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEAjButton1ActionPerformed
        // TODO add your handling code here:
         if (roleComboBox.getSelectedItem() != null) {
              if (!this.usernameTextField.getText().equals("")
                    && system.isUserNameAvaliable(this.usernameTextField.getText())) {
                char[] passwordCharArray1 = passwordField1.getPassword();
                String new1 = String.valueOf(passwordCharArray1);
                char[] passwordCharArray2 = passwordField2.getPassword();
                String new2 = String.valueOf(passwordCharArray2);
                
                if (!emailTextField.getText().equals("") && !firstNameTextField.getText().equals("") && !new1.equals("") && !new2.equals("")
                        && !lastNameTextField.getText().equals("") && !phoneTextField.getText().equals("")) {
                    if (new1.equals(new2)) {
                       Employee em = null;
                             // Create Boss
                        if (roleComboBox.getSelectedItem().equals(Role.RoleType.Boss)) {
                            em = en.getEmployeeDirectory().createEmployee(firstNameTextField.getText(), lastNameTextField.getText(),
                                    phoneTextField.getText(), emailTextField.getText());
                            en.getUserAccountDirectory().createEmployeeAccount(this.usernameTextField.getText(), new2, new BossRole(), em);
                        } else {
                            Organization dOrg = en.getOrganizationDirectory().
                                    getTypicalOrganization(((Role.RoleType) roleComboBox.getSelectedItem()).getOrganizationType());
                            em = dOrg.getEmployeeDirectory().createEmployee(firstNameTextField.getText(), lastNameTextField.getText(),
                                    phoneTextField.getText(), emailTextField.getText());
                            // Create Delivery Man
                            if (roleComboBox.getSelectedItem().equals(Role.RoleType.Driver)) {
                                dOrg.getUserAccountDirectory().createEmployeeAccount(this.usernameTextField.getText(), new2, new Driver(), em);
                            }

                            // Create Manager
                            if (roleComboBox.getSelectedItem().equals(Role.RoleType.Manager)) {
                                dOrg.getUserAccountDirectory().createEmployeeAccount(this.usernameTextField.getText(), new2, new ManagerRole(), em);
                            }
                        }

                        // Save
                        DB4OUtil.getInstance().storeSystem(system);

                        this.workPanel.remove(this);
                        CardLayout layout = (CardLayout) this.workPanel.getLayout();
                        layout.previous(this.workPanel);

                        if (en instanceof CargoDelivery) {
                            CargoAgencyWorkAreaJPanel p = (CargoAgencyWorkAreaJPanel) panel;
                            p.populateEmployeeTable(this.en.getOrganizationDirectory().getOrganizationList());
                        }
                        
                        if (en instanceof PickupService) {
                            PickUpAgencyWorkAreaJPanel p = (PickUpAgencyWorkAreaJPanel) panel;
                            p.populateEmployeeTable(this.en.getOrganizationDirectory().getOrganizationList());
                        }
                    }else {
                        JOptionPane.showMessageDialog(null, "Passwords don't match!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Information can't be empty!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username alreay exists!");
            }                                                       
         }else {
            JOptionPane.showMessageDialog(null, "Please select a Role!");
        }
    }//GEN-LAST:event_CreateEAjButton1ActionPerformed

    private void CancelEAjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelEAjButton2ActionPerformed
    this.workPanel.remove(this);
// TODO add your handling code here:
    }//GEN-LAST:event_CancelEAjButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelEAjButton2;
    private javax.swing.JButton CreateEAjButton1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JComboBox roleComboBox;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
