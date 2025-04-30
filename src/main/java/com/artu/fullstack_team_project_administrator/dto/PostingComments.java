package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * posting_comments
 */
@Data
public class PostingComments implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer commentId;
    private String userId;
    private Integer postId;
    private String contents;
    private LocalDate createdAt;
    private Boolean isUsed;
    private Boolean isDeleted;
    private String deletedReason;
    private LocalDate deletedAt;

}