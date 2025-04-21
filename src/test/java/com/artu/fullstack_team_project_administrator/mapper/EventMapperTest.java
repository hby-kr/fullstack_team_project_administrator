package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Event;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EventMapperTest {

    @Autowired
    EventMapper eventMapper;

    @Order(1)
    @Test
    void findUnapprovedEvents() {
        System.out.println(eventMapper.findUnapprovedEvents());
    }

    @Order(2)
    @Test
    void findApprovedEvents() {
        System.out.println(eventMapper.findApprovedEvents());
    }

    @Order(3)
    @Test
    void findActiveEvents() {
        System.out.println(eventMapper.findActiveEvents());
    }

    @Order(4)
    @Test
    void findInactiveEvents() {
        System.out.println(eventMapper.findInactiveEvents());
    }

    @Order(5)
    @Test
    void updateApprovedEvents() {
        Event event = new Event();
        event.setEventId(1);
        event.setCtgrId(1);
        event.setTitle("음악 콘서트");
        event.setLocation("서울");
        event.setCompany("음악사");
        event.setAddress("서울 강남구 테헤란로 123");
        event.setAgeLimit("12");
        event.setHowLong(120);
        event.setUserId("user1001");
    }

    @Order(6)
    @Test
    void updateUnapprovedEvents() {
        Event event = new Event();
        event.setEventId(1);
        event.setCtgrId(1);
        event.setTitle("음악 콘서트");
        event.setLocation("서울");
        event.setCompany("음악사");
        event.setAddress("서울 강남구 테헤란로 123");
        event.setAgeLimit("12");
        event.setHowLong(120);
        event.setUserId("user1001");
    }

    @Test
    void findEventById() {
        System.out.println(eventMapper.findEventById(1));
    }
}