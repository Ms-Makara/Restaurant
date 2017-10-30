/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reservation;

/**
 *
 * @author Shuqi
 */
public class Feedback {
    
    private String feedback;

    public Feedback(){}
    
    public Feedback(String feedback)
    {
        this.feedback=feedback;
    }
    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
   
}
