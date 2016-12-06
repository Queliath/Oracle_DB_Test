package by.epam.oracletest;

import by.epam.oracletest.dao.SimpleDAO;
import by.epam.oracletest.domain.User;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.sql.*;
import java.util.List;

/**
 * Created by Uladzislau_Kastsevic on 12/6/2016.
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext();
        applicationContext.load("application-context.xml");
        applicationContext.refresh();

        SimpleDAO simpleDAO = applicationContext.getBean("simpleDao", SimpleDAO.class);
        List<User> users = simpleDAO.getAllUsers();

        for(User user : users) {
            System.out.println("User " + user.getId() + ": " + user.getName());
        }
    }
}
