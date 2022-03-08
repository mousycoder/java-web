package com.mousycoder.webdemo.util;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 9:45 PM
 */
public class DataSourceUtil {

    private static DataSource dataSource;

    static {
        try {
            InputStream in = DataSourceUtil.class.getClassLoader().getResourceAsStream("database.properties");
            Properties p = new Properties();
            p.load(in);

            dataSource = BasicDataSourceFactory.createDataSource(p);

        }catch (Exception e){
            e.printStackTrace();
            throw new ExceptionInInitializerError("初始化DBPC失败");
        }
    }

    public static DataSource getDataSource(){
        return dataSource;
    }
}
