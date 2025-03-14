package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserloginLogs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserloginLogsMapper {


    // 로그인 기록 조회
    List<UserloginLogs> findLoginHistoryById(@Param("Id") String userId);


    int deleteByPrimaryKey(Integer logId);

    int insert(UserloginLogs record);

    int insertSelective(UserloginLogs record);

    UserloginLogs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(UserloginLogs record);

    int updateByPrimaryKey(UserloginLogs record);
}