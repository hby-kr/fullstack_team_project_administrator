package com.artu.fullstack_team_project_administrator.service.userInquireReplies;

import com.artu.fullstack_team_project_administrator.dto.UserInquireReplies;
import com.artu.fullstack_team_project_administrator.mapper.UserInquireRepliesMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserInquireRepliesServiceImp implements UserInquireRepliesService {

    private final UserInquireRepliesMapper userInquireRepliesMapper;

    @Override
    public void insertReply(UserInquireReplies reply) {
        userInquireRepliesMapper.insertSelective(reply);
    }

    @Override
    public void updateReply(UserInquireReplies reply) {
        userInquireRepliesMapper.updateByPrimaryKeySelective(reply);
    }

    @Override
    public UserInquireReplies findByInquiryId(Integer inquiryId) {
        return userInquireRepliesMapper.findByInquireId(inquiryId);
    }
}
