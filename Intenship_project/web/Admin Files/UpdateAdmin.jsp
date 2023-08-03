<%-- 
    Document   : UpdateAdmin.jsp
    Created on : 21-Jan-2023, 12:00:07 pm
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
    <title>Sign Up Page</title>
    <style>
        * {

            padding: 0px;
            margin: 0px;
        }

        .signUpDiv {

            text-align: center;
        }

        div form {
            height: 50%;
            width: 50%;
            border-radius: 15px;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            margin: 5% 25%;
        }

        .logbtn {
            margin: 3%;
            padding: 1%;
            background-color: #cad6f7;
            border-radius: 12px;
            width: 100px;
        }

        .logbtn:hover {

            width: 100px;
            margin: 3%;
            padding: 1%;
            border-radius: 12px;
            background-color: rgb(216, 178, 253);
            color: #031085;
        }

        .inbox {
            border: 2px solid #000;
            border-radius: 12px;
            width: 70%;
            padding: 4px;
            padding-left: 12px;
            margin: 1%;
        }

        h1 {
            text-align: center;
            font-size: 31px;
        }

        h2 {
            font-size: 27px;
        }
    </style>

</head>

<body>
<%
	PreparedStatement ps = Connector.getConnect().prepareStatement("Select * from admin_info;");
        
	ResultSet rs = ps.executeQuery();
        rs.next();
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
                <a class="mr-5 hover:text-gray-900" href="./View_Products.jsp">View Products</a>
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


    <H1>Please Login For the Better Exprience</H1>

    <div class="signUpDiv">
        <h2>Add Admin</h2>
        <Form action="../AdSignServlet" method="post">
            <input name="Aname" class="inbox" type="text" value="<%= rs.getString(4)  %>" required>

            <input name="Asurname" class="inbox" type="text" value="<%= rs.getString(4)  %>" required>

            <input name="Email" class="inbox" type="email" value="<%= rs.getString(5)  %>" required>

            <!-- <input name="phone" class="inbox" type="number" placeholder="Enter Proper Phone Number" min="10" required> -->
            <input type="tel" class="inbox" name="phone" value="<%= rs.getString(6)  %>" pattern="[0-9]{10}" required>

            <input name="username" class="inbox" type="text" placeholder="<%= rs.getString(2)  %>" required>

            <input name="pass" class="inbox" type="password" placeholder="<%= rs.getString(3)  %>" required>

            <input type="submit" class="logbtn" value="Add Admin">

        </Form>

    </div>

    <!-- Footer -->

    <footer class="text-gray-600 body-font">
        <div class="container px-5 py-8 mx-auto flex items-center sm:flex-row flex-col">
            <a class="flex title-font font-medium items-center md:justify-start justify-center text-gray-900">
                <div>
                    <img src="../Images/icon.jpg" alt="" width="70px" height="100px">
                </div>
                <span class="ml-3 text-xl">Kisan Buddy</span>
            </a>
            <p class="text-sm text-gray-500 sm:ml-4 sm:pl-4 sm:border-l-2 sm:border-gray-200 sm:py-2 sm:mt-0 mt-4">©
                2022 Kisan Buddy —
                <a href="https://twitter.com/knyttneve" class="text-gray-600 ml-1" rel="noopener noreferrer"
                    target="_blank">@kisanBuddy</a>
            </p>
            <span class="inline-flex sm:ml-auto sm:mt-0 mt-4 justify-center sm:justify-start">
                <a class="text-gray-500">
                    <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        class="w-5 h-5" viewBox="0 0 24 24">
                        <path d="M18 2h-3a5 5 0 00-5 5v3H7v4h3v8h4v-8h3l1-4h-4V7a1 1 0 011-1h3z"></path>
                    </svg>
                </a>
                <a class="ml-3 text-gray-500">
                    <svg fill="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                        class="w-5 h-5" viewBox="0 0 24 24">
                        <path
                            d="M23 3a10.9 10.9 0 01-3.14 1.53 4.48 4.48 0 00-7.86 3v1A10.66 10.66 0 013 4s-4 9 5 13a11.64 11.64 0 01-7 2c9 5 20 0 20-11.5a4.5 4.5 0 00-.08-.83A7.72 7.72 0 0023 3z">
                        </path>
                    </svg>
                </a>
                <a class="ml-3 text-gray-500">
                    <svg fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                        stroke-width="2" class="w-5 h-5" viewBox="0 0 24 24">
                        <rect width="20" height="20" x="2" y="2" rx="5" ry="5"></rect>
                        <path d="M16 11.37A4 4 0 1112.63 8 4 4 0 0116 11.37zm1.5-4.87h.01"></path>
                    </svg>
                </a>
                <a class="ml-3 text-gray-500">
                    <svg fill="currentColor" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round"
                        stroke-width="0" class="w-5 h-5" viewBox="0 0 24 24">
                        <path stroke="none"
                            d="M16 8a6 6 0 016 6v7h-4v-7a2 2 0 00-2-2 2 2 0 00-2 2v7h-4v-7a6 6 0 016-6zM2 9h4v12H2z">
                        </path>
                        <circle cx="4" cy="4" r="2" stroke="none"></circle>
                    </svg>
                </a>
            </span>
        </div>
    </footer>
</body>

</html>
