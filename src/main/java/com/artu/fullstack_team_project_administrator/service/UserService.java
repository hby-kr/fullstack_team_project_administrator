package com.artu.fullstack_team_project_administrator.service;

import com.artu.fullstack_team_project_administrator.dto.User;
import com.artu.fullstack_team_project_administrator.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

}


