/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdministrativeRole;

import Business.SortByAge;
import Business.SortByGroupID;
import Business.SortByName;
import Business.SortByRegistrationDate;
import Business.Student;
import Business.StudentList;
import Business.TeacherList;
import java.awt.CardLayout;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hui Huang
 */
public class ManageStudent extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private StudentList studentList;
    private TeacherList teacherList;
    /**
     * Creates new form ManageStudent
     */
    public ManageStudent(JPanel userProcessContainer,StudentList studentList,TeacherList teacherList) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.studentList=studentList;
        this.teacherList = teacherList;
        refreshTable();
        jCBWayOfSort.removeAllItems();
        jCBWayOfSort.addItem("Age");
        //jCBWayOfSort.addItem("GroupID");
        jCBWayOfSort.addItem("Name");
        jCBWayOfSort.addItem("Registration Date");
    }
    
    public void refreshTable() {
        int rowCount = studentTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        
        for(Student s : studentList.getStudentList()) {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getAge();
            row[2] = s.getParentsName();
            row[3] = s.getRegistrationDate();
            row[4] =Annversary(s.getRegistrationDate());
            model.addRow(row);
        }
    }
    public void refreshTable(Comparator<Student> aComparator) {
        int rowCount = studentTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        Collections.sort(studentList.getStudentList(), aComparator);
        for(Student s : studentList.getStudentList()) {
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getAge();
            row[2] = s.getParentsName();
            row[3] = s.getRegistrationDate();
            row[4] =Annversary(s.getRegistrationDate());
            model.addRow(row);
        }
    }
    private String Annversary(String input){
       String res;
        if(input.charAt(3)=='9') {
             res = input.substring(0,2)+"20"+input.substring(4);
        }else {
             res = input.substring(0,3)+String.valueOf((char)(input.charAt(3)+1))+input.substring(4);
        }
        return res;
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
        backjButton3 = new javax.swing.JButton();
        removejButton1 = new javax.swing.JButton();
        addsupplierjButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        btnAssignStudentToTeacher = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jCBWayOfSort = new javax.swing.JComboBox<String>();
        btnSort = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Student");

        backjButton3.setText("<<Back");
        backjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton3ActionPerformed(evt);
            }
        });

        removejButton1.setText("Remove");
        removejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removejButton1ActionPerformed(evt);
            }
        });

        addsupplierjButton3.setText("Enroll Student");
        addsupplierjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsupplierjButton3ActionPerformed(evt);
            }
        });

        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Age (Months)", "Parents Name", "Registration Date", "Registration Anniversay"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentTable);

        btnAssignStudentToTeacher.setText("Assign Students To Teachers");
        btnAssignStudentToTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignStudentToTeacherActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jCBWayOfSort.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBWayOfSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBWayOfSortActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        jLabel2.setText("Please select Way of Sort");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(addsupplierjButton3)
                        .addGap(40, 40, 40)
                        .addComponent(btnAssignStudentToTeacher))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addGap(58, 58, 58)
                        .addComponent(btnSort)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack)
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backjButton3)
                                .addGap(45, 45, 45)
                                .addComponent(removejButton1)
                                .addGap(268, 268, 268))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(113, 113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removejButton1)
                    .addComponent(backjButton3)
                    .addComponent(addsupplierjButton3)
                    .addComponent(btnAssignStudentToTeacher))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(jCBWayOfSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSort)
                    .addComponent(jLabel2))
                .addContainerGap(87, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton3ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton3ActionPerformed

    private void removejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removejButton1ActionPerformed
        // TODO add your handling code here:
        int row = studentTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Student s = (Student)studentTable.getValueAt(row, 0);
        studentList.removeStudent(s);
        refreshTable();
    }//GEN-LAST:event_removejButton1ActionPerformed

    private void addsupplierjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsupplierjButton3ActionPerformed
        // TODO add your handling code here:

        //int i=1;
        AddStudent as = new AddStudent(userProcessContainer, studentList,teacherList);
        userProcessContainer.add("AddStudent", as);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addsupplierjButton3ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignStudentToTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignStudentToTeacherActionPerformed
        StudentToTeacherJPanel panel = new StudentToTeacherJPanel(userProcessContainer, studentList,teacherList);
        userProcessContainer.add("ManageTeacherAdministrative", panel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignStudentToTeacherActionPerformed

    private void jCBWayOfSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBWayOfSortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBWayOfSortActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        String sortpattern = (String)jCBWayOfSort.getSelectedItem();
        switch(sortpattern){
            case "Age":
                SortByAge WayOfSortByAge = new SortByAge();
                refreshTable(WayOfSortByAge);
                break;
            case "GroupID":
                SortByGroupID WayOfSortGroupID = new SortByGroupID();
                refreshTable(WayOfSortGroupID);
                break;
            case "Name":
                SortByName WayOfSortByName = new SortByName();
                refreshTable(WayOfSortByName);
                break;
            case "Registration Date":
                SortByRegistrationDate WayOfSortByRegistrationDate = new SortByRegistrationDate();
                refreshTable(WayOfSortByRegistrationDate);
                break;
            
        }
        
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int rowCount = studentTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel)studentTable.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        for(Student s : studentList.getStudentList()) {
            if(s.toString().toLowerCase().contains(txtSearch.getText().toLowerCase())){
            Object row[] = new Object[5];
            row[0] = s;
            row[1] = s.getAge();
            row[2] = s.getParentsName();
            row[3] = s.getRegistrationDate();
            row[4] =Annversary(s.getRegistrationDate());
            model.addRow(row);
        }
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsupplierjButton3;
    private javax.swing.JButton backjButton3;
    private javax.swing.JButton btnAssignStudentToTeacher;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JComboBox<String> jCBWayOfSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removejButton1;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
