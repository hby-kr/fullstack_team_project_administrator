package com.artu.fullstack_team_project_administrator.service.widgets;

import com.artu.fullstack_team_project_administrator.dto.Widgets;

import java.util.List;

public interface widgetService {

    List<Widgets> findAllWidgets();

    Widgets readAll(int id);
    boolean register(Widgets widget);
    boolean modify(Widgets widget);
    boolean remove(int widgetId);
}
