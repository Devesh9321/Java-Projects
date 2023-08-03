package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.bean.NewsVar;
import com.dao.AddNewsDAO;

/*
 * @author : Devesh Patil
 */
@WebServlet(name = "AddNews", urlPatterns = {"/AddNews"})
public class AddNewsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            NewsVar data = new NewsVar();
            AddNewsDAO operation = new AddNewsDAO();
            PrintWriter pw = response.getWriter();
    
            data.setNType(request.getParameter("ntype"));
            data.setDescrip(request.getParameter("Descrip"));
            data.setHeading(request.getParameter("NHead"));
            data.setDateNews(request.getParameter("NDate"));
        
        if(operation.InsertNews(data)){
            pw.print("</html>"
                    + "</body>"
                    + "<script>\n" 
                    + "     alert(\"News Added Successfully!\");\n" 
                    + "</script>"
                    + "</body>"
                    + "</html>");
             response.sendRedirect("./Admin Files/Add_New.html");
        }
        else{
            pw.print("News Added Failed.");
            response.sendRedirect("./Admin Files/Admin_Dashboard.html");
        }
    
    
    
    
    }

}
