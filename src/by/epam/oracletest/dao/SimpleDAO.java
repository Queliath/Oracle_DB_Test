package by.epam.oracletest.dao;

import by.epam.oracletest.domain.User;

import java.util.List;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public interface SimpleDAO {
    List<User> getAllUsers();
}
