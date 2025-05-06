package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * user_inquire_replies
 */
@Data
public class UserInquireReplies implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer replyId;

    private Integer inquireId;

    private String replyContents;

    private LocalDateTime repliedAt;

    private String counselorId;

    private Boolean isUsed;

}