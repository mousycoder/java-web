package com.mousycoder.webdemo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 11:17 AM
 */
@WebServlet("/session_servlet")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();


        System.out.println("sessionid =" + session.getId());

        System.out.println("createtime = " + session.getCreationTime());

        System.out.println("isNew =" + session.isNew());

        session.setAttribute("name","huhao");

        session.invalidate();

    }
}
