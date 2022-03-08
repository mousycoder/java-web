package com.mousycoder.webdemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 8:38 PM
 */
public class CustomDBUtil {

    private static String url;

    private static String username;

    private static String password;

    private static String driver;

    static {

        try {
            Properties properties = new Properties();
            properties.load(CustomDBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
            driver = properties.getProperty("driver");

            Class.forName(driver);


        } catch (Exception e) {

        }

    }

    public static Connection getConnection() throws Exception {
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public static void close(ResultSet resultSet, PreparedStatement ps, Connection connection) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (ps != null) {
                ps.close();
            }

            if (connection != null) {
                connection.close();
            }

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


}
