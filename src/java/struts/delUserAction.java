/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author FOCUS
 */
public class delUserAction extends org.apache.struts.action.Action {

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
        
        delUserBean adb = (delUserBean) form;
        String user = "'" + adb.getUser() + "'";
        
        Connection con = null;
        Statement stmt;
        String path = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
        
        System.out.println("Loading...");
        //Delete Users
        if(!"Select User".equals(user)){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection(path);
                System.out.println("DB Opened");

                stmt = con.createStatement();

                String delete = "DELETE from UserR WHERE Username=" + user + ";";
                stmt.executeUpdate(delete);
                stmt.close();
                con.close();
            } catch (SQLException hql) {
                System.err.println(hql);
                return mapping.findForward(ERROR);
            }
            System.out.println("Values Deleted");
            return mapping.findForward(SUCCESS);
        }
            return mapping.findForward(ERROR);
    }
}
