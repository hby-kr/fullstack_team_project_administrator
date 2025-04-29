package com.artu.fullstack_team_project_administrator.service.widgets;

import com.artu.fullstack_team_project_administrator.dto.Widgets;
import com.artu.fullstack_team_project_administrator.mapper.WidgetsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class widgetServiceImp implements widgetService {

    private final WidgetsMapper widgetsMapper;

    @Autowired
    public widgetServiceImp(WidgetsMapper widgetsMapper) {
        this.widgetsMapper = widgetsMapper;
    }

    @Override
    public List<Widgets> findAllWidgets() {
        return widgetsMapper.findAllWidgets(Boolean.TRUE);
    }

    @Override
    public Widgets readAll(int id) {
        return widgetsMapper.readAll(id);
    }

    @Override
    public boolean register(Widgets widget) {
        return widgetsMapper.insert(widget) > 0 ;
    }

    @Override
    public boolean modify(Widgets widget) {
        return widgetsMapper.update(widget) > 0;
    }

    @Override
    public boolean remove(int widgetId) {
        return widgetsMapper.delete(widgetId) > 0;
    }
}
