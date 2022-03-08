package com.mousycoder.webdemo.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 3:32 PM
 */
@WebListener
public class SessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("SessionListener.sessionCreated");

        ServletContext servletContext = se.getSession().getServletContext();

        Integer onlineNum = (Integer) servletContext.getAttribute("onlineNum");
        servletContext.setAttribute("onlineNum",++onlineNum);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("SessionListener.sessionDestroyed");

        ServletContext servletContext = se.getSession().getServletContext();

        Integer onlineNum = (Integer) servletContext.getAttribute("onlineNum");
        servletContext.setAttribute("onlineNum",--onlineNum);
    }
}
