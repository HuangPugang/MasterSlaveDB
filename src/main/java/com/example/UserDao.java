package com.example;

import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by paul on 16/12/5.
 */
@Repository
public class UserDao {


    @Autowired
    UserMapper masterUserMapper;

    @Autowired
    UserMapper slaveUserMapper;

    public int insert(User user) {
        return masterUserMapper.insert(user);

    }

    public List<User> findAll() {
        return slaveUserMapper.findAll();
    }

    public int insertSlave(User user) {
        return slaveUserMapper.insert(user);

    }
}
