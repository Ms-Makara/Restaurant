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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shuqi
 */
public class RestaurantModel {
    
    static DBHelper db=new DBHelper();
    static ResultSet rs=null;
    
    public static List<Restaurant> queryAllRestaurant()
    {
        List<Restaurant> restaurants= new ArrayList<Restaurant>();
        String sql="select restaurant_name,t.type,description,tables,restaurant_ID from restaurants r,restaurant_type t where r.restaurant_typeID=t.restaurant_typeID";
        rs=db.ExecuteQuery(sql);
        try {  
            while(rs.next()){
                Restaurant restaurant=new Restaurant();
                MenuModel aModel=new MenuModel();
                restaurant.setRestaurant_name(rs.getString(1));
                restaurant.setRestaurant_type(rs.getString(2));
                restaurant.setDecription(rs.getString(3));
                restaurant.setTables(rs.getInt(4));
                restaurant.setMenus(aModel.queryAllMenus(rs.getInt(5)));
                restaurants.add(restaurant);
            }   
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return restaurants;
    }
    
    /*public static void main(String[] args)
    {
        List<Restaurant> restaurants= new ArrayList<Restaurant>();
        restaurants=queryAllRestaurant();
        for(int i=0;i<restaurants.size();i++)
        {
            System.out.println(restaurants.get(i).getMenus().get(0).getDescription());
        }
    }*/
    
}
