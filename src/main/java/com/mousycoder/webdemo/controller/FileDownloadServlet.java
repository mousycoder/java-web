package com.mousycoder.webdemo.controller;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 4:25 PM
 */
@WebServlet("/download")
public class FileDownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String file = req.getParameter("file");

        String path = req.getServletContext().getRealPath("/file/");
        String filePath = path + file;


        FileInputStream fis = new FileInputStream(filePath);



        resp.setCharacterEncoding("UTF-8");

        resp.setHeader("Content-Disposition","attachment;filename="+file);


        ServletOutputStream out = resp.getOutputStream();

        byte[] buf = new byte[1024];
        int len;

        while ((len = fis.read(buf) ) != -1){
            out.write(buf,0,len);
        }

        out.close();
    }
}
