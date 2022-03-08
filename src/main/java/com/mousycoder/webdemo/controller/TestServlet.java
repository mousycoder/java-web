package com.mousycoder.webdemo.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/1 9:40 PM
 */
@WebServlet(name = "testServlet",urlPatterns = {"/test1"},loadOnStartup = 0)
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        writer.write("<div> testServlet </div>");

        ServletContext servletContext = req.getServletContext();

        String appInfo = (String)servletContext.getAttribute("appInfo");
        System.out.println(appInfo);

    }


}
