/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author mr.wu
 */
public class CargoManager extends Role{

    public CargoManager() {
        super(Role.RoleType.CarGoAgency);
    }

    @Override
    public String toString() {
        return Role.RoleType.CarGoAgency.getValue();
    }

    @Override
    public void createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, JFrame frame) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
