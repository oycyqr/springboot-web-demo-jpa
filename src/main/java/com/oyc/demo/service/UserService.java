package com.oyc.demo.service;

import com.oyc.demo.domain.User;

import java.util.List;

/**
 * @Description: 用户服务类接口
 * @Author oyc
 * @Date 2020/12/2 12:24 上午
 */
public interface UserService {
    /**
     * 根据id获取用户
     *
     * @return
     */
    User findById(Integer uId);

    /**
     * 用户列表
     *
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户名称查询用户
     *
     * @param name 用户名称
     * @return
     */
    List<User> findByName(String name);

    /**
     * 根据用户账号查询用户
     *
     * @param account 用户账号
     * @return
     */
    User findByAccount(String account);


    /**
     * 删除用户
     *
     * @param uId
     */
    void deleteById(Integer uId);

    /**
     * 删除用户
     *
     * @param user
     */
    void delete(User user);
}
