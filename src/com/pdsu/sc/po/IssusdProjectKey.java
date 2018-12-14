package com.pdsu.sc.po;

public class IssusdProjectKey {
    private Integer ipId;

    private String ipProjectname;

    public Integer getIpId() {
        return ipId;
    }

    public void setIpId(Integer ipId) {
        this.ipId = ipId;
    }

    public String getIpProjectname() {
        return ipProjectname;
    }

    public void setIpProjectname(String ipProjectname) {
        this.ipProjectname = ipProjectname == null ? null : ipProjectname.trim();
    }
}