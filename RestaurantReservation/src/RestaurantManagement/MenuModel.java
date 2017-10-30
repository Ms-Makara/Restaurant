/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManagement;

import Data.DBHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shuqi
 */
public class MenuModel {
    
    static DBHelper db=new DBHelper();
    static ResultSet rs=null;
    static String sql="";
    
    public static List<Menu> queryAllMenus(int restaurantID)
    {
        List<Menu> menus=new ArrayList<Menu>();
        sql="select * from menus where restaurantID="+restaurantID;
        rs=db.ExecuteQuery(sql);
        try {  
            while(rs.next()){
                Menu menu=new Menu();
                menu.setDescription(rs.getString(3));
                menu.setDiscount(rs.getDouble(4));
                menus.add(menu);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(MenuModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            db.closeAll();
        }
        return menus;
    }
    
   public static void main(String[] args)
    {
        List<Menu> menus=new ArrayList<Menu>();
        menus=queryAllMenus(1);
        for(int i=0;i<menus.size();i++)
        {
            System.out.println(menus.get(i).getDescription());
        }
    }
}
