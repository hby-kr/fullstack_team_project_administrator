package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserPoints;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPointsMapper {


    // 포인트 사용 내역 조회
    List<UserPoints> findPointHistoryById(@Param("Id") String userId);



    int deleteByPrimaryKey(Integer pointId);

    int insert(UserPoints record);

    int insertSelective(UserPoints record);

    UserPoints selectByPrimaryKey(Integer pointId);

    int updateByPrimaryKeySelective(UserPoints record);

    int updateByPrimaryKey(UserPoints record);
}