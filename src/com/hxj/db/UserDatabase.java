package com.hxj.db;

import com.hxj.doamin.Book;
import com.hxj.doamin.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDatabase {
    private static List<User> bdb = new ArrayList<User>();


    public boolean addUser(User user) {
        if (bdb.contains(user)) {
            return false;
        }
        bdb.add(user);
        return true;
    }

    public boolean delUser(String username) {
        Iterator<User> iterator = bdb.iterator();
        while (iterator.hasNext()) {
            User user = iterator.next();
            if (user.getUsername().equals(username)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
