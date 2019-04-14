package com.dolnikova;

import com.dolnikova.dao.UserDao;
import com.dolnikova.model.User;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        int count = userDao.removeAll();
        System.out.println("Deleted items count: " + count);
        System.out.println();

        userDao.addUser(new User("Ivan", 25));
        userDao.addUser(new User("Igor", 40));
        userDao.addUser(new User("Alex", 30));
        userDao.addUser(new User("Sofia", 28));

        System.out.println("Students: " + userDao.getAllUsers());
        System.out.println();

        User user = new User("Yuli", 15);
        userDao.addUser(user);

        user = userDao.getUser(user.getId());
        System.out.println("User by id: " + user);
        user.setAge(17);
        userDao.updateUser(user);

        System.out.println("Students by age: " + userDao.getByAge(30, 50));

        user = userDao.getByName("Ivan");
        userDao.delete(user);
        System.out.println("Students: " + userDao.getAllUsers());

        userDao.addUser(new User("Oleg", 26));

        user = userDao.getByName("oleg");
        userDao.removeUser(user.getId());

        userDao.removeUserByName("igor");

        userDao.close();
    }

}
