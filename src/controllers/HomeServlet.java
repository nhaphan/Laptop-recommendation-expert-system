package controllers;

import models.bean.Computer;
import models.dao.ProductDao;

import java.io.IOException;
import java.util.List;

public class HomeServlet extends javax.servlet.http.HttpServlet {


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String type = request.getParameter("type");
        String color = request.getParameter("color");
        String price = request.getParameter("price");
        String cpu = request.getParameter("cpu");
        String ram = request.getParameter("ram");
        String graphic = request.getParameter("graphic");
        String storage = request.getParameter("storage");
        String battery= request.getParameter("battery");
        String display = request.getParameter("display");

        System.out.println(type + color  + cpu + ram + graphic + storage + battery + display);
        System.out.println(price);



        List<Computer> computers = ProductDao.listComputers(type,color,price,cpu,ram,graphic,storage,battery,display);
        request.setAttribute("computers", computers);
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
