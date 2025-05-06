package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;
import com.artu.fullstack_team_project_administrator.service.userInquireReplies.UserInquireRepliesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/inquireReplies")
@RequiredArgsConstructor
public class UserInquireRepliesController {

    private final UserInquireRepliesService userInquireRepliesService;

    // ✅ 답글 등록
    @PostMapping("/write")
    public String writeReply(@ModelAttribute UserInquireReplies reply) {
        reply.setRepliedAt(LocalDateTime.now());
        reply.setIsUsed(true); // 등록 시 기본 true
        userInquireRepliesService.insertReply(reply);
        return "redirect:/inquires/" + reply.getInquireId();
    }

    // ✅ 답글 수정 (선택)
    @PostMapping("/update")
    public String updateReply(@ModelAttribute UserInquireReplies reply) {
        reply.setRepliedAt(LocalDateTime.now()); // 수정 시간 갱신
        userInquireRepliesService.updateReply(reply);
        return "redirect:/inquires/" + reply.getInquireId();
    }
}

