package com.example.demog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class WriteAdver extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=  req.getSession();
        String name =(String) session.getAttribute("firstname");
        String lastName=(String) session.getAttribute("lastname");
        String phoneNumbe=(String) session.getAttribute("PhoneNumbe");
        String pasword=(String) session.getAttribute("Password");
       if (name==null || lastName==null || phoneNumbe==null || pasword==null) {
           resp.sendRedirect("http://localhost:8080/registration.jsp");
       }
       else{
           resp.sendRedirect("http://localhost:8080/index.jsp");
       }
    }
}
