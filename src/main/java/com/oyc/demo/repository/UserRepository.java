package com.oyc.demo.repository;

import com.oyc.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @ClassName UserRepository
 * @Description 用户JPA接口类，继承JPA的JpaRepository,利用Spring Data JPA 的JpaRepository实现数据的操作
 * 继承JpaRepository接口 <实体类, 主键类型> JPA根据实体类的类名去对应表名（可以使用@Entity的name属性？@Table进行修改）
 * @Author oyc
 * @Date 2020/12/2 11:26
 * @Version
 */
public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor {
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
}