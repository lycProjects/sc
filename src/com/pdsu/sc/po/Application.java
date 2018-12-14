package com.pdsu.sc.po;

public class Application {
    private Integer apId;

    private Integer apState;
    /**
     * 等待确认1，已通过2，已拒绝3，进行中4，已完项5，已失效6
     */
    private String apStatename;

    private Integer apProjectid;

    private String apProjectname;

    private Integer apTeamid;

    private String apTeamname;

    private String apTime;

    private String apReason;

    private String apHandletime;

    public Integer getApId() {
        return apId;
    }

    public void setApId(Integer apId) {
        this.apId = apId;
    }

    public Integer getApState() {
        return apState;
    }

    public void setApState(Integer apState) {
        this.apState = apState;
    }

    public String getApStatename() {
        return apStatename;
    }

    public void setApStatename(String apStatename) {
        this.apStatename = apStatename == null ? null : apStatename.trim();
    }

    public Integer getApProjectid() {
        return apProjectid;
    }

    public void setApProjectid(Integer apProjectid) {
        this.apProjectid = apProjectid;
    }

    public String getApProjectname() {
        return apProjectname;
    }

    public void setApProjectname(String apProjectname) {
        this.apProjectname = apProjectname == null ? null : apProjectname.trim();
    }

    public Integer getApTeamid() {
        return apTeamid;
    }

    public void setApTeamid(Integer apTeamid) {
        this.apTeamid = apTeamid;
    }

    public String getApTeamname() {
        return apTeamname;
    }

    public void setApTeamname(String apTeamname) {
        this.apTeamname = apTeamname == null ? null : apTeamname.trim();
    }

    public String getApTime() {
        return apTime;
    }

    public void setApTime(String apTime) {
        this.apTime = apTime == null ? null : apTime.trim();
    }

    public String getApReason() {
        return apReason;
    }

    public void setApReason(String apReason) {
        this.apReason = apReason == null ? null : apReason.trim();
    }

    public String getApHandletime() {
        return apHandletime;
    }

    public void setApHandletime(String apHandletime) {
        this.apHandletime = apHandletime == null ? null : apHandletime.trim();
    }
}