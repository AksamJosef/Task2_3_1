package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void add (User user);

    List<User> getUserList();

    void deleteById (int id);

    void update (User user);

    User getById (int id);

}
