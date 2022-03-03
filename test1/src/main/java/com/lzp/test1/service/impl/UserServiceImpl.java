package com.lzp.test1.service.impl;

import com.lzp.test1.mapper.UserMapper;
import com.lzp.test1.pojo.Message;
import com.lzp.test1.pojo.User;
import com.lzp.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;

    @Override
    public Message login(User u) {
        User lou = um.login(u);
         if (lou != null){
             System.out.println("登录成功，将user存入redis");
             return new Message();
         }else {
             return new Message("-101","登录失败");
         }
    }
}
