package com.pdsu.sc.po;

import java.util.List;

public class Absence {
    private Integer abId;

    private String abName;

    private Integer abTeam;

    private Integer abTime;
    
    private List<Teammapping> teammapping; 

    public List<Teammapping> getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(List<Teammapping> teammapping) {
		this.teammapping = teammapping;
	}

	public Absence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Absence(Integer abId, String abName, Integer abTeam, Integer abTime) {
		super();
		this.abId = abId;
		this.abName = abName;
		this.abTeam = abTeam;
		this.abTime = abTime;
	}

	public Integer getAbId() {
        return abId;
    }

    public void setAbId(Integer abId) {
        this.abId = abId;
    }

    public String getAbName() {
        return abName;
    }

    public void setAbName(String abName) {
        this.abName = abName == null ? null : abName.trim();
    }

    public Integer getAbTeam() {
        return abTeam;
    }

    public void setAbTeam(Integer abTeam) {
        this.abTeam = abTeam;
    }

    public Integer getAbTime() {
        return abTime;
    }

    public void setAbTime(Integer abTime) {
        this.abTime = abTime;
    }
}