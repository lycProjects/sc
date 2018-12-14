package com.pdsu.sc.po;

public class NewsNew {
    private Integer newsnewId;

    private String newsnewTitle;

    private String newsnewBrief;

    private String newsnewAuthorname;

    private String newsnewHtmluri;

    private String newsnewPubtime;

    private Integer newscateId;

    //·ÇÊý¾Ý¿â×Ö¶Î
    private String imageUrl;
    public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Integer getNewsnewId() {
        return newsnewId;
    }

    public void setNewsnewId(Integer newsnewId) {
        this.newsnewId = newsnewId;
    }

    public String getNewsnewTitle() {
        return newsnewTitle;
    }

    public void setNewsnewTitle(String newsnewTitle) {
        this.newsnewTitle = newsnewTitle == null ? null : newsnewTitle.trim();
    }

    public String getNewsnewBrief() {
        return newsnewBrief;
    }

    public void setNewsnewBrief(String newsnewBrief) {
        this.newsnewBrief = newsnewBrief == null ? null : newsnewBrief.trim();
    }

    public String getNewsnewAuthorname() {
        return newsnewAuthorname;
    }

    public void setNewsnewAuthorname(String newsnewAuthorname) {
        this.newsnewAuthorname = newsnewAuthorname == null ? null : newsnewAuthorname.trim();
    }

    public String getNewsnewHtmluri() {
        return newsnewHtmluri;
    }

    public void setNewsnewHtmluri(String newsnewHtmluri) {
        this.newsnewHtmluri = newsnewHtmluri == null ? null : newsnewHtmluri.trim();
    }

    public String getNewsnewPubtime() {
        return newsnewPubtime;
    }

    public void setNewsnewPubtime(String newsnewPubtime) {
        this.newsnewPubtime = newsnewPubtime == null ? null : newsnewPubtime.trim();
    }

    public Integer getNewscateId() {
        return newscateId;
    }

    public void setNewscateId(Integer newscateId) {
        this.newscateId = newscateId;
    }
}