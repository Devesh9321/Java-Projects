
package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.bean.ProductVar;
import com.dao.AddProdDAO;

/*
 * @author : Devesh Patil
 */

@WebServlet(name = "AddProdServlet", urlPatterns = {"/AddProdServlet"})
public class AddProdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductVar data = new ProductVar();
        AddProdDAO operation = new AddProdDAO();
        
        
        data.setProdName(request.getParameter("Nprod"));
        data.setCompany(request.getParameter("Comp"));
        data.setDescrip(request.getParameter("descrip"));
        data.setType(request.getParameter("typeP"));
        data.setPrice(Integer.parseInt(request.getParameter("Pprod")));
        PrintWriter pw = response.getWriter();
        
        if(operation.InsertProd(data)){
            pw.print("</html>"
                    + "</body>"
                    + "<script>\n" 
                    + "     alert(\"Product Added Successfully!\");\n" 
                    + "</script>"
                    + "</body>"
                    + "</html>");
             response.sendRedirect("./Admin Files/Add_Products.html");
        }
        else{
            pw.print("Product Added Failed.");
        response.sendRedirect("./Admin Files/Admin_Dashboard.html");
        }
        
    }

}
