/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author tnaxy
 */
public class Patient {
    private String PatientName;
    private String PatientID;
    private String PrimaryDoctorName;
    private String PreferedPharamacy;
    private VitalSigns PatientsVS;
    private VitalSignHistory PatientVSH;
    private String date;

    public Patient() {
        PatientVSH = new VitalSignHistory();
    }
    
    

    public VitalSignHistory getPatientVSH() {
        return PatientVSH;
    }

    public void setPatientVSH(VitalSignHistory PatientVSH) {
        this.PatientVSH = PatientVSH;
    }

    public String getPatientName() {
        return PatientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatientID() {
        return PatientID;
    }

    public void setPatientID(String PatientID) {
        this.PatientID = PatientID;
    }

    public String getPrimaryDoctorName() {
        return PrimaryDoctorName;
    }

    public void setPrimaryDoctorName(String PrimaryDoctorName) {
        this.PrimaryDoctorName = PrimaryDoctorName;
    }

    public String getPreferedPharamacy() {
        return PreferedPharamacy;
    }

    public void setPreferedPharamacy(String PreferedPharamacy) {
        this.PreferedPharamacy = PreferedPharamacy;
    }

    public VitalSigns getPatientsVS() {
        return PatientsVS;
    }

    public void setPatientsVS(VitalSigns PatientsVS) {
        this.PatientsVS = PatientsVS;
    }
    @Override
    public String toString(){
        return this.PatientName;
    }


    
}
