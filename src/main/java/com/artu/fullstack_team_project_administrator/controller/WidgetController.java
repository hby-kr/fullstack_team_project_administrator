package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.service.widgets.widgetService;
import com.artu.fullstack_team_project_administrator.service.widgets.widgetServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/widgets")
@AllArgsConstructor
public class WidgetController {

    private widgetServiceImp widgetService;
}
