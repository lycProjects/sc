package com.pdsu.sc.po;

public class Equipborrow {
    private Integer eqbId;

    private Integer eqbTeam;

    private Integer eqbZfour;

    private Integer eqbOneg;

    private Integer eqbTwog;

    private Integer eqbFourg;
    
    private Teammapping teammapping;
    

	public Teammapping getTeammapping() {
		return teammapping;
	}

	public void setTeammapping(Teammapping teammapping) {
		this.teammapping = teammapping;
	}

	public Integer getEqbId() {
        return eqbId;
    }

    public void setEqbId(Integer eqbId) {
        this.eqbId = eqbId;
    }

    public Integer getEqbTeam() {
        return eqbTeam;
    }

    public void setEqbTeam(Integer eqbTeam) {
        this.eqbTeam = eqbTeam;
    }

    public Integer getEqbZfour() {
        return eqbZfour;
    }

    public void setEqbZfour(Integer eqbZfour) {
        this.eqbZfour = eqbZfour;
    }

    public Integer getEqbOneg() {
        return eqbOneg;
    }

    public void setEqbOneg(Integer eqbOneg) {
        this.eqbOneg = eqbOneg;
    }

    public Integer getEqbTwog() {
        return eqbTwog;
    }

    public void setEqbTwog(Integer eqbTwog) {
        this.eqbTwog = eqbTwog;
    }

    public Integer getEqbFourg() {
        return eqbFourg;
    }

    public void setEqbFourg(Integer eqbFourg) {
        this.eqbFourg = eqbFourg;
    }

	@Override
	public String toString() {
		return "Equipborrow [eqbId=" + eqbId + ", eqbTeam=" + eqbTeam + ", eqbZfour=" + eqbZfour + ", eqbOneg="
				+ eqbOneg + ", eqbTwog=" + eqbTwog + ", eqbFourg=" + eqbFourg + ", teammapping=" + teammapping.getTmmName() + "]";
	}

	

	
}