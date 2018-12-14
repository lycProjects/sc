package com.pdsu.sc.po;

public class NewsCategory {
    private Integer newscateId;

    private String newscateTitle;

    private String newscateBrief;

    private String newscateMark;

    public Integer getNewscateId() {
        return newscateId;
    }

    public void setNewscateId(Integer newscateId) {
        this.newscateId = newscateId;
    }

    public String getNewscateTitle() {
        return newscateTitle;
    }

    public void setNewscateTitle(String newscateTitle) {
        this.newscateTitle = newscateTitle == null ? null : newscateTitle.trim();
    }

    public String getNewscateBrief() {
        return newscateBrief;
    }

    public void setNewscateBrief(String newscateBrief) {
        this.newscateBrief = newscateBrief == null ? null : newscateBrief.trim();
    }

    public String getNewscateMark() {
        return newscateMark;
    }

    public void setNewscateMark(String newscateMark) {
        this.newscateMark = newscateMark == null ? null : newscateMark.trim();
    }
}