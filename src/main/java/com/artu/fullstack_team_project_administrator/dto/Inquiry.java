package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * inquiry
 */
@Data
public class Inquiry implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer inquiryId;

    private String userId;

    private String category;

    private String title;

    private String content;

    private String status;

    private Date createdAt;

    private Date answeredAt;

    private String adminReply;

}