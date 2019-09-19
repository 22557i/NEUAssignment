/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import Interface.DriverRole.DriverMainJPanel;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ranranhe
 */
public class Driver extends Role {

    public Driver() {
        super(Role.RoleType.Driver);
    }
    
    @Override
    public String toString() {
        return Role.RoleType.Driver.getValue();
    }

    @Override
    public void createWorkArea(EcoSystem system, JPanel container, UserAccount userAccount, Network net, Enterprise en, JFrame frame) {
        DriverMainJPanel dp = new DriverMainJPanel(system, container, en, userAccount, frame, this);
        container.add(dp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }
}
