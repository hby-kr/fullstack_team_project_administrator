package com.artu.fullstack_team_project_administrator.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Widgets implements Serializable {
    private static final long serialVersionUID = 1L;

    private int widgetId;
    private int userId;
    private String widgetSize;
    private String widgetTheme;
    private Boolean widgetIsUsed;
    private String widgetJson;
    private Boolean isUsed;
}
