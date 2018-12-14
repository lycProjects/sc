package com.pdsu.sc.po;

import java.util.List;

public class Leave {
    private Integer leId;

    private String leName;

    private Integer leTeam;

    private Integer leTime;
    
    //Õ≈∂””≥…‰±Ì
    
    private List<Teammapping> teammapping;

	public List<Teammapping> getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(List<Teammapping> teammapping) {
		this.teammapping = teammapping;
	}

	public Integer getLeId() {
        return leId;
    }

    public void setLeId(Integer leId) {
        this.leId = leId;
    }

    public String getLeName() {
        return leName;
    }

    public void setLeName(String leName) {
        this.leName = leName == null ? null : leName.trim();
    }

    public Integer getLeTeam() {
        return leTeam;
    }

    public void setLeTeam(Integer leTeam) {
        this.leTeam = leTeam;
    }

    public Integer getLeTime() {
        return leTime;
    }

    public void setLeTime(Integer leTime) {
        this.leTime = leTime;
    }

	@Override
	public String toString() {
		return "Leave [leId=" + leId + ", leName=" + leName + ", leTeam=" + leTeam + ", leTime=" + leTime
				+ ", teammapping=" + teammapping.toString() + "]";
	}   
}