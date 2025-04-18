package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * event_reviews
 */
@Data
public class EventReviews implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer reviewId;
    private String userId;
    private Integer eventId;
    private Integer rate;
    private String contents;
    private Boolean isUsed;
    private LocalDate createdAt;
    private Boolean isReported;
    private String reportReason;
    private LocalDate reportedAt;
    private LocalDate deletedAt;
    private String deletedReason;

    public void setDeleted_reason(String s) {
    }
}