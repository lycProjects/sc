package com.pdsu.sc.po;

public class Title {
	//文章id
    private Integer tiId;
    //文章类型，文章一共有三种类型：1 团队介绍、2 公司介绍、3 下达项目
    private Integer tiType;
    //作者前述
    private String tiMentionedabove;
    //作者
    private String tiAuther;
    //作者id
    private Integer tiAutherid;
    //文章地址
    private String tiAddressurl;
    ///发布时间
    private String tiReleasetime;

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public Integer getTiType() {
        return tiType;
    }

    public void setTiType(Integer tiType) {
        this.tiType = tiType;
    }

    public String getTiMentionedabove() {
        return tiMentionedabove;
    }

    public void setTiMentionedabove(String tiMentionedabove) {
        this.tiMentionedabove = tiMentionedabove == null ? null : tiMentionedabove.trim();
    }

    public String getTiAuther() {
        return tiAuther;
    }

    public void setTiAuther(String tiAuther) {
        this.tiAuther = tiAuther == null ? null : tiAuther.trim();
    }

    public Integer getTiAutherid() {
        return tiAutherid;
    }

    public void setTiAutherid(Integer tiAutherid) {
        this.tiAutherid = tiAutherid;
    }

    public String getTiAddressurl() {
        return tiAddressurl;
    }

    public void setTiAddressurl(String tiAddressurl) {
        this.tiAddressurl = tiAddressurl == null ? null : tiAddressurl.trim();
    }

    public String getTiReleasetime() {
        return tiReleasetime;
    }

    public void setTiReleasetime(String tiReleasetime) {
        this.tiReleasetime = tiReleasetime == null ? null : tiReleasetime.trim();
    }
}