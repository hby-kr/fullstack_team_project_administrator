package com.artu.fullstack_team_project_administrator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import com.artu.fullstack_team_project_administrator.dto.Widgets;
import com.artu.fullstack_team_project_administrator.service.widgets.widgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        List<Widgets> activeWidgets = widgetService.findByDeleted(false);
        List<Widgets> deletedWidgets = widgetService.findByDeleted(true);
        System.out.println(activeWidgets);
        System.out.println(deletedWidgets);
        model.addAttribute("activeWidgets", activeWidgets);
        model.addAttribute("deletedWidgets", deletedWidgets);
        return "widgets/readAll";
    }

    @PostMapping("/register.do")
    public String register(Widgets widgets) {
        widgetService.save(widgets);
        return "redirect:/widgets/readAll.do";
    }

    @PostMapping("/modify.do")
    public String modify(Widgets widgets) {
        widgetService.modify(widgets);
        return "redirect:/widgets/readAll.do";
    }

    @PostMapping("/remove.do")
    @ResponseBody
    public ResponseEntity<Void> removeWidget(@RequestParam int widgetId) {
        try {
            widgetService.remove(widgetId);
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().build();
    }


    @PostMapping("/restore.do")
    @ResponseBody
    public ResponseEntity<Void> restoreWidget(@RequestParam int widgetId) {
        try {
            widgetService.restore(widgetId);
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().build();
    }
}









