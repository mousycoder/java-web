//package com.mousycoder.webdemo.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.annotation.WebInitParam;
//import java.io.IOException;
//
///**
// * TODO
// *
// * @author mousycoder
// * @version 1.0
// * @date 2022/3/2 11:47 AM
// */
////@WebFilter(filterName = "xxx",servletNames = {"cookieServlet"},urlPatterns = {"/user/*","/order/*"})
//@WebFilter(filterName = "xxx", urlPatterns = {"/*"}, initParams = {
//        @WebInitParam(name = "encoding", value = "UTF-8"),
//        @WebInitParam(name = "loginPage", value = "/login.jsp")
//},dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST} )
//public class CustomFilter implements Filter {
//
//    private FilterConfig filterConfig;
//
//    private String encoding;
//
//    private String loginPage;
//
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("init");
//
//        this.filterConfig = filterConfig;
//
//        String filterName = filterConfig.getFilterName();
//        System.out.println(filterName);
//        this.encoding = filterConfig.getInitParameter("encoding");
//
//        this.loginPage = filterConfig.getInitParameter("loginPage");
//
//        System.out.println(encoding);
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        System.out.println("dofilter");
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=utf-8");
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destory");
//    }
//}
