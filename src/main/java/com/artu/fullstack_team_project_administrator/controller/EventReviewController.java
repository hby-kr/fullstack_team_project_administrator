package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import com.artu.fullstack_team_project_administrator.mapper.EventReviewsMapper;
import com.artu.fullstack_team_project_administrator.service.events.EventReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/review")
@AllArgsConstructor
public class EventReviewController {
    private final EventReviewService eventReviewService;
    @GetMapping("/findActiveReviews.do")
    public String findAllEventReviews(Model model) {
        model.addAttribute("reviews", eventReviewService.findActiveReviews());
        return "review/findActiveReviews";
    }
    @GetMapping("/filter")
    public String filterReviews(@RequestParam(required = false) Integer eventId,
                                @RequestParam(required = false) String userId,
                                Model model) {
        List<EventReviews> filterReviews = eventReviewService.findByEventIdAndUserId(eventId, userId);
        model.addAttribute("reviews", filterReviews);
        return "review/findActiveReviews";
    }
    @GetMapping("/reported")
    public String findReportedReview(Model model) {
        model.addAttribute("reportedReviews", eventReviewService.findReprotedReviews());
        return "review/reported_reviews";
    }
    @GetMapping("/deactivate")
    public String deactivateReviews(Model model) {
        model.addAttribute("reviews", eventReviewService.findInactiveReviews());
        return "review/deactivated_reviews";
    }

    @PostMapping("/deactivate")
    public String deactivateReview(@RequestParam("reviewId") Integer reviewId,
                                   @RequestParam("deletedReason") String deletedReason){
        eventReviewService.deactivateReviewWithReason(reviewId, deletedReason);
        return "redirect:/review/deactivate";
    }
}
