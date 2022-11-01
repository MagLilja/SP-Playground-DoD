package org.example.database;

import org.example.domain.User;

import java.util.List;

public interface UserDao {
    User findUserById(int id);

    List<User> findAllUsers();
}
