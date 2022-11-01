package org.example.database;

import org.example.domain.User;

import java.util.List;
import java.util.Map;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserDaoImplementation implements UserDao {




    public UserDaoImplementation() {
        Map<String, String> envVariables = System.getenv();

        System.out.println(envVariables);


    }

    private void loadDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public User findUserById(int id) {
        return null;
    }

    public List<User> findAllUsers() {
        return null;
    }
}
