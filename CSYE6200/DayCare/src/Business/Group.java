/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mr.wu
 */
public class Group {
    private String groupID;
    private ArrayList<Student> groupDirectory ;
    private Teacher teacherincharge;

    public Teacher getTeacherincharge() {
        return teacherincharge;
    }

    public void setTeacherincharge(Teacher teacherincharge) {
        this.teacherincharge = teacherincharge;
    }

    public Group(String groupID,Teacher teacher ) {
        this.groupID = groupID;
        this.groupDirectory =new ArrayList<Student>();
        this.teacherincharge = teacher;
    }

    public String getGroupID() {
        return groupID;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public ArrayList<Student> getGroupDirectory() {
        return groupDirectory;
    }

    public void setGroupDirectory(ArrayList<Student> groupDirectory) {
        this.groupDirectory = groupDirectory;
    }
    
    
}
