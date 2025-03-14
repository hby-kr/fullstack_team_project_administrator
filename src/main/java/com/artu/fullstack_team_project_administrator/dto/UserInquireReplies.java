package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * user_inquire_replies
 */
public class UserInquireReplies implements Serializable {
    private Integer replyId;

    private Integer inquireId;

    private String replyContents;

    private Date repliedAt;

    private String counselorId;

    private Boolean isUsed;

    private static final long serialVersionUID = 1L;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getInquireId() {
        return inquireId;
    }

    public void setInquireId(Integer inquireId) {
        this.inquireId = inquireId;
    }

    public String getReplyContents() {
        return replyContents;
    }

    public void setReplyContents(String replyContents) {
        this.replyContents = replyContents;
    }

    public Date getRepliedAt() {
        return repliedAt;
    }

    public void setRepliedAt(Date repliedAt) {
        this.repliedAt = repliedAt;
    }

    public String getCounselorId() {
        return counselorId;
    }

    public void setCounselorId(String counselorId) {
        this.counselorId = counselorId;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
}