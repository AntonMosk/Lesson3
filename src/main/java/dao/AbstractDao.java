package dao;

/**
 * Created by anton on 2/26/17.
 */
public abstract class AbstractDao<T> implements CRUD_DAO<T>{

    protected final Connection connection;

    protected AbstractDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public T save(T t) {
        connection.getConnection().add(t);
        return t;
    }

    @Override
    public T findById(Integer id) {
        return (T) connection.getConnection().get(id);
    }

    @Override
    public T update(T t, Integer id) {
        return (T) connection.getConnection().set(id, t);
    }

    @Override
    public boolean delete(T t) {
        return connection.getConnection().remove(t);
    }
}
