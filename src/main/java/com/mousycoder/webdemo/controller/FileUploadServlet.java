package com.mousycoder.webdemo.controller;

import javax.print.attribute.standard.MediaSize;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 4:00 PM
 */
@WebServlet("/fileUpload")
@MultipartConfig
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println(username);
        Part part = req.getPart("img");
        String fileName = part.getName();
        System.out.println(fileName);

        String header = part.getHeader("content-disposition");
        System.out.println(header);
        String realFileName = header.substring(header.indexOf("filename=") + 10, header.length() - 1);
        System.out.println(realFileName);

        InputStream is = part.getInputStream();

        String dir = this.getServletContext().getRealPath("/file");

        File dirFile = new File(dir);
        if (!dirFile.exists()) {
            dirFile.mkdirs();
        }

        File file = new File(dir, realFileName);

        FileOutputStream out = new FileOutputStream(file);

        byte[] buf = new byte[1024];
        int len;

        while ((len = is.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        out.close();
        is.close();

        req.getRequestDispatcher("/file/"+realFileName).forward(req,resp);

    }
}
