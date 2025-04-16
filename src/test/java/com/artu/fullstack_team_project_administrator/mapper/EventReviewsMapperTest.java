package com.artu.fullstack_team_project_administrator.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EventReviewsMapperTest {
    @Autowired
    EventReviewsMapper eventReviewsMapper;

    @Test
    void findAllByIsUsed() {
        System.out.println(eventReviewsMapper.findAllByIsUsed(true));
    }

    @Test
    void findReviewsById() {
        System.out.println(eventReviewsMapper.findReviewsById("user1001"));
    }

    @Test
    void deleteByPrimaryKey() {
    }

    @Test
    void selectByPrimaryKey() {
    }

    @Test
    void updateByPrimaryKeySelective() {
    }

    @Test
    void activateByPrimaryKey() {
    }

    @Test
    void deactivateByIds() {
    }
}