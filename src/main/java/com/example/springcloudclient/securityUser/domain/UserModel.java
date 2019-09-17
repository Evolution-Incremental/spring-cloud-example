package com.example.springcloudclient.securityUser.domain;

import java.io.Serializable;

/**
 * ClassName:
 * Description:
 * date: 2019/9/11 0011 10:10
 *
 * @author SS
 * @since JDK 1.8
 */
public class UserModel implements Serializable {

    private Integer Id;
    private String userName;
    private String passWord;
    private String role;
    private String remark;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
