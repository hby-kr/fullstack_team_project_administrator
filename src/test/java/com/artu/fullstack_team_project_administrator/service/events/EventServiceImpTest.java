package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.Event;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class EventServiceImpTest {

    @Autowired
    private EventService eventService;

    @Test
    void modifyUnapproved() {
        Event event = new Event();
        event.setEventId(1);
        event.setIsApproved(false);
        event.setMemo("주최사 없음");
        boolean result = eventService.modifyApproved(1,false);
        System.out.println("Unapproved result =" + result);
    }

    @Test
    void modifyApproved() {
        Event event = new Event();
        event.setEventId(1);
        event.setIsApproved(true);
        event.setMemo("주최사 찾음");
        boolean result = eventService.modifyApproved(1,true);
        System.out.println("Approved result =" + result);
    }

    @Test
    void findActiveEvents() {
        System.out.println(eventService.findActiveEvents());
    }

    @Test
    void findInactiveEvents() {
        System.out.println(eventService.findInactiveEvents());
    }

    @Test
    void detail() {
        System.out.println(eventService.detail(1));
    }
}