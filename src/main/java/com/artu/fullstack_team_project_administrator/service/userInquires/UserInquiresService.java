package com.artu.fullstack_team_project_administrator.service.userInquires;

import com.artu.fullstack_team_project_administrator.dto.UserInquires;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInquiresService {

    List<UserInquires> findAll();

    List<UserInquires> findByCategory(String inquiryCategory);

    List<UserInquires> findByState(String inquiryState);

    UserInquires findById(Integer inquireId);

    List<UserInquires> findByUserId(String userId);

    void updateState(Integer inquireId, String inquiryState);

    void deactivateInquire(Integer inquireId);
}
