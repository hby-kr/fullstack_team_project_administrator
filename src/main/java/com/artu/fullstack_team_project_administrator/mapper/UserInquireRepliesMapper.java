package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserInquireRepliesMapper {

    // 회원 문의 답변 관리
    int respondToInquiry(@Param("inquiryId") Integer inquiryId,
                         @Param("replyContents") String replyContents);

    int insert(UserInquireReplies record);
    int insertSelective(UserInquireReplies record);
    int updateByPrimaryKey(UserInquireReplies record);
    int updateByPrimaryKeySelective(UserInquireReplies record);
    int deleteByPrimaryKey(Integer replyId);
    UserInquireReplies selectByPrimaryKey(Integer replyId);

    UserInquireReplies findByInquireId(@Param("inquireId") Integer inquireId);

}