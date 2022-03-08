//package com.mousycoder.webdemo.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.annotation.WebInitParam;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * TODO
// *
// * @author mousycoder
// * @version 1.0
// * @date 2022/3/2 11:47 AM
// */
//@WebFilter(filterName = "loginFilter", urlPatterns = {"/user/*"}, initParams = {
//        @WebInitParam(name = "encoding", value = "UTF-8"),
//        @WebInitParam(name = "loginPage", value = "/login.jsp")
//})
//public class LoginFilter implements Filter {
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
//        request.setCharacterEncoding(encoding);
//        response.setCharacterEncoding(encoding);
//        response.setContentType("text/html;charset=utf-8");
//
//        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//
//        if (httpServletRequest.getSession().getAttribute("loginUser") != null) {
//            chain.doFilter(request, response);
//        }else {
//            httpServletRequest.setAttribute("msg","非法访问，请登录");
//            httpServletRequest.getRequestDispatcher(loginPage).forward(httpServletRequest,httpServletResponse);
//        }
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("destory");
//    }
//}
