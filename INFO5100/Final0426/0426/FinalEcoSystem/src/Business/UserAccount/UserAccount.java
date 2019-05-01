/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;



/**
 *
 * @author junxiang
 */
public class UserAccount {
    private int id;
    private static int counter = 0;
    private String username;
    private String password;


    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
        
        this.id = counter;
        counter++;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
    
}
