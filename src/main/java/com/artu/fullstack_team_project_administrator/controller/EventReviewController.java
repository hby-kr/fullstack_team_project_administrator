package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.mapper.EventReviewsMapper;
import com.artu.fullstack_team_project_administrator.service.events.EventReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/review")
@AllArgsConstructor
public class EventReviewController {
    private final EventReviewService eventReviewService;

    
}
