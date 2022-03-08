package com.mousycoder.webdemo.controller;

import com.mousycoder.webdemo.domain.User;
import com.mousycoder.webdemo.service.UserService;
import com.mousycoder.webdemo.service.impl.UserServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/1 9:40 PM
 */
@WebServlet(name = "userServlet",urlPatterns = {"/user"})
public class UserServlet extends HttpServlet {

    private UserService userService = new UserServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String method = req.getParameter("method");
        if (method.equals("findById")){
            String idStr = req.getParameter("id");
            int userId = Integer.parseInt(idStr);
            User user = userService.findById(userId);
            System.out.println(user);
        }
        if (method.equals("list")){
            List<User> list = userService.list();
            System.out.println(list);
        }


        if (method.equals("findByIdWithMap")){
            String idStr = req.getParameter("id");
            int userId = Integer.parseInt(idStr);
            Map<String, Object> map = userService.findByIdWithMap(userId);
            System.out.println(map);
        }

        if (method.equals("listWithMap")){
            List<Map<String, Object>> list = userService.listWithMap();
            System.out.println(list);
        }

        if (method.equals("count")){
            int total = userService.countUser();
            System.out.println(total);
        }

        if (method.equals("save")){
            User user = new User();
            user.setId(6);
            user.setPwd("sdd");
            int total = userService.save(user);
            System.out.println(total);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setContentType("text/html;charset=utf-8");
        System.out.println(resp.getContentType());
        String userName = req.getParameter("userName");
        String pwd = req.getParameter("pwd");

        if (userName.equals("mousycoder") && pwd.equals("123")){
            resp.getWriter().write("登录成功");
        }else {
            resp.getWriter().write("账号密码错误");
        }
    }



}
