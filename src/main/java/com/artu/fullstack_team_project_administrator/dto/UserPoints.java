package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;

/**
 * user_points
 */
public class UserPoints implements Serializable {
    private Integer pointId;

    private String userId;

    private Integer pointValue;

    private String pointReason;

    private Boolean isUsed;

    private static final long serialVersionUID = 1L;

    public Integer getPointId() {
        return pointId;
    }

    public void setPointId(Integer pointId) {
        this.pointId = pointId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPointValue() {
        return pointValue;
    }

    public void setPointValue(Integer pointValue) {
        this.pointValue = pointValue;
    }

    public String getPointReason() {
        return pointReason;
    }

    public void setPointReason(String pointReason) {
        this.pointReason = pointReason;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
}