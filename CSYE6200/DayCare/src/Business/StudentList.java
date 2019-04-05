/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.*;

/**
 *
 * @author Hui Huang
 */
public class StudentList {
    private ArrayList<Student> studentList;
    
    public StudentList(){
        studentList = new ArrayList<Student>();
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public Student addStudent() {
        Student s = new Student();
        studentList.add(s);
        return s;
    }
    
    public void removeStudent(Student s) {
        studentList.remove(s);
    }
    
}
