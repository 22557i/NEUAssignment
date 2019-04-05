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
public class ImmunizationList {
    private ArrayList<Immunization> immunizationList;
    
    public ImmunizationList(){
        immunizationList = new ArrayList<Immunization>();
    }
    
    public ArrayList<Immunization> getImmunizationList() {
        return immunizationList;
    }
    
    
    public Immunization addImmunization() {
        Immunization i = new Immunization();
        immunizationList.add(i);
        return i;
    }
    
    public void removeImmunization(Immunization i) {
        immunizationList.remove(i);
    }
    
}
