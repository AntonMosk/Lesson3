package jdbc_test;

import jdbc_test.dao.UserDao;
import jdbc_test.model.User;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by anton on 3/5/17.
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Connection connection = JDBCConnector.getConnection();
        UserDao userDao = Factory.getUserDao(connection);
        //User user = new User("Pasha124", "Qwe1234", "pasha3@firma.com'); DROP TABLE USERS;'");

        User user = new User("Pasha474", "Qwe1234", "pasha3@firma.com");
        userDao.saveUser(user);

        User user2 = new User("Pasha424", "Qwe1234", "pasha3@firma.com'); DROP TABLE USERS;'");
        userDao.saveUserInSafeWay(user2);

//        User user3 = new User("Pasha444", "Qwe1234", "pasha3@firma.com'); DROP TABLE USERS;'");
//        userDao.saveUser(user3);


    }
}
