package com.example.springcloudclient.securityUser.controller;

import com.example.springcloudclient.securityUser.domain.UserModel;
import com.example.springcloudclient.securityUser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * ClassName:
 * Description:
 * date: 2019/9/12 0012 14:39
 *
 * @author SS
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/user/Comtroller")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserModel",method = RequestMethod.GET)
    public UserModel getUserModel(@RequestParam(value = "id",required = false) Integer id){
        UserModel userModel = userService.queryUserById(id);
        return userModel;
    }


    @RequestMapping(value = "/getUserModelByPost",method = {RequestMethod.POST},headers = "Content-Type=application/json")
    public UserModel getUserModelByPost(@RequestBody Integer ids){
        UserModel userModel = userService.queryUserById(ids);
        return userModel;
        //return null;
    }


}
