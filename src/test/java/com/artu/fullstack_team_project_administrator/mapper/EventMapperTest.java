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

    @Test
    @Order(1)
    void findAllByEventId() {
        System.out.println(eventMapper.findAllByEventId(1));
    }

    @Test
    @Order(5)
    void findById() {
        System.out.println(eventMapper.findById(1));
    }

    @Test
    @Order(2)
    void insert() {
        Event event = new Event();
        event.setEventId(70);
        event.setCtgrId(6);
        event.setTitle("포크 뮤지컬");
        event.setLocation("대전");
        event.setCompany("포크 그룹");
        event.setAddress("대전 중구 대종로 373");
        event.setAgeLimit("12");
        event.setHowLong(120);
        event.setUserId("user1041");



    }

    @Test
    @Order(3)
    void update() {
    }

    @Test
    @Order(4)
    void delete() {
    }
}