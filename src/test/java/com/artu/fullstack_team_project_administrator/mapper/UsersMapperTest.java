package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class UsersMapperTest {

    @Autowired
    UsersMapper usersMapper;

    @Order(1)
    @Test
    void findAll() {
        System.out.println(usersMapper.findAll());
    }

    @Order(4)
    @Test
    void findById() {
        System.out.println(usersMapper.findById("user1"));
    }

    @Order(2)
    @Test
    void insert() {
        User user = new User();
        user.setUserId("user334");
        user.setUserEmail("user334@gmail.com");
        user.setPassword("1234");
        user.setUserName("user1");
        user.setUserBirth(LocalDate.parse("2000-01-01"));
        user.setGender(User.Gender.F);
        System.out.println(usersMapper.insert(user));
    }

    @Order(3)
    @Test
    void update() {
        User user = new User();
        user.setUserId("user333");
        user.setUserEmail("user333@updateupdate.com");
        user.setPassword("1234");
        user.setUserName("updateuser");
        user.setUserBirth(LocalDate.parse("2000-01-01"));
        user.setGender(User.Gender.F);
        user.setIsUsed(Boolean.TRUE);
    }

    @Order(5)
    @Test
    void delete() {
        System.out.println(usersMapper.delete("user334"));
    }
}