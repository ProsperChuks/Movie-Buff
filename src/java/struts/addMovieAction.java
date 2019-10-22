/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author FOCUS
 */
public class addMovieAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        addMovieBean adb = (addMovieBean) form;
        String movn = "'" + adb.getMn() + "'";
        
        Connection con = null;
        Statement stmt;
        String path = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
        
        
        //Add movies
        if(!"".equals(movn)){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection(path);
                System.out.println("DB Opened");

                stmt = con.createStatement();

                String insert = "INSERT INTO Movie ('MovieName') values (" + movn + ")";
                stmt.executeUpdate(insert);
                stmt.close();
                con.close();
            } catch (SQLException hql) {
                System.err.println(hql);
                return mapping.findForward(ERROR);
            }
            System.out.println("Values Inserted");
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(ERROR);
        }
    }
}
