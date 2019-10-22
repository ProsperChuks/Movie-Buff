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
public class bookBean extends org.apache.struts.action.ActionForm {
    
    private String username;
    private String movie;
    private String date;
    private String time;
    private String clas;
    private String price;
   
    
    
    public String getName() {
        return username;
    }

    public void setName(String string) {
        username = string;
    }
    
    //---------------------------------------------------------------------------------------
    
    public String getMovie() {
        return movie;
    }

    public void setMovie(String string) {
        movie = string;
    }
    
    //---------------------------------------------------------------------------------------
    
    public String getDate() {
        return date;
    }

    public void setDate(String string) {
        date = string;
    }
    
    //---------------------------------------------------------------------------------------
    
    public String getTime() {
        return time;
    }

    public void setTime(String string) {
        time = string;
    }
    
    //---------------------------------------------------------------------------------------
    
    public String getClas() {
        return clas;
    }

    public void setClas(String string) {
        clas = string;
    }
    
    //---------------------------------------------------------------------------------------
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String string) {
        price = string;
    }

    /**
     *
     */
    public bookBean() {
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
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getName() == null || getName().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
