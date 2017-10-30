/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestaurantManagement;

/**
 *
 * @author Shuqi
 */
public class Menu {
    
   private String description;
   private double discount;

   public Menu(){}
   
   public Menu(String description, double discount)
   {
       this.description=description;
       this.discount=discount;
   }
   
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }
   
   
}
