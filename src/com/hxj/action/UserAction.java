package com.hxj.action;

import com.hxj.doamin.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String doLogin() {
        return SUCCESS;
    }

}
