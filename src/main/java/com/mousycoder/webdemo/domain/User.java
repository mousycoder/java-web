package com.mousycoder.webdemo.domain;

import java.util.Date;
import java.util.StringJoiner;

/**
 * TODO
 *
 * @author mousycoder
 * @version 1.0
 * @date 2022/3/2 10:06 AM
 */
public class User {

    private int id;

    private String phone;

    private String pwd;

    private int sex;

    private String img;

    private Date createTime;

    private int role;

    private String username;

    private String wechat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("phone='" + phone + "'")
                .add("pwd='" + pwd + "'")
                .add("sex=" + sex)
                .add("img='" + img + "'")
                .add("createTime=" + createTime)
                .add("role=" + role)
                .add("username='" + username + "'")
                .add("wechat='" + wechat + "'")
                .toString();
    }
}
