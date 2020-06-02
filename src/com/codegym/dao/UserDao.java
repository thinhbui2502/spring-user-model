package com.codegym.dao;

import com.codegym.mode.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> users;

    static {
        users = new ArrayList<>();
        User u1 = new User();
        u1.setAge(25);
        u1.setName("ThinhBui");
        u1.setAccount("thinhbui2502");
        u1.setEmail("thinh@codegym.com");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(29);
        u2.setName("BinhNguyen");
        u2.setAccount("binhnguyennb");
        u2.setEmail("binh@codegym.com");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(30);
        u3.setName("LinhHoang");
        u3.setAccount("Linhlinh");
        u3.setEmail("linh@codegym.com");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount())
                    && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
