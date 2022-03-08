package com.mousycoder.webdemo.service.impl;

import com.mousycoder.webdemo.dao.UserDao;
import com.mousycoder.webdemo.domain.User;
import com.mousycoder.webdemo.service.UserService;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 5:32 PM
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    @Override
    public User findById(int id) {
        return userDao.findById(id);
    }

    @Override
    public List<User> list() {
        return userDao.list();
    }

    @Override
    public Map<String, Object> findByIdWithMap(int id) {
        return userDao.findByIdWithMap(id);
    }

    @Override
    public List<Map<String, Object>> listWithMap() {
        return userDao.listWithMap();
    }
    @Override
    public int countUser() {
        return userDao.countUser();
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }


}
