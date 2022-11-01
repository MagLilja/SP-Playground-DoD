package org.example;

import org.example.database.UserDao;
import org.example.database.UserDaoImplementation;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        UserDao dao = new UserDaoImplementation();

    }
}
