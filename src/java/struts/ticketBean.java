/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author FOCUS
 */
public class ticketBean extends org.apache.struts.action.ActionForm {
    
    private String username;
    private String movie;
    private String date;
    private String time;
    private String classT;
    private String cost;

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String string) {
        username = string;
    }
    
    //-------------------------------------------
    
    public String getMovie() {
        return movie;
    }

    public void setMovie(String string) {
        movie = string;
    }
    
    //-------------------------------------------

    public String getDate() {
        return date;
    }

    public void setDate(String string) {
        date = string;
    }
    
    //-------------------------------------------

    public String getTime() {
        return time;
    }

    public void setTime(String string) {
        time = string;
    }
    
    //-------------------------------------------

    public String getClassT() {
        return classT;
    }

    public void setClassT(String string) {
        classT = string;
    }
    
    //-------------------------------------------

    public String getCost() {
        return cost;
    }

    public void setCost(String string) {
        cost = string;
    }

    /**
     *
     */
    public ticketBean() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsername() == null || getUsername().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
