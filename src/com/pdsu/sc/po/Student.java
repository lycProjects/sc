package com.pdsu.sc.po;

import java.util.List;

public class Student {
    private Integer stId;

    private Integer stTeam;

    private Integer stNumber;

    private String stName;

    private String stSex;

    private String stClass;

    private String stPhone;

    private String stIdcard;

    private String stTeacher;
    
    private List<Teammapping> teammapping;

    public List<Teammapping> getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(List<Teammapping> teammapping) {
		this.teammapping = teammapping;
	}

	public Integer getStId() {
        return stId;
    }

    public void setStId(Integer stId) {
        this.stId = stId;
    }

    public Integer getStTeam() {
        return stTeam;
    }

    public void setStTeam(Integer stTeam) {
        this.stTeam = stTeam;
    }

    public Integer getStNumber() {
        return stNumber;
    }

    public void setStNumber(Integer stNumber) {
        this.stNumber = stNumber;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName == null ? null : stName.trim();
    }

    public String getStSex() {
        return stSex;
    }

    public void setStSex(String stSex) {
        this.stSex = stSex == null ? null : stSex.trim();
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass == null ? null : stClass.trim();
    }

    public String getStPhone() {
        return stPhone;
    }

    public void setStPhone(String stPhone) {
        this.stPhone = stPhone == null ? null : stPhone.trim();
    }

    public String getStIdcard() {
        return stIdcard;
    }

    public void setStIdcard(String stIdcard) {
        this.stIdcard = stIdcard == null ? null : stIdcard.trim();
    }

    public String getStTeacher() {
        return stTeacher;
    }

    public void setStTeacher(String stTeacher) {
        this.stTeacher = stTeacher == null ? null : stTeacher.trim();
    }

	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stTeam=" + stTeam + ", stNumber=" + stNumber + ", stName=" + stName
				+ ", stSex=" + stSex + ", stClass=" + stClass + ", stPhone=" + stPhone + ", stIdcard=" + stIdcard
				+ ", stTeacher=" + stTeacher ;//+ ", teammapping=" + teammapping.toString() + "]";
	}
}