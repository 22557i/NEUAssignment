/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import java.util.ArrayList;

/**
 *
 * @author mr.wu
 */
public class DriverDirectory {
    private ArrayList<Driver> DriverDir ;

    public DriverDirectory(ArrayList<Driver> DriverDir) {
        this.DriverDir = DriverDir;
    }

    public ArrayList<Driver> getDriverDir() {
        return DriverDir;
    }

    public void setDriverDir(ArrayList<Driver> DriverDir) {
        this.DriverDir = DriverDir;
    }

    
    
}
