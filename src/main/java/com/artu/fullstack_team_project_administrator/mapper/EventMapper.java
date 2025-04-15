package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Event;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EventMapper {
    List<Event> findAllByEventId(@Param("id") Integer eventId);

    Event findById(@Param("id") Integer eventId);

    int insert(Event event);

    int update(Event event);

    int delete(@Param("id") Integer eventId);

    int updateToInactivateEvent(Event event);


}
