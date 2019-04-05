/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hui Huang
 */
public class Classroom {
    private int capacity;
    private StudentList studentList;
    private TeacherList teacherList;
    private List<Group> groupList;
    private String classRoomID;
    
    public Classroom(String classRoomID){
        studentList = new StudentList();
        teacherList = new TeacherList();
        this.groupList = new ArrayList<Group>();
      int size =0;
      for(Group a :groupList){
          size+= a.getGroupDirectory().size();
      }
      this.capacity = size;
      this.classRoomID = classRoomID;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public String getClassRoomID() {
        return classRoomID;
    }

    public void setClassRoomID(String classRoomID) {
        this.classRoomID = classRoomID;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public StudentList getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentList studentList) {
        this.studentList = studentList;
    }

    public TeacherList getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(TeacherList teacherList) {
        this.teacherList = teacherList;
    }
    
    
}
