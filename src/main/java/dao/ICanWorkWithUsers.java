package dao;

/**
 * Created by anton on 2/26/17.
 */
public class ICanWorkWithUsers {
    private UserDaoImpl userDao;

    public ICanWorkWithUsers(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public User iCanSaveUser(User user) {
        userDao.save(user);
        return user;
    }

    public User iCanDeleteUser(User user) {
        userDao.delete(user);
        return user;
    }

    public User iCanFindUser(Integer id) {
        return userDao.findById(id);
    }

    public User iCanUpdateUser(User user, Integer id) {
        return userDao.update(user, id);
    }
}
