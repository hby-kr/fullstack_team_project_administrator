package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * user_inquires
 */
@Data
public class UserInquires implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer inquireId;
    private String userId;
    private InquireCategory inquireCategory;
    private Integer paymentId;
    private String title;
    private String contents;
    private String inquiryImgUrl;
    private LocalDateTime createdAt;
    private InquiryState inquiryState;
    private LocalDateTime stateUpdatedAt;
    private Boolean isUsed;

    public enum InquireCategory {
        계정, 결제, 데이터등록, 기타
    }

    public enum InquiryState {
        Pending, Completed
    }
}