package in.ongrid.b2cportal.dao;

import in.ongrid.b2cportal.entity.User;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    private final EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    public User findById(Long id) {
        User dbuser = entityManager.find(User.class, id);

        return dbuser;
    }
}
