package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import com.artu.fullstack_team_project_administrator.service.postings.PostingsService;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/posting")
@AllArgsConstructor
public class PostingsController {

    private final PostingsService postingsService;

    @GetMapping("/deactivate")
    public String showDeactivatedPosts(Model model) {
        List<Postings> posts = postingsService.getDeactivatedPosts();
        model.addAttribute("posts", posts);
        return "posting/deactivated_postings";
    }

    @PostMapping("/activate")
    public String activatePostings(@RequestParam("postId") Integer postId){
        postingsService.activatePostings(postId);
        return "redirect:/posting/deactivate";
    }
}
