/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Shuqi
 */
public abstract class User {
    
     
    protected String username;
    protected String password;
    protected int usertype;

    
    /**
     * @return the usertype
     */
    public abstract int getUsertype() ;
    
    /**
     * @param usertype the usertype to set
     */
    public abstract void setUsertype(int usertype) ;
   
}
