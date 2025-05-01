package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.PostingComments;
import com.artu.fullstack_team_project_administrator.service.postingComments.PostingCommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/postingComments")
@RequiredArgsConstructor
public class PostingCommentsController {

    private final PostingCommentsService postingCommentsService;

    // 신고된 댓글 리스트 보기 (is_used = false, is_deleted = false)
    @GetMapping("/reported")
    public String showReportedComments(Model model) {
        List<PostingComments> reported = postingCommentsService.findReportedComments();
        model.addAttribute("comments", reported);
        return "postingComments/reported";
    }

    // 비활성화된 댓글 리스트 보기 (is_used = false, is_deleted = true)
    @GetMapping("/deactivated")
    public String showDeletedComments(Model model) {
        List<PostingComments> deleted = postingCommentsService.findDeletedComments();
        model.addAttribute("comments", deleted);
        return "postingComments/deactivated";
    }

    // 댓글 복원 처리
    @PostMapping("/reactivate")
    public String reactivateComment(@RequestParam("commentId") Integer commentId) {
        postingCommentsService.reactivateComment(commentId);
        return "redirect:/postingComments/reported";
    }

    // 댓글 논리 삭제 처리
    @PostMapping("/deactivate")
    public String deactivateComment(@RequestParam("commentId") Integer commentId,
                                    @RequestParam("deletedReason") String deletedReason) {
        LocalDate deletedAt = LocalDate.now();
        postingCommentsService.deactivateComment(commentId, deletedReason, deletedAt);
        return "redirect:/postingComments/deactivated";
    }
}
