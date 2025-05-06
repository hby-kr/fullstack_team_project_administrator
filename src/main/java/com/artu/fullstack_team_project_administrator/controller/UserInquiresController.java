package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;
import com.artu.fullstack_team_project_administrator.dto.UserInquires;
import com.artu.fullstack_team_project_administrator.service.userInquireReplies.UserInquireRepliesService;
import com.artu.fullstack_team_project_administrator.service.userInquires.UserInquiresService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/inquires")
@RequiredArgsConstructor
public class UserInquiresController {

    private final UserInquiresService userInquiresService;
    private final UserInquireRepliesService userInquireRepliesService;

    @GetMapping("/list")
    public String getAllInquires(@RequestParam(required = false) String userId,
                                 @RequestParam(required = false) String category,
                                 @RequestParam(required = false) String state,
                                 Model model) {
        List<UserInquires> inquires;

        if (userId != null && !userId.isBlank()) {
            inquires = userInquiresService.findByUserId(userId);
        } else if (category != null && !category.isBlank()) {
            inquires = userInquiresService.findByCategory(category);
        } else if (state != null && !state.isBlank()) {
            inquires = userInquiresService.findByState(state);
        } else {
            inquires = userInquiresService.findAll();
        }

        model.addAttribute("inquires", inquires);
        return "userInquires/list";
    }
    @GetMapping("/category")
    public String getByCategory(@RequestParam("category") String category, Model model) {
        List<UserInquires> inquires = userInquiresService.findByCategory(category);
        model.addAttribute("inquires", inquires);
        return "userInquires/list";
    }
    @GetMapping("/state")
    public String getByState(@RequestParam("state") String state, Model model) {
        List<UserInquires> inquires = userInquiresService.findByState(state);
        model.addAttribute("inquires", inquires);
        return "userInquires/list";
    }
    @GetMapping("/{inquireId}")
    public String getDetail(@PathVariable("inquireId") Integer inquireId, Model model) {
        UserInquires Inquires = userInquiresService.findById(inquireId);
        UserInquireReplies reply = userInquireRepliesService.findByInquiryId(inquireId);

        model.addAttribute("inquire", Inquires);
        model.addAttribute("reply", reply);
        return "userInquires/detail";
    }
    @PostMapping("/updateState")
    public String updateState(@RequestParam("inquireId") Integer inquireId,
                              @RequestParam("state") String state) {
        userInquiresService.updateState(inquireId, state);
        return "redirect:/userInquires/list"+ inquireId;
    }
    @PostMapping("/deactivate")
    public String deactivateInquire(@RequestParam("inquireId") Integer inquireId) {
        userInquiresService.deactivateInquire(inquireId);
        return "redirect:/userInquires/list";
    }
}
