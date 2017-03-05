package jdbc_test;

import jdbc_test.dao.UserDao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by anton on 3/5/17.
 */
public class Factory {
    public static UserDao getUserDao(Connection connection) {
        return new UserDao(connection);
    }
}
