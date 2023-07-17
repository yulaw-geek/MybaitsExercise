package com.example.jpamybaits.userservice;

import com.example.jpamybaits.usermapper.UserMapper;
import org.springframework.stereotype.Service;
import com.example.jpamybaits.user.User;
@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public int addUserByMaits(User user){
        return userMapper.insert(user);
    }

    public User findUserByMybaits(Long id){
        return userMapper.findById(id);
    }

    public int deleteUserBYMybaits(Long id){
        return userMapper.deleteById(id);
    }


}
