
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.bean.ASignVar;
import com.dao.AdSignDAO;

/**
 * @author : Devesh Patil
 */
@WebServlet(name = "AdSignServlet", urlPatterns = {"/AdSignServlet"})
public class AdSignServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ASignVar data = new ASignVar();
        
        data.setFullName(request.getParameter("Aname")+" "+request.getParameter("Asurname"));
        data.setEmail(request.getParameter("Email"));
        data.setPhone(Integer.parseInt(request.getParameter("phone")));
        data.setUsename(request.getParameter("username"));
        data.setPassword(request.getParameter("pass"));
        AdSignDAO operation = new AdSignDAO();
        PrintWriter pw = response.getWriter();
        
        if(operation.InsertAdm(data)){
            pw.print("</html>"
                    + "</body>"
                    + "<script>\n" 
                    + "     alert(\"Admin Added Successfully!\");\n" 
                    + "</script>"
                    + "</body>"
                    + "</html>");
             response.sendRedirect("./Admin Files/Admin_Dashboard.html");
        }
        else{
            pw.print("</html>"
                    + "</body>"
                    + "<script>\n" 
                    + "     alert(\"Admin Not Inserted!\");\n" 
                    + "</script>"
                    + "</body>"
                    + "</html>");
            response.sendRedirect("./Admin Files/Admin_Dashboard.html");
        }
        
        
    }

}
