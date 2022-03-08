//package com.mousycoder.webdemo.dao;
//
//
//import com.mysql.jdbc.JDBC4PreparedStatement;
//
//import java.sql.*;
//
///**
// * TODO
// *
// * @author mousycoder
// * @version 1.0
// * @date 2022/3/2 5:51 PM
// */
//public class JDBCTest {
//
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        testTransaction();
//    }
//
//    private static void testInjectSQL() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String userName = "root";
//        String password = "Aa123456789";
//        String url = "jdbc:mysql://127.0.0.1:3306/test2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        Connection connection = DriverManager.getConnection(url, userName, password);
//
//        Statement statement = connection.createStatement();
//
//        String name = "jack";
//        String pwd = "666 or 1 =1";
//
//        ResultSet resultSet = statement.executeQuery("select * from user where username='" + name + "' and pwd=" + pwd);
//
//        while (resultSet.next()) {
//            System.out.print("用户名: name " + resultSet.getString("username"));
//            System.out.print("联系方式: wechat " + resultSet.getString("wechat"));
//            System.out.println("==");
//        }
//
//        statement.close();
//        connection.close();
//    }
//
//
//    private static void protectInjectSQL() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String userName = "root";
//        String password = "Aa123456789";
//        String url = "jdbc:mysql://127.0.0.1:3306/test2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        Connection connection = DriverManager.getConnection(url, userName, password);
//
//        Statement statement = connection.createStatement();
//        String name = "jack";
//        String pwd = "666' or '1 =1'";
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from user where username= ? and pwd=?");
//        preparedStatement.setString(1, name);
//        preparedStatement.setString(2, pwd);
//
//
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//
//
//        while (resultSet.next()) {
//            System.out.print("用户名: name " + resultSet.getString("username"));
//            System.out.print("联系方式: wechat " + resultSet.getString("wechat"));
//            System.out.println("==");
//        }
//
//        statement.close();
//        connection.close();
//    }
//
//
//    private static void testAdd() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String userName = "root";
//        String password = "Aa123456789";
//        String url = "jdbc:mysql://127.0.0.1:3306/test2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        Connection connection = DriverManager.getConnection(url, userName, password);
//
//        Statement statement = connection.createStatement();
//        String name = "jack";
//        String pwd = "666' or '1 =1'";
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into user(username,pwd,sex,role,create_time) values(?,?,?,?,?)");
//        preparedStatement.setString(1, "huhao");
//        preparedStatement.setString(2, "111");
//        preparedStatement.setInt(3, 1);
//        preparedStatement.setInt(4, 2);
//        preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
//
//
//        preparedStatement.execute();
//
//        String rsq = ((JDBC4PreparedStatement) preparedStatement).asSql();
//        System.out.println(rsq);
//
//        preparedStatement.close();
//        statement.close();
//        connection.close();
//    }
//
//
//    private static void testDel() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String userName = "root";
//        String password = "Aa123456789";
//        String url = "jdbc:mysql://127.0.0.1:3306/test2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        Connection connection = DriverManager.getConnection(url, userName, password);
//
//        Statement statement = connection.createStatement();
//        String name = "jack";
//        String pwd = "666' or '1 =1'";
//        PreparedStatement preparedStatement = connection.prepareStatement("delete from user where id = ?");
//        preparedStatement.setString(1, "2");
//
//        preparedStatement.execute();
//
//        String rsq = ((JDBC4PreparedStatement) preparedStatement).asSql();
//        System.out.println(rsq);
//
//        preparedStatement.close();
//        statement.close();
//        connection.close();
//    }
//
//    private static void testTransaction() throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.jdbc.Driver");
//        String userName = "root";
//        String password = "Aa123456789";
//        String url = "jdbc:mysql://127.0.0.1:3306/test2?useUnicode=true&characterEncoding=utf-8&useSSL=false";
//
//        Connection connection = DriverManager.getConnection(url, userName, password);
//        connection.setAutoCommit(false);
//
//        try (PreparedStatement ps1 = connection.prepareStatement("insert into user(username,pwd) values(?,?)");
//             PreparedStatement ps2 = connection.prepareStatement("insert into user(username,pwd) values(?,?)");
//        ) {
//
//            ps1.setString(1, "ps111");
//            ps1.setString(2, "111");
//
//            ps2.setString(1, "ps222");
//            ps2.setString(2, "111");
//            System.out.println(((JDBC4PreparedStatement) ps1).asSql());
//            System.out.println(((JDBC4PreparedStatement) ps2).asSql());
//
//            ps1.execute();
//
//            int i = 1 / 0;
//
//            ps2.execute();
//        } catch (Exception e) {
//            e.printStackTrace();
//            connection.rollback();
//        } finally {
//            connection.commit();
//            connection.close();
//        }
//
//
//    }
//}
