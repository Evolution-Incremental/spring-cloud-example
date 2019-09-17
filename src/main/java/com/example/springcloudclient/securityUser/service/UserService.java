package com.example.springcloudclient.securityUser.service;


import com.example.springcloudclient.securityUser.dao.UserDao;
import com.example.springcloudclient.securityUser.domain.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:
 * Description:
 * date: 2019/9/11 0011 10:11
 *
 * @author SS
 * @since JDK 1.8
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public UserModel queryUserById(Integer id) {
        UserModel userModel = userDao.queryUserById(id);
        return userModel;
    }
}
