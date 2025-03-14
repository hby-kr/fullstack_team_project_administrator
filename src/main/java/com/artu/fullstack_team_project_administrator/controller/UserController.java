package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping ("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/realAll.do")
    public String realAll(Model model) {
        model.addAllAttributes("user", userService.)



        return "user/realAll";
    }

}

