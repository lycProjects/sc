package com.pdsu.sc.po;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Jlrule {
    private Integer jlId;

    private Integer jlTeam;

    private String jlRecode;

    private Date jlTime;
    
    private List<Teammapping> teammapping;

	public List<Teammapping> getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(List<Teammapping> teammapping) {
		this.teammapping = teammapping;
	}

	public Integer getJlId() {
        return jlId;
    }

    public void setJlId(Integer jlId) {
        this.jlId = jlId;
    }

    public Integer getJlTeam() {
        return jlTeam;
    }

    public void setJlTeam(Integer jlTeam) {
        this.jlTeam = jlTeam;
    }

    public String getJlRecode() {
        return jlRecode;
    }

    public void setJlRecode(String jlRecode) {
        this.jlRecode = jlRecode == null ? null : jlRecode.trim();
    }

    public Date getJlTime() {
        return jlTime;
    }

    public void setJlTime(Date jlTime2) {
        this.jlTime = jlTime2;
    }

	@Override
	public String toString() {
		return "Jlrule [jlId=" + jlId + ", jlTeam=" + jlTeam + ", jlRecode=" + jlRecode + ", jlTime=" + jlTime
				+ ", teammapping=" + teammapping.toString() + "]";
	}
}