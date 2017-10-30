/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

import java.util.Date;

/**
 *
 * @author Shuqi
 */
public class Reservation {
    
    private String restaurant_name;
    private Date reserve_date;
    private Date consume_date;
    private int numOfPeople;
    private int paid;
    private Feedback feedback;

    
    public Reservation(){}

    public Reservation(String restaurant_name, Date reserve_date, Date consume_date, int numOfPeople, int paid, Feedback feedback)
    {
        this.restaurant_name=restaurant_name;
        this.reserve_date=reserve_date;
        this.consume_date=consume_date;
        this.numOfPeople=numOfPeople;
        this.paid=paid;
        this.feedback=feedback;
        
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
     * @return the reserve_date
     */
    public Date getReserve_date() {
        return reserve_date;
    }

    /**
     * @param reserve_date the reserve_date to set
     */
    public void setReserve_date(Date reserve_date) {
        this.reserve_date = reserve_date;
    }

    /**
     * @return the consume_date
     */
    public Date getConsume_date() {
        return consume_date;
    }

    /**
     * @param consume_date the consume_date to set
     */
    public void setConsume_date(Date consume_date) {
        this.consume_date = consume_date;
    }

    /**
     * @return the numOfPeople
     */
    public int getNumOfPeople() {
        return numOfPeople;
    }

    /**
     * @param numOfPeople the numOfPeople to set
     */
    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    /**
     * @return the paid
     */
    public int getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(int paid) {
        this.paid = paid;
    }

    /**
     * @return the feedback
     */
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }
    
    
    
}
