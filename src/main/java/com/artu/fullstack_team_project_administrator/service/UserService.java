package com.artu.fullstack_team_project_administrator.service;

import com.artu.fullstack_team_project_administrator.dto.User;

import java.util.List;

public interface UserService {

    List<User> findActiveUsers();
    List<User> findInactiveUsers();

    User readOne(String userId);
    boolean register(User user);
    boolean modify(User user);
    boolean remove(String userId);

    List<User> searchUser(String keyword);

}
