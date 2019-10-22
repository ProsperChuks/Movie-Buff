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
public class registerFormBean extends org.apache.struts.action.ActionForm {
    
    private String fullname;
    private String username;
    private String email;
    private String phone;
    private String password;

    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String string) {
        fullname = string;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String string) {
        username = string;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String string) {
        email = string;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String string){
        phone = string;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String string) {
        password = string;
    }

    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getFullname() == null || getFullname().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }
}
