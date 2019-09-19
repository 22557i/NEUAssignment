/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

/**
 *
 * @author mr.wu
 */
class DriverLicense {
    private String licenseID;
    private String Type;
    private String expireDate;

    public DriverLicense(String licenseID, String Type, String expireDate) {
        this.licenseID = licenseID;
        this.Type = Type;
        this.expireDate = expireDate;
    }

    public String getLicenseID() {
        return licenseID;
    }

    public void setLicenseID(String licenseID) {
        this.licenseID = licenseID;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
    
    
}
