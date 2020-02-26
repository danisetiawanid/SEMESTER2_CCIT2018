<%-- 
    Document   : loginCheck
    Created on : Jul 3, 2019, 5:33:58 PM
    Author     : Haidar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>We Care Site Admin</title>
    </head>
    <body>
        <%
            String username=request.getParameter("username");
            String password=request.getParameter("pass");
            
            if((username.equals("admin") && password.equals("admin")))
                 {
            session.setAttribute("username",username);
            response.sendRedirect("home.jsp");
            }
            else
            response.sendRedirect("error.jsp");
        %>

    </body>
</html>
