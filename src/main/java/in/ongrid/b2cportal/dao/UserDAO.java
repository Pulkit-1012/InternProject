package in.ongrid.b2cportal.dao;

import in.ongrid.b2cportal.entity.User;

public interface UserDAO {
    void save(User user);
    User findById(Long id);
}
