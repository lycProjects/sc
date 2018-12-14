package com.pdsu.sc.po;

import java.util.Date;

public class Wsrule {
	
	private Integer wsId;

    private Integer wsTeam;

    private String wsRecode;

	private Teammapping teammapping;

    private Date wsTime;
    public Wsrule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wsrule(Integer wsId, Integer wsTeam, String wsRecode, Date wsTime) {
		super();
		this.wsId = wsId;
		this.wsTeam = wsTeam;
		this.wsRecode = wsRecode;
		this.wsTime = wsTime;
	}
	
	@Override
	public String toString() {
		return "Wsrule [wsId=" + wsId + ", wsTeam=" + wsTeam + ", wsRecode=" + wsRecode + ", wsTime=" + wsTime
				+ ", teammapping=" + teammapping + "]";
	}
    public String toStringtest() {
		return "Wsrule [ teammapping=" + teammapping + " , wsRecode=" + wsRecode + ",wsTime=" + wsTime
				+ "]";
	}

    public Teammapping getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(Teammapping teammapping) {
		this.teammapping = teammapping;
	}



	public Integer getWsId() {
        return wsId;
    }

    public void setWsId(Integer wsId) {
        this.wsId = wsId;
    }

    public Integer getWsTeam() {
        return wsTeam;
    }

    public void setWsTeam(Integer wsTeam) {
        this.wsTeam = wsTeam;
    }

    public String getWsRecode() {
        return wsRecode;
    }

    public void setWsRecode(String wsRecode) {
        this.wsRecode = wsRecode == null ? null : wsRecode.trim();
    }

    public Date getWsTime() {
        return wsTime;
    }

    public void setWsTime(Date wsTime) {
        this.wsTime = wsTime;
    }

}