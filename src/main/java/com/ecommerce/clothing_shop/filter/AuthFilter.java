package com.ecommerce.clothing_shop.filter;

import com.ecommerce.clothing_shop.entity.User;
import com.ecommerce.clothing_shop.service.CurrentUserService;
import jakarta.inject.Inject;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter(urlPatterns = "/*")
public class AuthFilter implements Filter {
    @Inject
    private CurrentUserService currentUserService;
    private ServletContext context;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        this.context = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        var request = (HttpServletRequest) servletRequest;
        var session = request.getSession(false);
        if (session != null) {
            var user = new User();
            user.setId((String) session.getAttribute("id"));
            currentUserService.setCurrentUser(user);
        }else {
            currentUserService.setCurrentUser(null);
        }
        System.out.println("AuthFilter"+currentUserService.getCurrentUser().orElse(new User()).getId());

        filterChain.doFilter(servletRequest, servletResponse);

    }
    @Override
    public void destroy() {
        Filter.super.destroy();
    }


}
