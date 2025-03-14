package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserInquires;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInquiresMapper {

    // 회원 문의 검색
    List<UserInquires> searchInquiries(@Param("Id") String userId);


    int deleteByPrimaryKey(Integer inquireId);

    int insert(UserInquires record);

    int insertSelective(UserInquires record);

    UserInquires selectByPrimaryKey(Integer inquireId);

    int updateByPrimaryKeySelective(UserInquires record);

    int updateByPrimaryKey(UserInquires record);
}