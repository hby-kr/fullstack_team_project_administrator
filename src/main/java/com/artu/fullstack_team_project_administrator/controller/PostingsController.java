package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import com.artu.fullstack_team_project_administrator.service.postings.PostingsService;
import lombok.AllArgsConstructor;
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

    // 활성화된 게시글 조회 (사용 중)
    @GetMapping("/active")
    public String showActivePosts(Model model) {
        model.addAttribute("posts", postingsService.findActivePosts());
        return "posting/active"; // ← 필요 시 뷰 생성
    }

    // 신고된 게시글 조회 (조치 대기 중)
    @GetMapping("/reported")
    public String showReportedPosts(Model model) {
        model.addAttribute("posts", postingsService.findReportedPosts());
        return "posting/reported";
    }

    // 비활성화된 게시글 조회 (조치 완료)
    @GetMapping("/deactivated")
    public String showDeactivatedPosts(Model model) {
        model.addAttribute("posts", postingsService.findDeactivatedPosts());
        return "posting/deactivated";
    }

    // 게시글 비활성화 처리
    @PostMapping("/deactivate")
    public String deactivatePost(@RequestParam("postId") Integer postId,
                                 @RequestParam("deletedReason") String deletedReason) {
        postingsService.deactivatePost(postId, deletedReason);
        return "redirect:/posting/deactivated";
    }

    // 잘못된 신고 → 게시글 복구 처리
    @PostMapping("/reactivate")
    public String reactivatePost(@RequestParam("postId") Integer postId) {
        postingsService.reactivatePost(postId);
        return "redirect:/posting/reported";
    }
}