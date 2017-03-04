package dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anton on 2/26/17.
 */
public class Connection {

    private Database database;

    public List<Object> getConnection() {
        if (this.database == null) {
            database = new Database();
        }
        return database.DATABASE;
    }

    private class Database {
        final List<Object> DATABASE = new ArrayList<>();
    }
}