/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author FOCUS
 */
public class logAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    public static String loggedUser;
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";
    private static final String ADMIN = "admin";
    public String rec1;
    public String rec2;
    

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
        HttpSession session = request.getSession();

        logInBean lb = (logInBean) form;

        String usr = lb.getUsername();
        String pas = lb.getPasss();
        
        session.setAttribute("usr", usr);

        Connection con = null;
        Statement stmt;
        PreparedStatement pmst;
        ResultSet rs;
        String path = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(path);
            stmt = con.createStatement();
            String sql = "SELECT `Username`,`Password` FROM UserR WHERE`Username`= ? AND `Password`= ?";
            pmst = con.prepareStatement(sql);
            pmst.setString(1, usr);
            pmst.setString(2, pas);
            rs = pmst.executeQuery();
            System.out.println("Recored Retrived succesfully!");
            if(usr.equalsIgnoreCase("admin") && pas.equals("ADMIN")){
                    return mapping.findForward(ADMIN);
                }
            if (rs.next()) {
                rec1 = rs.getString(1);
                rec2 = rs.getString(2);
                if (usr.equals(rec1) && pas.equals(rec2)) {
                    System.out.println("Logged In ");
                    loggedUser = usr;
                    return mapping.findForward(SUCCESS);
                }
            }

        } catch (SQLException pe) {
            System.out.println("validation error :" + pe);
        }

        return mapping.findForward(ERROR);
    }
}
