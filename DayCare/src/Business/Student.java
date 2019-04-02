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
public class Student extends Person {
   
    private String parentsName;
    private String registrationDate;
    private ImmunizationList immunizationList;
    private Group groupincluing;
    private Teacher teacherincharge;

    public Teacher getTeacherincharge() {
        return teacherincharge;
    }

    public void setTeacherincharge(Teacher teacherincharge) {
        this.teacherincharge = teacherincharge;
    }

    public Group getGroupincluing() {
        return groupincluing;
    }

    public void setGroupincluing(Group groupincluing) {
        this.groupincluing = groupincluing;
    }
    
    public Student() {
        super();
        immunizationList = new ImmunizationList();

    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    
    
    

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        this.parentsName = parentsName;
    }

    

    public ImmunizationList getImmunizationList() {
        return immunizationList;
    }

    public void setImmunizationList(ImmunizationList immunizationList) {
        this.immunizationList = immunizationList;
    }
    
    
    @Override
    public String toString() {
        return Name;
    }

 
    
    
}
