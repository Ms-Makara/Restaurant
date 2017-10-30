/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManagement;

import java.util.ArrayList;

/**
 *
 * @author Shuqi
 */
public class Restaurant {
    
    private String restaurant_name;
    private String restaurant_type;
    private String decription;
    private int tables;
    private ArrayList<Menu> menus;
    
    public Restaurant()
    {}
    
    public Restaurant(String restaurant_name, String restaurant_type, String decription, int tables, ArrayList<Menu> menus )
    {
        this.restaurant_name=restaurant_name;
        this.restaurant_type=restaurant_type;
        this.decription=decription;
        this.tables=tables;
        this.menus=menus;
    }

    /**
     * @return the restaurant_name
     */
    public String getRestaurant_name() {
        return restaurant_name;
    }

    /**
     * @param restaurant_name the restaurant_name to set
     */
    public void setRestaurant_name(String restaurant_name) {
        this.restaurant_name = restaurant_name;
    }

    /**
     * @return the restaurant_type
     */
    public String getRestaurant_type() {
        return restaurant_type;
    }

    /**
     * @param restaurant_type the restaurant_type to set
     */
    public void setRestaurant_type(String restaurant_type) {
        this.restaurant_type = restaurant_type;
    }

    /**
     * @return the decription
     */
    public String getDecription() {
        return decription;
    }

    /**
     * @param decription the decription to set
     */
    public void setDecription(String decription) {
        this.decription = decription;
    }

    /**
     * @return the tables
     */
    public int getTables() {
        return tables;
    }

    /**
     * @param tables the tables to set
     */
    public void setTables(int tables) {
        this.tables = tables;
    }

    /**
     * @return the menus
     */
    public ArrayList<Menu> getMenus() {
        return menus;
    }

    /**
     * @param menus the menus to set
     */
    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    
    
    
    
}
