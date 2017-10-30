/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shuqi
 */
public class DatabaseConnector {
    
    static Connection con=null;
    static PreparedStatement pst=null;
    static ResultSet rs=null;
    static String username="root";
    static String pwd="1234";
    
    public static Connection getCon()
    {
    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantreservation",username, pwd);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
     public static void closeAll()
    {
      try {
             if(rs!=null)
            {
                rs.close();
            }
            if(pst!=null)
            {
                pst.close();
            }
            if(con!=null){
                con.close();
            }
         } catch (SQLException ex) {
                Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
         }
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
          Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }
    
    /* public static void main(String[] args)
     {
         ResultSet rs=null;
         String sql="";
         sql="update menus set discount=0.2 where menuID=1";    
         int flag=ExecuteUpdate(sql);
         System.out.println(flag);
         
        /* sql="select * from menus";
         rs=ExecuteQuery(sql);
        try {
            while(rs.next())
            {
                System.out.println(rs.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnector.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         closeAll();
     }*/
}
     

