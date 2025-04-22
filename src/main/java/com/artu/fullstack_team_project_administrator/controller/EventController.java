package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.Event;
import com.artu.fullstack_team_project_administrator.service.events.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/event")
@AllArgsConstructor
public class EventController {

    private EventService eventService;

    @GetMapping("/readUnapprovedEvents.do")
    public String readUnapprovedEvents(Model model) {
        model.addAttribute("unapprovedEvents", eventService.findUnapprovedEvents());
        return "event/readUnapprovedEvents";
    }

    @GetMapping("/readApprovedEvents.do")
    public String readApprovedEvents(Model model) {
        model.addAttribute("approvedEvents", eventService.findApprovedEvents());
        return "event/ApprovedEvents";
    }

    @GetMapping("/{eventId}/detail3.do")
    public String detail3(
            Model model,
            @PathVariable int eventId
    ) {
        //List<Event> events = eventService.findActiveEvents();
        Event event=eventService.detail(eventId);
        if(event != null) {
            model.addAttribute("event", event);
            return "event/detail3";
        } else {
            return "redirect:/event/readUnapprovedEvents.do";
        }
    }

    @GetMapping("/{eventId}/detail.do")
    public String detail(
            Model model,
            @PathVariable int eventId
    ) {
        //List<Event> events = eventService.findActiveEvents();
        Event event=eventService.detail(eventId);
        if(event != null) {
            model.addAttribute("event", event);
            return "event/detail";
        } else {
            return "redirect:/event/ApprovedEvents.do";
        }
    }

    @GetMapping("/{eventId}/detail2.do")
    public String detail2(
            Model model,
            @PathVariable int eventId
    ) {
        //List<Event> events = eventService.findActiveEvents();
        Event event=eventService.detail(eventId);
        if(event != null) {
            model.addAttribute("event", event);
            return "event/detail2";
        } else {
            return "redirect:/event/UnapprovedEvents.do";
        }
    }

    @GetMapping("/UnapprovedEvents.do")
    public String unapprovedEvents(Model model) {
        model.addAttribute("unapprovedEvents", eventService.findUnapprovedEvents());
        return "event/UnapprovedEvents";
    }

    @PostMapping("/{eventId}/ApprovedEvents.do")
    public String ApprovedEvents(
            @PathVariable int eventId) {
        boolean result=eventService.modifyApproved(eventId,true);
        return "redirect:/event/ApprovedEvents";
    }

    @PostMapping("/{eventId}/UnapprovedEvents.do")
    public String UnapprovedEvents(
            @PathVariable int eventId) {
        boolean result=eventService.modifyUnApproved(eventId,true);
        return "redirect:/event/UnapprovedEvents";
        }
    }
