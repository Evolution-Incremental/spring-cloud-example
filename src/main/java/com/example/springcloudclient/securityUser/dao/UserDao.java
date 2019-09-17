package com.example.springcloudclient.securityUser.dao;


import com.example.springcloudclient.securityUser.domain.UserModel;
import org.springframework.stereotype.Component;

/**
 * ClassName:
 * Description:
 * date: 2019/9/11 0011 10:12
 *
 * @author SS
 * @since JDK 1.8
 */

@Component
public interface UserDao {

    UserModel queryUserById(Integer id);

}
