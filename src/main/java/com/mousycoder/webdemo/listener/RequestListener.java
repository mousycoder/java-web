package com.mousycoder.webdemo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 3:45 PM
 */
@WebListener
public class RequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("RequestListener.requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("RequestListener.requestInitialized");

        Integer totalVisit = (Integer)sre.getServletContext().getAttribute("totalVisit");
        System.out.println("历史总访问次数 " + totalVisit);
        totalVisit++;
        sre.getServletContext().setAttribute("totalVisit",totalVisit);
    }
}
