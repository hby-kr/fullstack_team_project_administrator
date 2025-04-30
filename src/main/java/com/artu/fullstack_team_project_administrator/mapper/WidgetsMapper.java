package com.artu.fullstack_team_project_administrator.mapper;

import com.artu.fullstack_team_project_administrator.dto.Widgets;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WidgetsMapper {

    List<Widgets> findAllWidgets(@Param("bool") boolean bool);

    int remove(int widgetId);

    int restore(int widgetId);

    int insert(Widgets widgets);

    int update(Widgets widgets);

    List<Widgets> findByDeleted(boolean deleted);

    Widgets readAll(int id);

    int markAsDeleted(int widgetId);
}
