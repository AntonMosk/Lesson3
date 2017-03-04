import cars.Opel;
import dao.*;
import vehicle.Engine;

/**
 * Created by anton on 2/25/17.
 */
public class Main {

    public static void main(String[] args) {
        Connection connection = new Connection();
        UserDaoImpl userDao = new UserDaoImpl(connection);
        System.out.println(connection.getConnection());

        ICanWorkWithUsers iCanWorkWithUsers = new ICanWorkWithUsers(userDao);

        User user = new User("Vasya", "vasya@gmail.com", "123123");
        iCanWorkWithUsers.iCanSaveUser(user);
        System.out.println(connection.getConnection());

        User user2 = new User("Petya", "petya@gmail.com", "456456");
        iCanWorkWithUsers.iCanSaveUser(user2);
        System.out.println(connection.getConnection());

        User user3 = new User("Kostya", "kostya@gmail.com", "789789");
        iCanWorkWithUsers.iCanSaveUser(user3);
        System.out.println(connection.getConnection());

        System.out.println(iCanWorkWithUsers.iCanFindUser(1));

        iCanWorkWithUsers.iCanDeleteUser(user2);
        System.out.println(connection.getConnection());

        System.out.println(iCanWorkWithUsers.iCanFindUser(1));

//        iCanWorkWithUsers.iCanUpdateUser(user2, 2);
//        System.out.println(connection.getConnection());
    }
}
