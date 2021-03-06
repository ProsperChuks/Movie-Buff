/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.sql.*;

/**
 *
 * @author FOCUS
 */
public class bookAction extends org.apache.struts.action.Action {

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
        
        bookBean bb = (bookBean) form;
        String nam = bb.getName();
        String mov = bb.getMovie();
        String date = bb.getDate();
        String time = bb.getTime();
        String clas = bb.getClas();
        String price = bb.getPrice();
        
        Connection con = null;
        Statement stmt;
        String path = "jdbc:sqlite:C:/Users/FOCUS/Documents/NetBeansProjects/MBE2/MBF.db";
        
        if(!"".equals(nam) && !"".equals(date) && !"".equals(time)){
            try {
                Class.forName("org.sqlite.JDBC");
                con = DriverManager.getConnection(path);
                con.setAutoCommit(true);
                System.out.println("DB Opened");

                stmt = con.createStatement();

                String insert = "INSERT INTO Ticket (Username,Movie,Date,Time,ClassType,Price) values"
                        + "(" + nam + "," + mov + "," + date + "," + time + "," + clas + "," + price + ")";
                stmt.executeUpdate(insert);
                stmt.close();
                con.close();
                System.out.println("Values Inserted");
            } catch (SQLException e) {
                System.err.println(e.getMessage());
                return mapping.findForward(ERROR);
            }
            return mapping.findForward(SUCCESS);
        }else{
            return mapping.findForward(ERROR);
        }
    }
}
