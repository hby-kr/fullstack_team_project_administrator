package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EventReviewServiceImpTest {

    @Autowired
    private EventReviewService eventReviewService;

    @Test
    void deactivateReview() {
        EventReviews eventReviews = eventReviewService.selectByPrimaryKey(1);
        System.out.println(eventReviews);
        eventReviews.setIsUsed(false);
        eventReviews.setDeletedAt(LocalDate.now());
        eventReviews.setDeleted_reason("비속어를 사용했습니다.");
        System.out.println(eventReviews);

        eventReviewService.deactivateReview(eventReviews.getReviewId());
    }
}