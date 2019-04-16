/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PickUpAgency;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Item;
import Business.Enterprise.PickupServiceCompany.CarLevel;
import Business.Enterprise.PickupServiceCompany.PickupService;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.EmployeeAccount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import UserInterface.CargoAgency.CreateEmployeeJPanel;
import UserInterface.CargoAgency.ServiceCreateJPanel;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author junxiang
 */
public class PickUpAgencyWorkAreaJPanel extends javax.swing.JPanel {
    private PickupService pickupService;
    private EcoSystem system;
    private JPanel container;
    private Network net;
    private Enterprise en;
    private EmployeeAccount employeeAccount;
    private JFrame frame;
    private Role accessRole;
    private String path;
    private String originPath;
    private OrderRequest selectedOrder = null;
    private Employee employee;
    
    /**
     * Creates new form PickUpAgencyWorkAreaJPanel
     */
    public PickUpAgencyWorkAreaJPanel(EcoSystem system, JPanel container, Network net, Enterprise en,
            UserAccount userAccount, JFrame frame, Role accessRole) {
        initComponents();
        this.system = system;
        this.container = container;
        this.net = net;
        this.en = en;
        this.employeeAccount = (EmployeeAccount) userAccount;
        this.frame = frame;
        this.accessRole = accessRole;
       //this.pickupService = (PickupService) en;
        //this.originPath = this.pickupService.getPath();
        //this.path = this.pickupService.getPath();
        this.employee = this.employeeAccount.getEmployee();
    }
    public PickUpAgencyWorkAreaJPanel(){
        
    }
    public void populateserviceTable() {
        DefaultTableModel dtm = (DefaultTableModel) serviceTable.getModel();
        dtm.setRowCount(0);
        for (CarLevel product : pickupService.getGoods()) {
            Object row[] = new Object[2];
            row[0] = product;
            row[1] = product.getPrice();
            dtm.addRow(row);
        }
        removeServicejButton.setEnabled(false);
    }
    
    public void populateEmployeeTable(ArrayList<Organization> list) {
        ArrayList<EmployeeAccount> result = new ArrayList<>();

        result.addAll(this.en.getUserAccountDirectory().toEmployeeAccounts());

        for (Organization org : list) {
            result.addAll(org.getUserAccountDirectory().toEmployeeAccounts());
        }

        DefaultTableModel dtm = (DefaultTableModel) employeeTable.getModel();
        dtm.setRowCount(0);
        for (EmployeeAccount e : result) {
            Object row[] = new Object[4];
            row[0] = e;
            row[1] = e.getRole();
            row[2] = e.getEmployee().getFullName();
            row[3] = e.getEmployee().getEmail();
            dtm.addRow(row);
        }
    }
    
    private void setOverviewFieldsEditable(boolean b) {
        nameTextField.setEnabled(b);
        BriefIntroTextField1.setEnabled(b);
        TelTextField3.setEnabled(b);
        AddressTextField4.setEnabled(b);
        
    }
    
    private void setOverviewInfo() {
//        nameLabel.setText(pickupService.getName());
        nameTextField.setText(pickupService.getName());
        TelTextField3.setText(pickupService.getPhone());
        AddressTextField4.setText(pickupService.getAddress());
        BriefIntroTextField1.setText(pickupService.getDescription());
      
    }
    private void setProfileFieldsEditable(boolean b) {
        emailTextField.setEnabled(b);
        firstNameTextField.setEnabled(b);
        lastNameTextField.setEnabled(b);
        phoneTextField1.setEnabled(b);
    }
    
    private void setProfileInfo() {
        roleTextField.setText(this.employeeAccount.getRole().getRoleType().getValue());
        nameLabel.setText(employee.getFirstName());
        emailTextField.setText(employee.getEmail());
        firstNameTextField.setText(employee.getFirstName());
        lastNameTextField.setText(employee.getLastName());
        phoneTextField1.setText(employee.getPhone());
        usernameTextField.setText(employeeAccount.getUsername());
    }
    
    private void resetPasswordField() {
        passwordField.setText("");
        passwordField1.setText("");
        passwordField2.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        overviewPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BriefIntroTextField1 = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TelTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddressTextField4 = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        servicePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        createPanel = new javax.swing.JPanel();
        createServiceButton1 = new javax.swing.JButton();
        removeServicejButton = new javax.swing.JButton();
        detailPanel = new javax.swing.JPanel();
        EmployeePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        CreateEmployeeButton = new javax.swing.JButton();
        RemoveEmployeeButton = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();
        orderPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        ProcessOrderButton = new javax.swing.JButton();
        CancelOrderButton = new javax.swing.JButton();
        reviewPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        DetailsButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        profilePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneTextField1 = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        roleTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        editProfileButton1 = new javax.swing.JButton();
        saveProfileButton1 = new javax.swing.JButton();
        cancelProfileButton2 = new javax.swing.JButton();
        changepswPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        passwordField2 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        passwordField1 = new javax.swing.JPasswordField();
        submitPSWButton = new javax.swing.JButton();
        cancelPSWButton1 = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setText("Work Area -PickUp Agency Manager Role");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setText("Company Name: ");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Brief Introduction: ");

        BriefIntroTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BriefIntroTextField1ActionPerformed(evt);
            }
        });

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setText("Telephone: ");

        TelTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelTextField3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Address: ");

        AddressTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressTextField4ActionPerformed(evt);
            }
        });

        editButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout overviewPanelLayout = new javax.swing.GroupLayout(overviewPanel);
        overviewPanel.setLayout(overviewPanelLayout);
        overviewPanelLayout.setHorizontalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(AddressTextField4)
                            .addComponent(TelTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BriefIntroTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BriefIntroTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TelTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AddressTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(saveButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Overview", overviewPanel);

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Car Type", "Charging Standard"
            }
        ));
        jScrollPane1.setViewportView(serviceTable);

        createPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout createPanelLayout = new javax.swing.GroupLayout(createPanel);
        createPanel.setLayout(createPanelLayout);
        createPanelLayout.setHorizontalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );
        createPanelLayout.setVerticalGroup(
            createPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 137, Short.MAX_VALUE)
        );

        createServiceButton1.setText("Create Car");
        createServiceButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createServiceButton1ActionPerformed(evt);
            }
        });

        removeServicejButton.setText("Remove Car");
        removeServicejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeServicejButtonActionPerformed(evt);
            }
        });

        detailPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeServicejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(createServiceButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(detailPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createServiceButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeServicejButton)
                        .addGap(18, 18, 18)
                        .addComponent(detailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Cartype", servicePanel);

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Position", "Email", "Phone"
            }
        ));
        jScrollPane2.setViewportView(employeeTable);

        CreateEmployeeButton.setText("Create Employee");
        CreateEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateEmployeeButtonActionPerformed(evt);
            }
        });

        RemoveEmployeeButton.setText("Remove Employee");

        workPanel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout EmployeePanelLayout = new javax.swing.GroupLayout(EmployeePanel);
        EmployeePanel.setLayout(EmployeePanelLayout);
        EmployeePanelLayout.setHorizontalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateEmployeeButton)
                    .addComponent(RemoveEmployeeButton)
                    .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        EmployeePanelLayout.setVerticalGroup(
            EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EmployeePanelLayout.createSequentialGroup()
                .addGroup(EmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EmployeePanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EmployeePanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(CreateEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveEmployeeButton)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Employee", EmployeePanel);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Date", "Service", "Car Type", "Price", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        ProcessOrderButton.setText("Process Order");

        CancelOrderButton.setText("Cancel Order");

        javax.swing.GroupLayout orderPanelLayout = new javax.swing.GroupLayout(orderPanel);
        orderPanel.setLayout(orderPanelLayout);
        orderPanelLayout.setHorizontalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProcessOrderButton)
                    .addComponent(CancelOrderButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        orderPanelLayout.setVerticalGroup(
            orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderPanelLayout.createSequentialGroup()
                .addGroup(orderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderPanelLayout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orderPanelLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(ProcessOrderButton)
                        .addGap(85, 85, 85)
                        .addComponent(CancelOrderButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Manage Orders", orderPanel);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Rate", "Comments"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        DetailsButton.setText("Details");

        jLabel3.setText("Average Rate: ");

        javax.swing.GroupLayout reviewPanelLayout = new javax.swing.GroupLayout(reviewPanel);
        reviewPanel.setLayout(reviewPanelLayout);
        reviewPanelLayout.setHorizontalGroup(
            reviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reviewPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(reviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DetailsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reviewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        reviewPanelLayout.setVerticalGroup(
            reviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reviewPanelLayout.createSequentialGroup()
                .addGroup(reviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reviewPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reviewPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(reviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addComponent(DetailsButton)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reviews", reviewPanel);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Username: ");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Role:");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("First Name: ");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel16.setText("Last Name: ");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Phone:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Email:");

        roleTextField.setEnabled(false);

        usernameTextField.setEnabled(false);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        editProfileButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        editProfileButton1.setText("Edit");
        editProfileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButton1ActionPerformed(evt);
            }
        });

        saveProfileButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        saveProfileButton1.setText("Save");
        saveProfileButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProfileButton1ActionPerformed(evt);
            }
        });

        cancelProfileButton2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelProfileButton2.setText("Cancel");
        cancelProfileButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelProfileButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout profilePanelLayout = new javax.swing.GroupLayout(profilePanel);
        profilePanel.setLayout(profilePanelLayout);
        profilePanelLayout.setHorizontalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(253, 253, 253))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(editProfileButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(profilePanelLayout.createSequentialGroup()
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(256, 256, 256))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, profilePanelLayout.createSequentialGroup()
                                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveProfileButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cancelProfileButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(144, 144, 144))))))
        );
        profilePanelLayout.setVerticalGroup(
            profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilePanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(roleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(12, 12, 12)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(59, 59, 59)
                .addGroup(profilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(profilePanelLayout.createSequentialGroup()
                        .addComponent(saveProfileButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelProfileButton2))
                    .addComponent(editProfileButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", profilePanel);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel13.setText("Old Password:");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("New Password:");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel15.setText("Confirm Password:");

        submitPSWButton.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        submitPSWButton.setText("Submit");
        submitPSWButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitPSWButtonActionPerformed(evt);
            }
        });

        cancelPSWButton1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cancelPSWButton1.setText("Cancel");
        cancelPSWButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPSWButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changepswPanelLayout = new javax.swing.GroupLayout(changepswPanel);
        changepswPanel.setLayout(changepswPanelLayout);
        changepswPanelLayout.setHorizontalGroup(
            changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changepswPanelLayout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(changepswPanelLayout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(changepswPanelLayout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(changepswPanelLayout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(changepswPanelLayout.createSequentialGroup()
                        .addComponent(submitPSWButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelPSWButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(186, 186, 186))
        );
        changepswPanelLayout.setVerticalGroup(
            changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepswPanelLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(passwordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(passwordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(changepswPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitPSWButton)
                    .addComponent(cancelPSWButton1))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Change Password", changepswPanel);

        nameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        nameLabel.setText("<Name>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BriefIntroTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BriefIntroTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BriefIntroTextField1ActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void TelTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelTextField3ActionPerformed

    private void AddressTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressTextField4ActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        saveButton.setEnabled(true);
        cancelButton.setEnabled(true);
        editButton.setEnabled(false);
        setOverviewFieldsEditable(true);

    }//GEN-LAST:event_editButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (!TelTextField3.getText().equals("") && !AddressTextField4.getText().equals("")
            && !BriefIntroTextField1.getText().equals("") && !nameTextField.getText().equals("")) {
            pickupService.setName(nameTextField.getText());
            pickupService.setAddress(AddressTextField4.getText());
            pickupService.setDescription(BriefIntroTextField1.getText());
            pickupService.setPhone(TelTextField3.getText());

        }
        setOverviewFieldsEditable(false);
        setOverviewInfo();

        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        setOverviewFieldsEditable(false);
        setOverviewInfo();

        saveButton.setEnabled(false);
        cancelButton.setEnabled(false);
        editButton.setEnabled(true);

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createServiceButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createServiceButton1ActionPerformed
        ServiceCreateJPanel p = new ServiceCreateJPanel(system, this, createPanel, this.pickupService);
        this.createPanel.add(p);
        CardLayout layout = (CardLayout) createPanel.getLayout();
        layout.next(createPanel);
    }//GEN-LAST:event_createServiceButton1ActionPerformed

    private void removeServicejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeServicejButtonActionPerformed
        int index = serviceTable.getSelectedRow();

        if (index >= 0) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure to remove this product from the system?");
            if (choice == 0) {
                ArrayList<Item> result = pickupService.getItems();
                result.remove(index);
                pickupService.setItems(result);
                DB4OUtil.getInstance().storeSystem(system);

                populateserviceTable();
            }
        }
    }//GEN-LAST:event_removeServicejButtonActionPerformed

    private void CreateEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateEmployeeButtonActionPerformed
        this.workPanel.removeAll();
        CreateEmployeeJPanel ep = new CreateEmployeeJPanel(this.system, this, this.workPanel, this.en, this.accessRole);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) this.workPanel.getLayout();
        layout.next(this.workPanel);        // TODO add your handling code here:
    }//GEN-LAST:event_CreateEmployeeButtonActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void editProfileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButton1ActionPerformed
        saveProfileButton1.setEnabled(true);
        cancelProfileButton2.setEnabled(true);
        editProfileButton1.setEnabled(false);

        setProfileFieldsEditable(true);
    }//GEN-LAST:event_editProfileButton1ActionPerformed

    private void saveProfileButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProfileButton1ActionPerformed
        if (!emailTextField.getText().equals("") && !firstNameTextField.getText().equals("")
            && !lastNameTextField.getText().equals("") && !phoneTextField1.getText().equals("")) {
            this.employee.setEmail(emailTextField.getText());
            this.employee.setFirstName(firstNameTextField.getText());
            this.employee.setLastName(lastNameTextField.getText());
            this.employee.setPhone(phoneTextField1.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
        setProfileFieldsEditable(false);
        saveProfileButton1.setEnabled(false);
        cancelProfileButton2.setEnabled(false);
        editProfileButton1.setEnabled(true);

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveProfileButton1ActionPerformed

    private void cancelProfileButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelProfileButton2ActionPerformed
        setProfileFieldsEditable(false);
        setProfileInfo();

        saveProfileButton1.setEnabled(false);
        cancelProfileButton2.setEnabled(false);
        editProfileButton1.setEnabled(true);
    }//GEN-LAST:event_cancelProfileButton2ActionPerformed

    private void submitPSWButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitPSWButtonActionPerformed
        char[] passwordCharArray = passwordField2.getPassword();
        String password = String.valueOf(passwordCharArray);
        char[] passwordCharArray1 = passwordField.getPassword();
        String new1 = String.valueOf(passwordCharArray1);
        char[] passwordCharArray2 = passwordField1.getPassword();
        String new2 = String.valueOf(passwordCharArray2);

        if (password.equals(employeeAccount.getPassword())) {
            if (!new1.equals("")) {
                if (new1.equals(new2)) {
                    employeeAccount.setPassword(new1);
                    JOptionPane.showMessageDialog(null, "Password updated successfully!");
                    DB4OUtil.getInstance().storeSystem(system);
                    resetPasswordField();
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords don't match!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Password can't be empty!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Password is not correct!");
        }
    }//GEN-LAST:event_submitPSWButtonActionPerformed

    private void cancelPSWButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPSWButton1ActionPerformed
        resetPasswordField();
    }//GEN-LAST:event_cancelPSWButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField4;
    private javax.swing.JTextField BriefIntroTextField1;
    private javax.swing.JButton CancelOrderButton;
    private javax.swing.JButton CreateEmployeeButton;
    private javax.swing.JButton DetailsButton;
    private javax.swing.JPanel EmployeePanel;
    private javax.swing.JButton ProcessOrderButton;
    private javax.swing.JButton RemoveEmployeeButton;
    private javax.swing.JTextField TelTextField3;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelPSWButton1;
    private javax.swing.JButton cancelProfileButton2;
    private javax.swing.JPanel changepswPanel;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton createServiceButton1;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JButton editButton;
    private javax.swing.JButton editProfileButton1;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel orderPanel;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordField1;
    private javax.swing.JPasswordField passwordField2;
    private javax.swing.JTextField phoneTextField1;
    private javax.swing.JPanel profilePanel;
    private javax.swing.JButton removeServicejButton;
    private javax.swing.JPanel reviewPanel;
    private javax.swing.JTextField roleTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveProfileButton1;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JTable serviceTable;
    private javax.swing.JButton submitPSWButton;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
