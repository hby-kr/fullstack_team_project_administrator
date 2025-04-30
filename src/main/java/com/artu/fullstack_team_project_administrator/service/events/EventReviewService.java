package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventReviewService {
    // 활성화된 리뷰만 불러오기
    List<EventReviews> findActiveReviews();
    // 비활성화된 리뷰만 불러오기
    List<EventReviews> findInactiveReviews();

    boolean reactivateReview(Integer reviewId);

    // 공연리뷰 userId로 불러오기
    List<EventReviews> findReviewsById(@Param("userId") String userId);
    // 공연리뷰 reviewId로 불러오기
    EventReviews selectByPrimaryKey(Integer reviewId);

    // 공연리뷰 isUsed = false 로 변경 (논리 삭제), 삭제사유
    boolean deactivateReviewWithReason(Integer reviewId, String deletedReason);

    // 신고된 공연리뷰 불러오기
    List<EventReviews> findReprotedReviews();

    // 공연리뷰 공연ID랑 사용자ID로 불러오기
    List<EventReviews> findByEventIdAndUserId(@Param("eventId") Integer eventId, @Param("userId") String userId);
}
