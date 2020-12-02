package com.oyc.demo.service.impl;

import com.oyc.demo.domain.User;
import com.oyc.demo.repository.UserRepository;
import com.oyc.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author oyc
 * @Date 2020/12/2 12:24 上午
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User findById(Integer uId) {
        return userRepository.getOne(uId);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    @Override
    public User findByAccount(String account) {
        return userRepository.findByAccount(account);
    }

    @Override
    public void deleteById(Integer uId) {
        userRepository.deleteById(uId);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

}
