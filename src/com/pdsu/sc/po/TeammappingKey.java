package com.pdsu.sc.po;

public class TeammappingKey {
    private Integer tmmId;

    private String tmmName;

    public Integer getTmmId() {
        return tmmId;
    }

    public void setTmmId(Integer tmmId) {
        this.tmmId = tmmId;
    }

    public String getTmmName() {
        return tmmName;
    }

    public void setTmmName(String tmmName) {
        this.tmmName = tmmName == null ? null : tmmName.trim();
    }
}