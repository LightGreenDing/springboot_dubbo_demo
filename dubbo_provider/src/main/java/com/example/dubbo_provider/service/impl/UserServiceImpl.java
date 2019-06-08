package com.example.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.service.UserService;
import com.example.dubbo_provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service //dubbo提供的
@Component //注册为spring bean
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public String sayHello(String name) {
        return "Hello:" + name + System.currentTimeMillis();
    }
}
