package com.artu.fullstack_team_project_administrator.service.userInquireReplies;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;

public interface UserInquireRepliesService {
    // 답글 작성
    void insertReply(UserInquireReplies reply);
    // 답글 수정
    void updateReply(UserInquireReplies reply);
    // 답글 조회
    UserInquireReplies findByInquiryId(Integer inquiryId);
}
