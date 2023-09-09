package com.ecommerce.clothing_shop.controller;

import com.ecommerce.clothing_shop.service.HelloService;
import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "test", urlPatterns = "/test")
public class TestController extends HttpServlet{
    @Inject
    private  HelloService helloService;
    @Override
    public void doGet(jakarta.servlet.http.HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response) throws jakarta.servlet.ServletException, java.io.IOException {
        var message = helloService.createHelloMessage();
        request.setAttribute("message", message);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}
