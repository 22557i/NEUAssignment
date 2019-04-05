/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Hui Huang
 */
public class Teacher extends Person{
    
    private StudentList studentList;
    
    public Teacher() {
        studentList = new StudentList();

    }

  

    public StudentList getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentList studentList) {
        this.studentList = studentList;
    }
    
     @Override
    public String toString() {
        return Name;
    }
}
