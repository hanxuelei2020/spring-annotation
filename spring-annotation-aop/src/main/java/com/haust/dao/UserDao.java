package com.haust.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.haust.bean.User;

public interface UserDao extends JpaRepository<User, Integer>,JpaSpecificationExecutor<User>{

}
