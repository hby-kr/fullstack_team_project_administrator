package com.artu.fullstack_team_project_administrator.service.events;

import com.artu.fullstack_team_project_administrator.dto.Event;
import com.artu.fullstack_team_project_administrator.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImp implements EventService {

    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> findUnapprovedEvents() {
        return eventMapper.findUnapprovedEvents();
    }

    @Override
    public List<Event> findApprovedEvents() {
        return eventMapper.findApprovedEvents();
    }

    @Override
    public List<Event> findActiveEvents() {
        return eventMapper.findActiveEvents();
    }

    @Override
    public List<Event> findInactiveEvents() {
        return eventMapper.findInactiveEvents();
    }

    @Override
    @Transactional
    public boolean modifyInactivate(Event event) {
        int update = eventMapper.updateToInactivateEvents(event);
        if (update == 1){return true;}
        return false;
    }
    @Override
    @Transactional
    public boolean modifyActivate(Event event) {
        int update = eventMapper.updateToActivateEvents(event);
        if (update == 1){return true;}
        return false;
    }
}
