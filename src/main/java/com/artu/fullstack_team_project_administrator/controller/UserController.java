package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.User;
import com.artu.fullstack_team_project_administrator.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/readActiveUsers.do")
    public String readAll(Model model) {
        model.addAttribute("users", userService.findActiveUsers());
        return "user/readActiveUsers";
    }

    @GetMapping("/readInactiveUsers.do")
    public String readNotUsedUser(Model model) {
        model.addAttribute("users", userService.findInactiveUsers());
        return "user/readInactiveUsers";
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

    @PostMapping("/{userId}/inactiveUser.do")
    public String inactiveUser(
            @PathVariable String userId,
            @ModelAttribute("adminName") String adminName,
            @ModelAttribute("memo") String memo
    ) {
        User user = userService.readOne(userId);

        if (!user.getIsUsed()){
            return "redirect:/user/readInactiveUsers.do";
        }
        user.setIsUsed(false);
        user.setMemo(memo + " by." + adminName);
        boolean inactive = userService.modifyIsUsed(user);
        if (inactive == true) {
            return "redirect:/user/readInactiveUsers.do";
        } else {
            return "redirect:/user/{userId}/inactiveUser.do";
        }
    }

    @PostMapping("/{userId}/activateUser.do")
    public String activeUser(
            @PathVariable String userId,
            @ModelAttribute("adminName") String adminName,
            @ModelAttribute("memo") String memo
    ) {
        User user = userService.readOne(userId);
        System.out.println(user);
        if (user.getIsUsed()){
            return "redirect:/user/readInactiveUsers.do";
        }
        user.setIsUsed(true);
        user.setMemo(memo + " :활성화 처리 by." + adminName);
        user.setDropoutAt(null);
        System.out.println(user);
        boolean active = userService.modifyIsUsed(user);

        if (active == true) {
            return "redirect:/user/readActiveUsers.do";
        } else {
            return "redirect:/user/{userId}/detail.do";
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

