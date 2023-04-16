package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void add(User user) {
        entityManager.persist(user);
        System.out.println("added");
    }

    @Override
    public List<User> getUserList() {
        return entityManager.createQuery("SELECT u from User u", User.class)
                .getResultList();
    }

    @Override
    public void deleteById(int id) {
        entityManager.remove(getById(id));
        System.out.println("deleted");
    }

    @Override
    public void update(User user) {
        entityManager.merge(user);
    }

    @Override
    public User getById(int id) {
        TypedQuery<User> typedQuery = entityManager.createQuery(
                "select u from User u where u.id = :id", User.class
        );
        typedQuery.setParameter("id", id);
        return typedQuery.getResultList().stream().findAny().orElse(null);
    }
}
