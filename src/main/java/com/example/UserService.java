package com.example;

import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/11/11.
 */
@Service
public class UserService {


    @Autowired
    UserDao userDao;


    public int insert(User user) {
        return userDao.insert(user);

    }

    public int insertSlave(User user) {
        return userDao.insertSlave(user);

    }

    public List<User> findAll() {
        return userDao.findAll();
    }


}
