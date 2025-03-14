package com.artu.fullstack_team_project_administrator.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * postings
 */
public class Postings implements Serializable {
    private Integer postId;

    private String userId;

    private String contents;

    private String locationTag;

    private String personTagId;

    private Object visibilityType;

    private Date createdAt;

    private Date editAt;

    private Boolean isUsed;

    private static final long serialVersionUID = 1L;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getLocationTag() {
        return locationTag;
    }

    public void setLocationTag(String locationTag) {
        this.locationTag = locationTag;
    }

    public String getPersonTagId() {
        return personTagId;
    }

    public void setPersonTagId(String personTagId) {
        this.personTagId = personTagId;
    }

    public Object getVisibilityType() {
        return visibilityType;
    }

    public void setVisibilityType(Object visibilityType) {
        this.visibilityType = visibilityType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEditAt() {
        return editAt;
    }

    public void setEditAt(Date editAt) {
        this.editAt = editAt;
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }
}