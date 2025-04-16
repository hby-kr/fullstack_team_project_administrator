package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.EventReviews;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

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
        System.out.println(eventReviewsMapper.delete(1000));
    }

    @Test
    void insert() {
        EventReviews eventReviews = new EventReviews();
        eventReviews.setReviewId(1000);
        eventReviews.setUserId("user2001");
        eventReviews.setEventId(1);
        eventReviews.setRate(4);
        eventReviews.setContents("재미있는 공연이네요!");
        eventReviews.setIsUsed(true);
        eventReviews.setCreatedAt(LocalDate.parse("2025-03-01"));
        System.out.println(eventReviewsMapper.insert(eventReviews));
    }
}