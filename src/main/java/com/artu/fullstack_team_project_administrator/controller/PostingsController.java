package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.Postings;
import com.artu.fullstack_team_project_administrator.service.postingComments.PostingCommentsService;
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
    private final PostingCommentsService postingCommentsService;

    // 활성화된 포스팅 조회
//    @GetMapping("/active")
//    public String showActivePosts(Model model) {
//        model.addAttribute("posts", postingsService.findActivePosts());
//        return "posting/active";
//    }

    // 신고된 포스팅 조회
    @GetMapping("/reported")
    public String showReportedPosts(Model model) {
        model.addAttribute("posts", postingsService.findReportedPosts());
        return "posting/reported";
    }

    // 비활성화된 포스팅 조회
    @GetMapping("/deactivated")
    public String showDeactivatedPosts(Model model) {
        model.addAttribute("posts", postingsService.findDeactivatedPosts());
        return "posting/deactivated";
    }

    // 포스팅 비활성화 처리
    @PostMapping("/deactivate")
    public String deactivatePost(@RequestParam("postId") Integer postId,
                                 @RequestParam("deletedReason") String deletedReason) {
        LocalDate now = LocalDate.now();
        postingsService.deactivatePost(postId, deletedReason, LocalDate.now());
        // 댓글도 비활성화
        postingCommentsService.deactivateCommentsByPostId(postId, deletedReason, now);
        return "redirect:/posting/deactivated";
    }

    // 잘못된 신고로 포스팅 복원 처리
    @PostMapping("/reactivate")
    public String reactivatePost(@RequestParam("postId") Integer postId) {
        postingsService.reactivatePost(postId);
        //댓글도 복원
        postingCommentsService.restoreCommentsByPostId(postId);
        return "redirect:/posting/reported";
    }
}