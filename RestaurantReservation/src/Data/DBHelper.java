/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import static Data.DatabaseConnector.getCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shuqi
 */
public class DBHelper extends DatabaseConnector{
   
    public DBHelper() {
        
    }
    
    public static ResultSet ExecuteQuery(String sql)
    {
        con=getCon();
        try {         
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
        } catch (SQLException ex) {
          Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
    public static int ExecuteUpdate(String sql)
    {
        con=getCon();
        int flag=0;
        try {         
            pst=con.prepareStatement(sql);
           
            flag= pst.executeUpdate();  
        } catch (SQLException ex) {
          Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
  /* public static void main(String[] args)
     {
         ResultSet rs=null;
         String sql="update menus set discount=0.2 where menuID=1";    
         //int flag=ExecuteUpdate(sql);
         //System.out.print(flag); 
         
         sql="select * from menus";
         rs=ExecuteQuery(sql);
        try {
            while(rs.next())
            {
                System.out.println(rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            closeAll();
        }
     }*/
   
}
