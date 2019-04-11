/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author ranranhe
 */
public class OrganizationDir {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDir() {
        this.organizationList = new ArrayList<>();
    }
    
    public ArrayList<Organization> getOrganizationList() {
        return this.organizationList;
    }
    
    public Organization getTypicalOrganization(Type type) {
        if (type.equals(Type.CarGo)) {
            for (Organization or:this.organizationList) {
                if (or.getName().equalsIgnoreCase(Type.CarGo.getValue())) {
                    return or;
                }
            }
        }
        if (type.equals(Type.PickUp)) {
            for (Organization or:this.organizationList) {
                if (or.getName().equalsIgnoreCase(Type.PickUp.getValue())) {
                    return or;
                }
            }
        }
        return null;
    }
}
