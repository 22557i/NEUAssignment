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
public class TeacherList {
    private ArrayList<Teacher> teacherList;
    
    public TeacherList(){
        teacherList = new ArrayList<Teacher>();
    }
    
    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }
    
    public Teacher addTeacher() {
        Teacher t = new Teacher();
        teacherList.add(t);
        return t;
    }
    
    public void removeTeacher(Teacher t) {
        teacherList.remove(t);
    }
}
