package com.ecommerce.clothing_shop.controller;

import com.ecommerce.clothing_shop.service.HelloService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// dynamic url
// /hello/john
// /hello/mary
@WebServlet(name = "hello", urlPatterns = "/hello/*")
public class HelloController extends HttpServlet {
    @Inject
    HelloService helloService;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getPathInfo().substring(1);
        if ( name.isBlank()) {
            name = "World";
        }
        String message = helloService.createHelloMessage(name);
        // to hello.jsp
        request.setAttribute("message", message);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
        //path is webapp/hello.jsp
    }
}
