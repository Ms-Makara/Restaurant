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
    
    DBHelper db=new DBHelper();
    ResultSet rs=null;
    
    /*public List<Restaurant> queryAllRestaurant()
    {
        List<Restaurant> restaurants= new ArrayList<Restaurant>();
        String sql="select * from Restaurants";
        rs=db.ExecuteQuery(sql);
        try {  
            while(rs.next()){
                Restaurant restaurant=new Restaurant();
                restaurant.setRestaurant_name(rs.getString(1));
                
            }   
        } catch (SQLException ex) {
            Logger.getLogger(RestaurantModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return restaurants;
    }*/
}
