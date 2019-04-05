/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdministrativeRole;

import Business.Group;
import Business.SortByAge;
import Business.SortByGroupID;
import Business.SortByName;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Student;
import Business.StudentList;
import Business.Teacher;
import Business.TeacherList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tnaxy
 */
public class StudentToTeacherJPanel extends javax.swing.JPanel {
    public StudentList studentlist;
    public JPanel userProcessContainer;
    private TeacherList teacherList;
    /**
     * Creates new form StudentListJPanel
     */
    public StudentToTeacherJPanel(JPanel userProcessContainer, StudentList studentlist,TeacherList teacherList) {
        initComponents();
        this.studentlist = studentlist;
        this.userProcessContainer = userProcessContainer;
        this.teacherList = teacherList;
        populatable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        StudentListtbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnName = new javax.swing.JButton();
        btnAge = new javax.swing.JButton();
        GroupNo = new javax.swing.JButton();

        StudentListtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Age(Month)", "Group Number", "Teacher Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(StudentListtbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        jLabel1.setText("Student Lists");

        btnName.setText("Name");
        btnName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameActionPerformed(evt);
            }
        });

        btnAge.setText("Age");
        btnAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeActionPerformed(evt);
            }
        });

        GroupNo.setText("GroupNo");
        GroupNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GroupNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(239, 239, 239)
                .addComponent(jLabel1)
                .addContainerGap(408, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(GroupNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(75, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addComponent(btnName)
                .addGap(48, 48, 48)
                .addComponent(btnAge)
                .addGap(40, 40, 40)
                .addComponent(GroupNo)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameActionPerformed
        // TODO add your handling code here:
        SortByName s = new SortByName();
        populatable(s);
    }//GEN-LAST:event_btnNameActionPerformed

    private void btnAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeActionPerformed
        // TODO add your handling code here:
        SortByAge s = new SortByAge();
        populatable(s);
    }//GEN-LAST:event_btnAgeActionPerformed

    private void GroupNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GroupNoActionPerformed
        // TODO add your handling code here:
        SortByGroupID s = new SortByGroupID();
        populatable(s);
         
    }//GEN-LAST:event_GroupNoActionPerformed
    private int AssignStudnetToTeacher(int ratio,ArrayList<Student>arrayList,int countNO, Stack<Teacher> stack){
        int size =(arrayList.size()%ratio==0)?arrayList.size()/ratio:arrayList.size()/ratio+1;
        for (int i = 0; i < size; i++) {
            Group group = new Group(String.valueOf(countNO),stack.pop());
            for(int j =0;j<ratio;j++){
                if (i*ratio+j<arrayList.size()) {
                arrayList.get(i*ratio+j).setGroupincluing(group);
                }
            }
            countNO++;
        }
        return countNO;
    }
    private void populatable(){
        ArrayList <Student> arrayList6_12 = new ArrayList <Student> ();
        ArrayList <Student> arrayList12_24 = new ArrayList <Student> ();
        ArrayList <Student> arrayList24_36 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList36_48 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList48_60 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList60plus = new ArrayList <Student> ();
        Stack<Teacher> teacherstack = new Stack<Teacher>();
        for(Teacher t : teacherList.getTeacherList()){
            teacherstack.push(t);
        }
        for(Student s :studentlist.getStudentList()){
            
            if(s.getAge()>=6&&s.getAge()<=12){
                arrayList6_12.add(s);
            }
            if (s.getAge()>12&&s.getAge()<=24) {
                arrayList12_24.add(s);
            }
            if (s.getAge()>24&&s.getAge()<=36) {
                arrayList24_36.add(s);
            }
            if (s.getAge()>36&&s.getAge()<=48) {
                arrayList36_48.add(s);
            }
            if(s.getAge()>48&&s.getAge()<=60){
                arrayList60plus.add(s);
            }
            if(s.getAge()>60){
                arrayList60plus.add(s);
            }
        }
        int countNO =1;
        countNO = AssignStudnetToTeacher(4, arrayList6_12, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(5, arrayList12_24, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(6, arrayList24_36, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(8, arrayList36_48, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(12, arrayList48_60, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(15, arrayList60plus, countNO,teacherstack);
       /* int size612 =(arrayList6_12.size()%4==0)?arrayList6_12.size()/4:arrayList6_12.size()/4+1;
        for (int i = 0; i < size612; i++) {
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<4;j++){
                arrayList6_12.get(i*4+j).setGroupincluing(group);
            }
            countNO++;
        }
        int size1224 =(arrayList12_24.size()%5==0)?arrayList12_24.size()/5:arrayList12_24.size()/5+1;
        for (int i =0;i<size1224;i++ ){
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<5;j++){
                arrayList12_24.get(i*5+j).setGroupincluing(group);
            }
            countNO++;
        }
        int size2436 =(arrayList24_36.size()%6==0)?arrayList24_36.size()/6:arrayList24_36.size()/6+1;      
        for(int i=0;i<size2436;i++){  
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<6;j++){
                arrayList24_36.get(i*6+j).setGroupincluing(group);
        }
            countNO++;
        }*/
        
        
        
        
        
        
         DefaultTableModel dtm =(DefaultTableModel)StudentListtbl.getModel();
         dtm.setRowCount(0);
         SortByGroupID sbgid = new SortByGroupID();
         Collections.sort(studentlist.getStudentList(),sbgid);
         for(Student p1:studentlist.getStudentList()){
            Object row[] = new Object[4];
            row[0] = p1;
            row[1] = p1.getAge();
             try {
                 row[2] = p1.getGroupincluing().getGroupID();
             } catch (Exception e) {
                 row[2] = new String("Error");
             }

            row[3] = p1.getGroupincluing().getTeacherincharge().getName();
            dtm.addRow(row);
 }
   
    }
    private void populatable(Comparator<Student> sc ){
        ArrayList <Student> arrayList6_12 = new ArrayList <Student> ();
        ArrayList <Student> arrayList12_24 = new ArrayList <Student> ();
        ArrayList <Student> arrayList24_36 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList36_48 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList48_60 = new ArrayList <Student> ();
        ArrayList <Student>  arrayList60plus = new ArrayList <Student> ();
        Stack<Teacher> teacherstack = new Stack<Teacher>();
        for(Teacher t : teacherList.getTeacherList()){
            teacherstack.push(t);
        }
        for(Student s :studentlist.getStudentList()){
            
            if(s.getAge()>=6&&s.getAge()<=12){
                arrayList6_12.add(s);
            }
            if (s.getAge()>12&&s.getAge()<=24) {
                arrayList12_24.add(s);
            }
            if (s.getAge()>24&&s.getAge()<=36) {
                arrayList24_36.add(s);
            }
            if (s.getAge()>36&&s.getAge()<=48) {
                arrayList36_48.add(s);
            }
            if(s.getAge()>48&&s.getAge()<=60){
                arrayList60plus.add(s);
            }
            if(s.getAge()>60){
                arrayList60plus.add(s);
            }
        }
        int countNO =1;
        countNO = AssignStudnetToTeacher(4, arrayList6_12, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(5, arrayList12_24, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(6, arrayList24_36, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(8, arrayList36_48, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(12, arrayList48_60, countNO,teacherstack);
        countNO = AssignStudnetToTeacher(15, arrayList60plus, countNO,teacherstack);
       /* int size612 =(arrayList6_12.size()%4==0)?arrayList6_12.size()/4:arrayList6_12.size()/4+1;
        for (int i = 0; i < size612; i++) {
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<4;j++){
                arrayList6_12.get(i*4+j).setGroupincluing(group);
            }
            countNO++;
        }
        int size1224 =(arrayList12_24.size()%5==0)?arrayList12_24.size()/5:arrayList12_24.size()/5+1;
        for (int i =0;i<size1224;i++ ){
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<5;j++){
                arrayList12_24.get(i*5+j).setGroupincluing(group);
            }
            countNO++;
        }
        int size2436 =(arrayList24_36.size()%6==0)?arrayList24_36.size()/6:arrayList24_36.size()/6+1;      
        for(int i=0;i<size2436;i++){  
            Group group = new Group(String.valueOf(countNO));
            for(int j =0;j<6;j++){
                arrayList24_36.get(i*6+j).setGroupincluing(group);
        }
            countNO++;
        }*/
        
        
        
        
        
        
         DefaultTableModel dtm =(DefaultTableModel)StudentListtbl.getModel();
         dtm.setRowCount(0);
         Collections.sort(studentlist.getStudentList(),sc);
         for(Student p1:studentlist.getStudentList()){
            Object row[] = new Object[4];
            row[0] = p1;
            row[1] = p1.getAge();
             try {
                 row[2] = p1.getGroupincluing().getGroupID();
             } catch (Exception e) {
                 row[2] = new String("Error");
             }

            row[3] = p1.getGroupincluing().getTeacherincharge().getName();
            dtm.addRow(row);
 }
   
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GroupNo;
    private javax.swing.JTable StudentListtbl;
    private javax.swing.JButton btnAge;
    private javax.swing.JButton btnName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}