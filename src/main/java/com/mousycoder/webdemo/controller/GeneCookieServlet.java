package com.mousycoder.webdemo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 10:53 AM
 */
@WebServlet("/gene_cookie_test")
public class GeneCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("token","dfdsfdfds");
        cookie.setMaxAge(20);
        resp.addCookie(cookie);

        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
