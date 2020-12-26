package com.example.demog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class PrintAdversiment extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ArrayList<Advertisement> advertisements = ListAdvertisement.getAdvertisements();
   advertisements.add(new Advertisement("Sergey","Orlov","776688","0967975678", "Selling a cat"));
req.setAttribute("advertisements",advertisements);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/printOrders.jsp");
dispatcher.forward(req,resp);
    }
}
