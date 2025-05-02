package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * user_inquires
 */
@Data
public class UserInquires implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer inquireId;
    private String userId;
    private Object inquireCategory;
    private Integer paymentId;
    private String title;
    private String contents;
    private String inquiryImgUrl;
    private Date createdAt;
    private Object inquiryState;
    private Date stateUpdatedAt;
    private Boolean isUsed;


}