/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Driver;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ranranhe
 */
public class CarGoOrganization extends Organization {

    public CarGoOrganization() {
        super(Organization.Type.CarGo.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Driver());
        return roles;
    }
}
