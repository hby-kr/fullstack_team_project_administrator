package com.artu.fullstack_team_project_administrator.service.userInquires;

import com.artu.fullstack_team_project_administrator.dto.UserInquires;
import com.artu.fullstack_team_project_administrator.mapper.UserInquiresMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserInquiresServiceImp implements UserInquiresService {
    private final UserInquiresMapper userInquiresMapper;

    @Override
    public List<UserInquires> findAll() {
        return userInquiresMapper.findAll();
    }

    @Override
    public List<UserInquires> findByCategory(String inquiryCategory) {
        return userInquiresMapper.findByCategory(inquiryCategory);
    }

    @Override
    public List<UserInquires> findByState(String inquiryState) {
        return userInquiresMapper.findByState(inquiryState);
    }

    @Override
    public UserInquires findById(Integer inquireId) {
        return userInquiresMapper.findByInquireId(inquireId);
    }

    @Override
    public List<UserInquires> findByUserId(String userId) {
        return userInquiresMapper.findByUserId(userId);
    }

    @Override
    public List<UserInquires> findWithFilters(String userId, String category, String state) {
        return userInquiresMapper.findWithFilters(userId, category, state);
    }

    @Override
    public void updateState(Integer inquireId, String inquiryState) {
        userInquiresMapper.updateState(inquireId, inquiryState);
    }

    @Override
    public void deactivateInquire(Integer inquireId) {
        userInquiresMapper.deactivateInquire(inquireId);
    }
}
