package com.artu.fullstack_team_project_administrator.controller;

import org.springframework.ui.Model;
import com.artu.fullstack_team_project_administrator.dto.Widgets;
import com.artu.fullstack_team_project_administrator.service.widgets.widgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/widgets")
public class WidgetController {

    private final widgetService widgetService;

    @Autowired
    public WidgetController(widgetService widgetService) {
        this.widgetService = widgetService;
    }

    @GetMapping("/readAll.do")
    public String readAllWidgets(Model model) {
        List<Widgets> widgets = widgetService.findAllWidgets();
        model.addAttribute("widgets", widgets);
        return "widgets/readAll";
    }

    @PostMapping("/register.do")
    public String register(Widgets widgets) {
        widgetService.register(widgets);
        return "redirect:/widgets/readAll.do";
    }

    @PostMapping("/modify.do")
    public String modify(Widgets widgets) {
        widgetService.modify(widgets);
        return "redirect:/widgets/readAll.do";
    }

    @PostMapping("/remove.do")
    public String remove(@RequestParam("id") int id) {
        widgetService.remove(id);
        return "redirect:/widgets/readAll.do";
    }
}









