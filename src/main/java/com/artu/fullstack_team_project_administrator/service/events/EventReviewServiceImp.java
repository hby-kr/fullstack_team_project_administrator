package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import com.artu.fullstack_team_project_administrator.mapper.EventReviewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
@Service
public class EventReviewServiceImp implements EventReviewService {
    @Autowired
    private EventReviewsMapper eventReviewsMapper;

    @Override
    public List<EventReviews> findActiveReviews() {
        return eventReviewsMapper.findAllByIsUsed(true);
    }

    @Override
    public List<EventReviews> findInactiveReviews() {
        return eventReviewsMapper.findInactiveReviews(true);
    }

    @Override
    public List<EventReviews> findReviewsById(String userId) {
        return eventReviewsMapper.findReviewsById(userId);
    }

    @Override
    public EventReviews selectByPrimaryKey(Integer reviewId) {
        return eventReviewsMapper.selectByPrimaryKey(reviewId);
    }

    @Override
    public boolean deactivateReviewWithReason(Integer reviewId,String deletedReason) {
        EventReviews eventReviews = new EventReviews();
        eventReviews.setReviewId(reviewId);
        eventReviews.setIsUsed(false);
        eventReviews.setIsDeleted(true);
        eventReviews.setDeletedReason(deletedReason);
        eventReviews.setDeletedAt(LocalDate.now());
        return eventReviewsMapper.updateByPrimaryKeySelective(eventReviews) > 0;
    }

    @Override
    public List<EventReviews> findReprotedReviews() {
        return eventReviewsMapper.findReportedReviews();
    }

    @Override
    public List<EventReviews> findByEventIdAndUserId(Integer eventId, String userId) {
        return eventReviewsMapper.findByEventIdAndUserId(eventId, userId);
    }

    @Override
    public boolean reactivateReview(Integer reviewId) {
        EventReviews eventReviews = new EventReviews();
        eventReviews.setReviewId(reviewId);
        eventReviews.setIsUsed(true);
        eventReviews.setIsDeleted(false);
        return eventReviewsMapper.updateByPrimaryKeySelective(eventReviews) > 0;
    }

}
