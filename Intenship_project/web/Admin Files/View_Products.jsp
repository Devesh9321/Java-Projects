<%-- 
    Document   : View_Products.jsp
    Created on : 20-Jan-2023, 11:52:09 pm
    Author     : : Devesh Patil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="com.db.Connector" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
    <link rel="stylesheet" href="./Design.css">
    <title>View Products</title>

</head>

<body>
<%
	PreparedStatement ps = Connector.getConnect().prepareStatement("Select * from products;");
        
	ResultSet rs = ps.executeQuery();
%>

    <!-- Start Header-->

    <header class="text-gray-600 body-font">
        <div class="container mx-auto flex flex-wrap p-5 flex-col md:flex-row items-center">
            <a class="flex title-font font-medium items-center text-gray-900 mb-4 md:mb-0">
                <img src="../Images/icon.jpg" alt="logo" style="width: 100px;height:100px;">
                <span class="ml-3 text-xl">kisan Buddy</span>
            </a>
            <nav
                class="md:mr-auto md:ml-4 md:py-1 md:pl-4 md:border-l md:border-gray-400	flex flex-wrap items-center text-base justify-center">
                <a class="mr-5 hover:text-gray-900" href="./Admin_Dashboard.html">Home</a>
                <a class="mr-5 hover:text-gray-900" href="./Add_Products.html">Add Products</a>
                <a class="mr-5 hover:text-gray-900" href="./Add_New.html">Add News</a>
                <a class="mr-5 hover:text-gray-900" href="./View_Products.jsp"
                    style="padding: 2px 7px ; border-radius: 12px;background-color: aquamarine;color: navy;">View
                    Products</a>
                <a class="mr-5 hover:text-gray-900" href="./View_News.jsp">View News</a>
                <!-- <a class="mr-5 hover:text-gray-900"></a> -->
            </nav>
            <select id="touchsplashmenu" onchange="window.open(this.value,'_self');">
                <option value="#">Admin </option>
                <option value="./SignUpPage.html">Add Admin</option>
                <option value="#">Update info</option>
                <option value="../HomePage.html">Log-Out</option>
            </select>
        </div>
    </header>
    <!--End Header -->

    <!-- Start View Products  -->

    <section>
        <div class="just_cent ">

            <h1 class="heading1"> Products Updated List </h1>

            <table class="inform fullTable ">
                <tr style="background-color: #04AA6D;">
                    <th>Sr No</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Company</th>
                    <th>Description</th>
                    <th>Type</th>
                </tr>
                <tbody>
                    <!-- Start Update by JSP with database -->
                    <%
  int i=1;
  while(rs.next()){
%>  
	  
	  <tr>
	    <td><%= i %></td>
	    <td><%= rs.getString(2) %></td>
	    <td><%= rs.getInt(6) %></td>
	    <td><%= rs.getString(3) %></td>
	    <td><%= rs.getString(4) %></td>
	    <td><%= rs.getString(5) %></td>
	  </tr>
		
	
<%	i=i+1;
	}
%>                
                    
                    <!-- End Update by JSP with database -->

                </tbody>

            </table>
        </div>
    </section>

    <!--  End View Products-->

    <!-- Start Footer -->
    <footer class="text-gray-600 body-font">
        <div class="container px-5 py-8 mx-auto flex items-center sm:flex-row flex-col"  style=" bottom: 0; display:flex;justify-content: center;align-items: center;">
            <a class="flex title-font font-medium items-center md:justify-start justify-center text-gray-900">
                <div>
                    <img src="../Images/icon.jpg" alt="" width="70px" height="100px">
                </div>
                <span class="ml-3 text-xl">Kisan Buddy</span>
            </a>
            <p class="text-sm text-gray-500 sm:ml-4 sm:pl-4 sm:border-l-2 sm:border-gray-200 sm:py-2 sm:mt-0 mt-4">©
                2022 Kisan Buddy —
                <a class="text-gray-600 ml-1" target="_blank">@kisanBuddy</a>
            </p>
            <span class="inline-flex sm:ml-auto sm:mt-0 mt-4 justify-center sm:justify-start">
                <a class="text-gray-500">
                    <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        class="w-5 h-5" viewBox="0 0 24 24">
                        <path d="M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z"></path>
                    </svg>
                </a>
                <a class="ml-3 text-gray-500">
                    <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                        stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">
                        <rect width="20" height="20" x="2" y="2" rx="5" ry="5"></rect>
                        <path d="M16 11.37A4 4 0 1112.63 8 4 4 0 0116 11.37zm1.5-4.87h.01"></path>
                    </svg>
                </a>

            </span>
        </div>
    </footer>

    <!-- End Footer -->
</body>

</html>
