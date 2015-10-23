package estate.service;

import estate.dao.UserDao;
import estate.pojo.User;
import estate.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tangl9 on 2015-10-23.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public User login(String username, String password) {
        Utils.logger.info("login username {} , password {}", username, password);
        return userDao.login(username, password);
    }
}
