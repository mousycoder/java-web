package com.mousycoder.webdemo.controller;

import com.mousycoder.webdemo.domain.Config;
import com.mousycoder.webdemo.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 9:47 AM
 */
@WebServlet("/forward")
public class DispatchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        Config config = (Config)req.getServletContext().getAttribute("config");
//        System.out.println(config.getTopic());
//
//        System.out.println("DispatchServlet.doGet");
////        req.getRequestDispatcher("/WEB-INF/admin.jsp").forward(req,resp);
//
//        User user = new User();
//        user.setHost("https");
//        user.setId(1);
//        user.setName("huhao1");
//
//        req.setAttribute("user",user);
//        req.setAttribute("name","name1");
//
//        req.getRequestDispatcher("/index.jsp").forward(req,resp);
////          resp.sendRedirect("/index.jsp");
    }
}
