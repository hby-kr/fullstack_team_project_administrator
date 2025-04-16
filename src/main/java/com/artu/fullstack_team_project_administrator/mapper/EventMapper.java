package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Event;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EventMapper {

    List<Event> findUnapprovedEvents();

    List<Event> findApprovedEvents();

    List<Event> findActiveEvents();

    List<Event> findInactiveEvents();

    int updateToInactivateEvents(Event event);

    int updateToActivateEvents(Event event);






}
