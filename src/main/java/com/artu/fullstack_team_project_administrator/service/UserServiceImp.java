package com.artu.fullstack_team_project_administrator.service;

import com.artu.fullstack_team_project_administrator.dto.User;
import com.artu.fullstack_team_project_administrator.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public List<User> findActiveUsers() {
        return usersMapper.findAllByIsUsed(true);
    }

    @Override
    public List<User> findInactiveUsers() {
        return usersMapper.findAllByIsUsed(false);
    }

    @Override
    public User readOne(String userId) {
        return usersMapper.findById(userId);
    }

    @Override
    public boolean register(User user) {
        return usersMapper.insert(user) > 0;
    }

    @Override
    public boolean modify(User user) {
        return usersMapper.update(user) > 0;
    }

    @Override
    public boolean remove(String userId) {
        return usersMapper.delete(userId) > 0;
    }

    @Override
    public List<User> searchUser(String keyword) {
        String searchTerm = "%" + keyword + "%";  // LIKE 검색을 위한 % 추가
        return usersMapper.findByNameOrEmailOrId(searchTerm);
    }
}


