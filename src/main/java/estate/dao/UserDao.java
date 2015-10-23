package estate.dao;

import estate.pojo.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by tangl9 on 2015-10-23.
 */
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public User login(String username, String password) {
        return (User) sessionFactory.getCurrentSession().createQuery(String.format("from User where username='%s' and password='%s'", username, password)).uniqueResult();
    }
}
