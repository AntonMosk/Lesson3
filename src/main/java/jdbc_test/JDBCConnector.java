package jdbc_test;

import org.h2.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by anton on 3/5/17.
 */
public class JDBCConnector {

    public static Connection getConnection() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Connection connection = null;

        String url = "jdbc:h2:tcp://localhost/~/test";
        String username = "sa";
        String password = "";

        Driver driver = (Driver) Class.forName("org.h2.Driver").newInstance();
        DriverManager.registerDriver(driver);
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }
}
