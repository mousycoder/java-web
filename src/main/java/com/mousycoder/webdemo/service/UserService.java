package com.mousycoder.webdemo.service;

import com.mousycoder.webdemo.domain.User;

import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 5:31 PM
 */
public interface UserService {

    User findById(int id);

    List<User> list();

    Map<String,Object> findByIdWithMap(int id);


    List<Map<String,Object>> listWithMap();

    int countUser();

    int save(User user);
}
