package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EventReviewsMapper {


    // 공연리뷰 조회
    List<EventReviews> findReviewsById(@Param("Id") String userId);

    int deleteByPrimaryKey(Integer reviewId);

    int insert(EventReviews record);

    int insertSelective(EventReviews record);

    EventReviews selectByPrimaryKey(Integer reviewId);

    int updateByPrimaryKeySelective(EventReviews record);

    int updateByPrimaryKey(EventReviews record);
}