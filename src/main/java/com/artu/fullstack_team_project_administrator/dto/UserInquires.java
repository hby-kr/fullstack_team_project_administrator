package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * user_inquires
 */
public class UserInquires implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Integer getInquireId() {
        return inquireId;
    }

    public void setInquireId(Integer inquireId) {
        this.inquireId = inquireId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Object getInquireCategory() {
        return inquireCategory;
    }

    public void setInquireCategory(Object inquireCategory) {
        this.inquireCategory = inquireCategory;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getInquiryImgUrl() {
        return inquiryImgUrl;
    }

    public void setInquiryImgUrl(String inquiryImgUrl) {
        this.inquiryImgUrl = inquiryImgUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Object getInquiryState() {
        return inquiryState;
    }

    public void setInquiryState(Object inquiryState) {
        this.inquiryState = inquiryState;
    }

    public Date getStateUpdatedAt() {
        return stateUpdatedAt;
    }

    public void setStateUpdatedAt(Date stateUpdatedAt) {
        this.stateUpdatedAt = stateUpdatedAt;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
}