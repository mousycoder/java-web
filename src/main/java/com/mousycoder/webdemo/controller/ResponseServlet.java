package com.mousycoder.webdemo.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 12:23 AM
 */
@WebServlet("/response")
public class ResponseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");

        resp.setHeader("Content-Type","text/html;charset=utf-8");

        String data = "你好，我是胡浩";

//        OutputStream outputStream = resp.getOutputStream();
//
//        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
//
//        outputStream.write(bytes);

        PrintWriter writer = resp.getWriter();
        writer.write(data);


    }
}
