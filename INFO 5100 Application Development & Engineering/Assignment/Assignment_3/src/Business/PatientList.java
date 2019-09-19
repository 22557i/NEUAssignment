/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author tnaxy
 */
public class PatientList {
    private ArrayList<Patient> patientList;

    public PatientList() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Patient addPatient(){
        Patient pt = new Patient();
        patientList.add(pt);
        return pt;
    }
}
