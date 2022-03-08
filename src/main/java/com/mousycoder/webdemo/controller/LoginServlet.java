package com.mousycoder.webdemo.controller;

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
 * @date 2022/3/2 11:25 AM
 */

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("name");
//        String pwd = req.getParameter("pwd");
//
//        if (name.equals("huhao") && pwd.equals("123")){
//            User user = new User();
//            user.setId(121);
//            user.setName(name);
//            user.setHost("ddd");
//            req.getSession().setAttribute("loginUser",user);
//            req.getRequestDispatcher("/user/user.jsp").forward(req,resp);
//        }else {
//            req.setAttribute("msg","账号密码错误");
//            req.getRequestDispatcher("/login.jsp").forward(req,resp);
//        }

    }
}
