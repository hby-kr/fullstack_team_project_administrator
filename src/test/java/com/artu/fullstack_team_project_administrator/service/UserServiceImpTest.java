package com.artu.fullstack_team_project_administrator.service;

import com.artu.fullstack_team_project_administrator.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class UserServiceImpTest {

    @Autowired
    UserService userService;

    @Test
    void modifyIsUsed() {
        User user = userService.readOne("user1001");
        System.out.println(user);
        user.setIsUsed(false);
        user.setDropoutAt(LocalDate.now());
        user.setMemo("내 마음입니다 :p ");
        System.out.println(user);

        userService.modifyIsUsed(user);
    }
}