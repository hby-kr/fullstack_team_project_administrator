package com.artu.fullstack_team_project_administrator.controller;

import com.artu.fullstack_team_project_administrator.dto.Event;
import com.artu.fullstack_team_project_administrator.service.events.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "event/readApprovedEvents";
    }

    @GetMapping("/{eventId}/detail.do")
    public String detail(
            Model model,
            @PathVariable long eventId
    ) {
        List<Event> events = eventService.findActiveEvents();
        if(events != null) {
            model.addAttribute("unapprovedEvents", events);
            return "event/readUnapprovedEvents";
        } else {
            return "redirect:/event/readUnapprovedEvents.do";
        }
    }

    @PostMapping("/{eventId}/ActiveEvent.do")
    public String activeEvent(
            @PathVariable String eventId,
            @ModelAttribute("adminName") String adminName,
            @ModelAttribute("memo") String memo
    ) {
        Event event =eventService.findActiveEvents().get(2);

        if(event.getIsUsed()) {
            return "redirect:/event/readApprovedEvents.do";
        }
        event.setIsUsed(true);
        event.setMemo(memo + " 활성화 by. " + adminName);
        boolean active = true;
        if(active == true) {
            return "redirect:/event/readApprovedEvents.do";
        } else {
            return "redirect:/event/readUnapprovedEvents.do";
        }
    }

    @PostMapping("/{eventId}/InactiveEvent.do")
    public String inactiveEvent(
            @PathVariable String eventId,
            @ModelAttribute("adminName") String adminName,
            @ModelAttribute("memo") String memo
    ) {
        Event event =eventService.findInactiveEvents().get(2);
        System.out.println(event);
        if (event.getIsUsed()) {
            return "redirect:/event/readUnapprovedEvents.do";
        }
        event.setIsUsed(false);
        event.setMemo(memo + " by. " + adminName);
        boolean active = false;
        if(active == false) {
            return "redirect:/event/readUnapprovedEvents.do";
        } else {
            return "redirect:/event/readApprovedEvents.do";
        }
    }
}
