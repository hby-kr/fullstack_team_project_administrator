package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * postings
 */
@Data
public class Postings implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer postId;
    private String userId;
    private String contents;
    private String locationTag;
    private String personTagId;
    private Object visibilityType;
    private LocalDate createdAt;
    private Date editAt;
    private Boolean isUsed;
    private Boolean isDeleted;
    private String deletedReason;
    private LocalDate deletedAt;

}