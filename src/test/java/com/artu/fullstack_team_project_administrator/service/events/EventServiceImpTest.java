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
    void modifyInactivate() {
        Event event = new Event();
        event.setEventId(1);
        event.setIsUsed(false);
        event.setMemo("주최사 없음");
        boolean result = eventService.modifyInactivate(event);
        System.out.println("Inactive result =" + result);
    }

    @Test
    void modifyActivate() {
        Event event = new Event();
        event.setEventId(1);
        event.setIsUsed(true);
        event.setMemo("주최사 찾음");
        boolean result = eventService.modifyActivate(event);
        System.out.println("Active result =" + result);
    }

    @Test
    void findActiveEvents() {
        System.out.println(eventService.findActiveEvents());
    }

    @Test
    void findInactiveEvents() {
        System.out.println(eventService.findInactiveEvents());
    }
}