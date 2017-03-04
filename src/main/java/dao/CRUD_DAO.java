package dao;

/**
 * Created by anton on 2/26/17.
 */
public interface CRUD_DAO<T> {
    T save(T t);
    T findById(Integer id);
    T update(T t, Integer id);
    boolean delete (T t);
}
