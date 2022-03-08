package com.mousycoder.webdemo.listener;

import com.mousycoder.webdemo.domain.Config;
import com.sun.xml.internal.ws.api.policy.SourceModel;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 3:00 PM
 */
@WebListener
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextListener.contextInitialized");
        ServletContext servletContext = sce.getServletContext();

        String url = servletContext.getInitParameter("url");
        String topic = servletContext.getInitParameter("topic");

        Config config = new Config();
        config.setTopic(topic);
        config.setUrl(url);

        servletContext.setAttribute("config",config);
        servletContext.setAttribute("onlineNum",0);
        servletContext.setAttribute("totalVisit",0);

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ContextListener.contextDestroyed");
    }
}
