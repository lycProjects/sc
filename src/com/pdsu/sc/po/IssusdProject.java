package com.pdsu.sc.po;

public class IssusdProject extends IssusdProjectKey {
	//企业id
    private Integer enId;
    //文章id
    private Integer tiId;
    //公司名称
    private String enName;
    //项目简介
    private String ipBriefintroduction;
    //状态id
    private Integer enProjectstate;
    //状态名称  1等待申请，2进行中，3已完项
    private String enStatename;
    //下达时间
    private String enIssusdtime;
    //结项时间
    private String enProjectover;

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getIpBriefintroduction() {
        return ipBriefintroduction;
    }

    public void setIpBriefintroduction(String ipBriefintroduction) {
        this.ipBriefintroduction = ipBriefintroduction == null ? null : ipBriefintroduction.trim();
    }

    public Integer getEnProjectstate() {
        return enProjectstate;
    }

    public void setEnProjectstate(Integer enProjectstate) {
        this.enProjectstate = enProjectstate;
    }

    public String getEnStatename() {
        return enStatename;
    }

    public void setEnStatename(String enStatename) {
        this.enStatename = enStatename == null ? null : enStatename.trim();
    }

    public String getEnIssusdtime() {
        return enIssusdtime;
    }

    public void setEnIssusdtime(String enIssusdtime) {
        this.enIssusdtime = enIssusdtime == null ? null : enIssusdtime.trim();
    }

    public String getEnProjectover() {
        return enProjectover;
    }

    public void setEnProjectover(String enProjectover) {
        this.enProjectover = enProjectover == null ? null : enProjectover.trim();
    }
}