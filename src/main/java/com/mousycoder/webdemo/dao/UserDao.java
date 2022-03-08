package com.mousycoder.webdemo.dao;

import com.mousycoder.webdemo.domain.User;
import com.mousycoder.webdemo.util.DataSourceUtil;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.*;

import javax.xml.ws.handler.Handler;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 5:32 PM
 */
public class UserDao {

    private QueryRunner queryRunner = new QueryRunner(DataSourceUtil.getDataSource());

    private BeanProcessor bean = new GenerousBeanProcessor();
    private RowProcessor processor = new BasicRowProcessor(bean);


    public List<User> list() {
        String sql = "select * from user ";

        List<User> list = null;

        try {
            list = queryRunner.query(sql, new BeanListHandler<>(User.class,processor));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }


    public User findById(int id) {
        String sql = "select * from user where id = ?";
        User user = null;

        try {
            user = queryRunner.query(sql, new BeanHandler<>(User.class,processor), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;

    }


    public Map<String,Object> findByIdWithMap(int id) {
        String sql = "select * from user where id = ?";
        Map<String,Object> map = null;

        try {
            map = queryRunner.query(sql, new MapHandler(), id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return map;

    }


    public List<Map<String,Object>> listWithMap() {
        String sql = "select * from user ";
        List<Map<String,Object>> list = null;

        try {
            list = queryRunner.query(sql, new MapListHandler());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;

    }


    public int countUser() {
        String sql = "select count(*) from user ";
        Long count = null;

        try {
            count = queryRunner.query(sql, new ScalarHandler<>());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count.intValue();

    }

    public int save(User user){
        String sql = "insert into user(id,pwd) values(?,?)";
        Object[] params = {
                user.getId(),
                user.getPwd()
        };
        int rows = 0;
        try {
            rows = queryRunner.update(sql, params);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rows;
    }



}
