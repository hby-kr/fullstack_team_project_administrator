package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;
import org.apache.ibatis.annotations.Param;

public interface UserInquireRepliesMapper {


    // 회원 문의 답변 관리
    int respondToInquiry(@Param("inquiryId") String inquiryId, @Param("response") String response);


    int deleteByPrimaryKey(Integer replyId);

    int insert(UserInquireReplies record);

    int insertSelective(UserInquireReplies record);

    UserInquireReplies selectByPrimaryKey(Integer replyId);

    int updateByPrimaryKeySelective(UserInquireReplies record);

    int updateByPrimaryKey(UserInquireReplies record);
}