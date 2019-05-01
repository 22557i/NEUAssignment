/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PickupService;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.CargoDelivery.CargoCartype;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PickupService.PickupCartype;
import Business.Enterprise.PickupService.PickupService;
import Business.Network.Network;
import Business.UserAccount.DriverAccount;
import Business.UserAccount.PickupManagerAccount;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DriveRequest;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.CargoDelivery.EmployeeCreateJPanel;
import UserInterface.LoginJFrame;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junxiang
 */
public class PickupServiceMainJPanel extends javax.swing.JPanel {
        private EcoSystem system;
        private JPanel container;
        private UserAccount account;
        private PickupManagerAccount pickupManagerAccount;
        private JFrame frame; 
        private Network network;
        private Enterprise enterprise;
        private PickupService pickupService;
        private Employee employee;
    /**
     * Creates new form PickupServiceMainJPanel
     */
    public PickupServiceMainJPanel(EcoSystem system, JPanel container, Network net, Enterprise en, UserAccount userAccount, JFrame frame) {
        initComponents();
        this.system = system;
        this.container = container;
        this.network = net;
        this.enterprise = en;
        this.pickupService = (PickupService)en;
        this.pickupManagerAccount = (PickupManagerAccount) account;
        this.frame = frame; 
        this.pickupService.setItems(new ArrayList<>());
        this.system.setpickup(this.pickupService);
        
        setOverviewInfo();//XJ
        populateServiceTable();//XJ
        populateDriver();
        populateDriverTable();
        populateEmployee();
        populatableReview();
        
        addressTextArea.setText(this.pickupService.getAddress());
        nameTextField.setText(this.pickupService.getCompanyName());
        phoneTextField.setText(this.pickupService.getPhone());
        introTextArea.setText(this.pickupService.getDescription());
    }
//initialize the overview panel using data from system db4o --XJ
    private void setOverviewInfo() {
        nameLabel.setText(pickupService.getCompanyName());
        nameTextField.setText(pickupService.getCompanyName());
        phoneTextField.setText(pickupService.getPhone());
        addressTextArea.setText(pickupService.getAddress());
        introTextArea.setText(pickupService.getDescription());
    }
    
    //initialize the manage services panel using data from system db4o --XJ
    public void populateServiceTable() {
        DefaultTableModel dtm = (DefaultTableModel)serviceTable.getModel();
        dtm.setRowCount(0);
        for (PickupCartype col : this.system.getPickupServiceList()) {
            System.out.println(col.toString());
            Object row[] = new Object[2];
            row[0] = col;
            row[1] = col.getPrice();
            dtm.addRow(row);
        }
    }
    
     public void populateDriver(){
        DefaultTableModel dtm = (DefaultTableModel)tableDriveRequest.getModel();
        dtm.setRowCount(0);
        String test = "123123";
        double testdouble = 6.666;
       for(OrderRequest dr: this.pickupService.getOrderList()){
            
            
                Object row[] = new Object[8];
                 row[0] = dr;
                row[1] = dr.getDateString();
                row[2] = dr.getStatus();
                row[3] = dr.getTime();
                row[4] = dr.getLocation();
                row[5] = dr.getDestination();
                row[6] = dr.getDistance();
                row[7] = dr.getTotalPrice();
                dtm.addRow(row);
            
        }               
    }
     
     
     
     public void populateDriverTable(){
        DefaultTableModel dt = (DefaultTableModel)tableDriver.getModel();
        dt.setRowCount(0);
        
        for(UserAccount ua:network.getUserAccountDirectory().getUserAccountList()){
            
            if(ua instanceof DriverAccount){
                Object row[] = new Object[2];
                DriverAccount tempua = (DriverAccount)ua;
                row[0] = tempua;
               // row[1] = ;
                dt.addRow(row);
            }
        }
    }
     public void populateEmployee(){
        DefaultTableModel dtm =(DefaultTableModel)tableEmployee.getModel();
        dtm.setRowCount(0);
        
        for(Employee usa:this.pickupService.getEmployeeDir().getEmployeeList()){
            Object row[] = new Object[4];
            row[0] = usa;
            row[1] = usa.getFirstName();
            row[2] = usa.getPhone();
            row[3] = usa.getEmail();
            dtm.addRow(row);  
        }  
    }
     
         public void populatableReview(){
        DefaultTableModel dtm = (DefaultTableModel)tblReview.getModel();
        dtm.setRowCount(0);
        
        for(OrderRequest or:this.pickupService.getOrderList()){
            Object row[] = new Object[4];
            row[0] = or.getReview();
            row[1] = this.account;
            Random r = new Random();
            
            row[2] = r.nextInt(3)+7;
            row[3] = or.getRemark();
            dtm.addRow(row);
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
        logoutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        overviewPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        introTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        servicePanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        createServButton = new javax.swing.JButton();
        removeServButton = new javax.swing.JButton();
        createPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEmployee = new javax.swing.JTable();
        createEplButton = new javax.swing.JButton();
        removeEplButton = new javax.swing.JButton();
        workPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableDriveRequest = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        tableDriver = new javax.swing.JTable();
        btnSendRequest = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblReview = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        firstnameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lastnameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phoneTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        savePrfButton = new javax.swing.JButton();
        cancelPrfButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(161, 23, 21));
        jLabel1.setText("Pickup Service Company Manager Work Area ");

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(161, 23, 21));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(161, 23, 21));
        jLabel2.setText("Welcome,");

        nameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(161, 23, 21));
        nameLabel.setText("<Name>");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(161, 23, 21));

        overviewPanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(161, 23, 21));
        jLabel3.setText("Company Name: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(161, 23, 21));
        jLabel4.setText("Telephone: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(161, 23, 21));
        jLabel5.setText("Address: ");

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        jScrollPane2.setViewportView(addressTextArea);

        introTextArea.setColumns(20);
        introTextArea.setRows(5);
        jScrollPane1.setViewportView(introTextArea);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(161, 23, 21));
        jLabel6.setText("Brief Introduction: ");

        saveButton.setBackground(new java.awt.Color(255, 255, 255));
        saveButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveButton.setForeground(new java.awt.Color(161, 23, 21));
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(161, 23, 21));
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
                .addGap(35, 35, 35)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35)
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneTextField)
                            .addComponent(nameTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25))
        );
        overviewPanelLayout.setVerticalGroup(
            overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overviewPanelLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(overviewPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overviewPanelLayout.createSequentialGroup()
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(overviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Overview", overviewPanel);

        servicePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(161, 23, 21));
        jLabel7.setText("Service List:");

        serviceTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        serviceTable.setForeground(new java.awt.Color(161, 23, 21));
        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Car Type", "Price($/mile)"
            }
        ));
        jScrollPane3.setViewportView(serviceTable);

        createServButton.setBackground(new java.awt.Color(255, 255, 255));
        createServButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createServButton.setForeground(new java.awt.Color(161, 23, 21));
        createServButton.setText("Create Service");
        createServButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createServButtonActionPerformed(evt);
            }
        });

        removeServButton.setBackground(new java.awt.Color(255, 255, 255));
        removeServButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removeServButton.setForeground(new java.awt.Color(161, 23, 21));
        removeServButton.setText("Remove Service");
        removeServButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeServButtonActionPerformed(evt);
            }
        });

        createPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout servicePanelLayout = new javax.swing.GroupLayout(servicePanel);
        servicePanel.setLayout(servicePanelLayout);
        servicePanelLayout.setHorizontalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(removeServButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createServButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        servicePanelLayout.setVerticalGroup(
            servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicePanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(servicePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(servicePanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(createServButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeServButton))
                    .addComponent(createPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Services", servicePanel);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tableEmployee.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tableEmployee.setForeground(new java.awt.Color(161, 23, 21));
        tableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableEmployee);

        createEplButton.setBackground(new java.awt.Color(255, 255, 255));
        createEplButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        createEplButton.setForeground(new java.awt.Color(161, 23, 21));
        createEplButton.setText("Create Employee");
        createEplButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEplButtonActionPerformed(evt);
            }
        });

        removeEplButton.setBackground(new java.awt.Color(255, 255, 255));
        removeEplButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        removeEplButton.setForeground(new java.awt.Color(161, 23, 21));
        removeEplButton.setText("Remove Employee");
        removeEplButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEplButtonActionPerformed(evt);
            }
        });

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(657, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeEplButton)
                    .addComponent(createEplButton, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(525, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(createEplButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeEplButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Manage Employees", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        tableDriveRequest.setForeground(new java.awt.Color(161, 23, 21));
        tableDriveRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Order Date", "Order Status", "Time", "Location", "Destination", "Distance", "Expected Pay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDriveRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDriveRequestMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableDriveRequest);

        tableDriver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Driver Name", "Car Type"
            }
        ));
        jScrollPane6.setViewportView(tableDriver);

        btnSendRequest.setText("Send Request");
        btnSendRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSendRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnSendRequest)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Manage Orders", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tblReview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Customer", "Score", "Comment"
            }
        ));
        jScrollPane7.setViewportView(tblReview);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reviews", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(161, 23, 21));
        jLabel8.setText("First Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(161, 23, 21));
        jLabel9.setText("Last Name:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(161, 23, 21));
        jLabel10.setText("Phone:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(161, 23, 21));
        jLabel11.setText("Email:");

        savePrfButton.setBackground(new java.awt.Color(255, 255, 255));
        savePrfButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        savePrfButton.setForeground(new java.awt.Color(161, 23, 21));
        savePrfButton.setText("Save");
        savePrfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePrfButtonActionPerformed(evt);
            }
        });

        cancelPrfButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelPrfButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelPrfButton.setForeground(new java.awt.Color(161, 23, 21));
        cancelPrfButton.setText("Cancel");
        cancelPrfButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPrfButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(savePrfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(cancelPrfButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(479, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(phoneTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savePrfButton)
                    .addComponent(cancelPrfButton))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("My Profile", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutButton)
                    .addComponent(nameLabel))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1012, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(nameLabel))
                .addGap(43, 43, 43)
                .addComponent(logoutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        LoginJFrame lf = new LoginJFrame();
        this.frame.dispose();
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (!nameTextField.getText().equals("") && !phoneTextField.getText().equals("")
            && !addressTextArea.getText().equals("") && !introTextArea.getText().equals("")) {
            pickupService.setCompanyName(nameTextField.getText());
            pickupService.setPhone(phoneTextField.getText());
            pickupService.setAddress(addressTextArea.getText());
            pickupService.setDescription(introTextArea.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }

        setOverviewInfo();

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        setOverviewInfo();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void createServButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createServButtonActionPerformed
        // TODO add your handling code here:
        PServiceCreateJPanel scjp = new PServiceCreateJPanel(system, this, createPanel, pickupService);
        this.createPanel.add(scjp);
        CardLayout layout = (CardLayout) createPanel.getLayout();
        layout.next(createPanel);
    }//GEN-LAST:event_createServButtonActionPerformed

    private void removeServButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeServButtonActionPerformed
        // TODO add your handling code here:
        int index = serviceTable.getSelectedRow();
        system.getPickupServiceList().remove(serviceTable.getValueAt(index, 0));
        
        populateServiceTable();
    }//GEN-LAST:event_removeServButtonActionPerformed

    private void savePrfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePrfButtonActionPerformed
         if (!emailTextField.getText().equals("") && !firstnameTextField.getText().equals("")
                && !lastnameTextField.getText().equals("") && !phoneTextField1.getText().equals("")) {
              this.employee.setFirstName(firstnameTextField.getText());
              this.employee.setLastName(lastnameTextField.getText());
              this.employee.setPhone(phoneTextField1.getText());
              this.employee.setEmail(emailTextField.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Information can't be empty");
            return;
        }
          
        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_savePrfButtonActionPerformed

    private void cancelPrfButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPrfButtonActionPerformed
        // TODO add your handling code here:
        int index = tableEmployee.getSelectedRow();
        this.pickupService.getEmployeeDir().getEmployeeList().remove(tableEmployee.getValueAt(index, 0));
        populateEmployee();
    }//GEN-LAST:event_cancelPrfButtonActionPerformed

    private void tableDriveRequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDriveRequestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableDriveRequestMouseClicked

    private void btnSendRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestActionPerformed
        int requestindex = tableDriveRequest.getSelectedRow();
        OrderRequest dr = (OrderRequest)tableDriveRequest.getValueAt(requestindex, 0);
        int driverindex = tableDriver.getSelectedRow();
        DriverAccount drvac = (DriverAccount)tableDriver.getValueAt(driverindex, 0);

        DriveRequest tempdr = new DriveRequest(enterprise, account, dr);
        LinkedList<DriveRequest> templist = new LinkedList<>();
        
        
        templist.add(tempdr);
        drvac.setDriveRequestDirectory(templist);
        JOptionPane.showMessageDialog(null, "The request has been sent to the selected Driver");

        DB4OUtil.getInstance().storeSystem(system);
    }//GEN-LAST:event_btnSendRequestActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void createEplButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEplButtonActionPerformed
        // TODO add your handling code here:
        this.workPanel.removeAll();
        PEmployeeCreateJPanel ep = new PEmployeeCreateJPanel(this.system, this, workPanel, pickupService);
        this.workPanel.add(ep);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.next(this.workPanel);
    }//GEN-LAST:event_createEplButtonActionPerformed

    private void removeEplButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEplButtonActionPerformed
        // TODO add your handling code here:
         int index = tableEmployee.getSelectedRow();
            this.pickupService.getEmployeeDir().getEmployeeList().remove(tableEmployee.getValueAt(index, 0));
            populateEmployee();
    }//GEN-LAST:event_removeEplButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JButton btnSendRequest;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton cancelPrfButton;
    private javax.swing.JButton createEplButton;
    private javax.swing.JPanel createPanel;
    private javax.swing.JButton createServButton;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JTextArea introTextArea;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel overviewPanel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JTextField phoneTextField1;
    private javax.swing.JButton removeEplButton;
    private javax.swing.JButton removeServButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton savePrfButton;
    private javax.swing.JPanel servicePanel;
    private javax.swing.JTable serviceTable;
    private javax.swing.JTable tableDriveRequest;
    private javax.swing.JTable tableDriver;
    private javax.swing.JTable tableEmployee;
    private javax.swing.JTable tblReview;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
