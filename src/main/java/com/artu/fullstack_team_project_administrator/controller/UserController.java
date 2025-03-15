package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.User;
import com.artu.fullstack_team_project_administrator.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/readAll.do")
    public String readAll(Model model) {
        model.addAttribute("users", userService.readAll());
        return "user/readAll";
    }

    @GetMapping("/{userId}/detail.do")
    public String detail(
            Model model,
            @PathVariable String userId
    ) {
        User user = userService.readOne(userId);
        if (user != null) {
            model.addAttribute("user", user);
            return "user/detail"; // 실제파일경로 = 뷰 이름 ( == user/detail.html)
        } else {
            return "redirect:/user/readAll.do"; // 추상매핑경로로 가라라고 지시하는 것
        }
    }

    @GetMapping("search.do")
    public String searchUser(
            @RequestParam("search") String keyword,
            Model model
    ) {
        List<User> userList = userService.searchUser(keyword);
        model.addAttribute("userList", userList);
        return "user/searchResults";  // 결과를 표시할 뷰 페이지 (예: searchResults.html)

    }
}

