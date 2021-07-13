package com.jason.dao;

import com.jason.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName UserRepository
 * @Description User Repository
 * @Author Jason Cao
 * @Date 2021/7/13 11:18 AM
 **/
public interface UserRepository extends JpaRepository<User, Long> {
}
