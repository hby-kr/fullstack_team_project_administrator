package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public class Event implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer eventId;

    private Integer ctgrId;

    private String title;

    private String location;

    private String company;

    private String address;

    private String ageLimit;

    private Integer howLong;

    private Boolean isApproved;

    private Boolean isUsed;

    private String memo;

    private String userId;


}
