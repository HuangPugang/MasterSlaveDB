package com.example.mapper;

import com.example.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by paul on 16/11/9.
 */
public interface UserMapper {

    int insert(User user);
    List<User> findAll();


}
