package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.dao.UserDaoImpl;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);

    }

    @Override
    public List<User> getUserList() {
        return userDao.getUserList();
    }

    @Override
    public void delete(int id) {
        userDao.deleteById(id);
    }

    @Override
    public void update(int id, User user) {

        User userToUpdate = userDao.getById(id);

        userToUpdate.setName(user.getName());
        userToUpdate.setLastName(user.getLastName());
        userToUpdate.setSalary(user.getSalary());

        userDao.update(userToUpdate);
    }

    @Override
    public User getUserById(int id) {
        return userDao.getById(id);
    }
}
