package jdbc_test.dao;

import jdbc_test.model.User;

import java.sql.*;

/**
 * Created by anton on 3/5/17.
 */
public class UserDao {

    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public void saveUser(User user) throws SQLException {
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();


        String query = "INSERT INTO USERS (USERNAME, PASSWORD, EMAIL) VALUES ('" +
         username + "','"+password+"','"+email+"')";


        System.out.println(query);

        Statement statement = connection.createStatement();
        statement.executeUpdate(query);

    }

    public void saveUserInSafeWay(User user) throws SQLException {
        String username = user.getUsername();
        String password = user.getPassword();
        String email = user.getEmail();

        String query = "INSERT INTO USERS (USERNAME, PASSWORD, EMAIL) VALUES (?, ?, ?)";
        System.out.println(query);
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);
        statement.setString(3, email);
        System.out.println(statement);

        statement.executeUpdate();

    }
}
