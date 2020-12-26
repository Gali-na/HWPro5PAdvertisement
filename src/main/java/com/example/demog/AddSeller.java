package com.example.demog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddSeller extends HttpServlet  {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname=req.getParameter("firstname");
        String  lastName=req.getParameter("lastname");
        String phoneNumbe=req.getParameter("PhoneNumber");
        String password=req.getParameter("password");
        if (firstname==null || lastName==null || phoneNumbe==null || password==null) {
            resp.sendRedirect("http://localhost:8080/registration.jsp");
        }
        else{

            HttpSession session=  req.getSession();
            session.setAttribute("firstname",firstname);
            session.setAttribute("lastName",lastName);
            session.setAttribute("phoneNumbe",phoneNumbe);
            session.setAttribute("passsword",password);
            resp.sendRedirect("http://localhost:8080/index.jsp");
        }
    }
}
