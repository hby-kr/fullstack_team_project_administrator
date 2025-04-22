package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventReviewsMapper {

    // 활성화된 공연리뷰 조회
    List<EventReviews> findAllByIsUsed(@Param("bool") boolean bool);

    // 공연리뷰 userId로 조회
    List<EventReviews> findReviewsById(@Param("userId") String userId);
    // 공연리뷰 삭제 (논리 삭제 : is_used false 로 변경)
    int delete(@Param("reviewId")Integer reviewId);
    // 공연리뷰 reviewId로 조회
    EventReviews selectByPrimaryKey(Integer reviewId);

    // 공연리뷰 isUsed 수정용으로 updateByPrimaryKeySelective 사용
    int updateByPrimaryKeySelective(EventReviews record);

    // 공연리뷰 삽입 (공연리뷰 삭제를 위해 / 실제 사용 X)
    int insert(EventReviews record);

    //신고된 리뷰만 가져오기
    List<EventReviews> findReportedReviews();

    // 공연리뷰 공연ID랑 사용자ID로 조회
    List<EventReviews> findByEventIdAndUserId(@Param("eventId") Integer eventId, @Param("userId") String userId);
}