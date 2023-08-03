package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.bean.ALogVar;
import com.dao.AdminDAO;
/*
 * @author : Devesh Patil
 */
@WebServlet(name = "AdminLog", urlPatterns = {"/AdminLog"})
public class AdminLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdminLog() {}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AdminDAO operation = new AdminDAO();
		ALogVar data = new ALogVar();
                PrintWriter pw = response.getWriter();
		
		data.setUsername(request.getParameter("AUserN"));
		data.setPassword(request.getParameter("APass"));
		
		if(operation.Varify(data)) {
                    response.sendRedirect("./Admin Files/Admin_Dashboard.html");
		}
                else{
                pw.print("</html>"
                        + "</body>"
                        + "<script>\n" 
                        + "     <alert(\"Admin Incorrect UserName And Password!\");\n" 
                        + "</script>"
                        + "</body>"
                        + "</html>");
                response.sendRedirect("./Admin Files/Admin_Login.html");
                    
                }
                
	}

}

