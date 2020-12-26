package com.example.demog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

public class AddAdvertisement extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String advertisement  = req.getParameter("advertisement");
        HttpSession session=  req.getSession();
        String name =(String) session.getAttribute("firstname");
        String lastName=(String) session.getAttribute("lastname");
        String phoneNumbe=(String) session.getAttribute("PhoneNumbe");
        String pasword=(String) session.getAttribute("Password");
        Advertisement advertisement1 =new Advertisement(name,lastName,phoneNumbe,pasword,advertisement);
        ListAdvertisement.getAdvertisements().add(advertisement1);
        ArrayList<Advertisement> advertisements = ListAdvertisement.getAdvertisements();
        req.setAttribute("advertisements",advertisements);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/printOrders.jsp");
        dispatcher.forward(req,resp);
    }
}
