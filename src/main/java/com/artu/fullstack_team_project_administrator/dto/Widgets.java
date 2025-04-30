package com.artu.fullstack_team_project_administrator.dto;


public class Widgets  {
    private int widgetId;
    private String widgetSize;
    private String widgetTheme;
    private String widgetJson;
    private boolean deleted;

    public int getWidgetId() {
        return widgetId;
    }

    public String getWidgetSize() {
        return widgetSize;
    }

    public String getWidgetTheme() {
        return widgetTheme;
    }

    public String getWidgetJson() {
        return widgetJson;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setWidgetId(int widgetId) { this.widgetId = widgetId; }
    public void setWidgetSize(String widgetSize) { this.widgetSize = widgetSize; }
    public void setWidgetTheme(String widgetTheme) { this.widgetTheme = widgetTheme; }
    public void setWidgetJson(String widgetJson) { this.widgetJson = widgetJson; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; }
}
