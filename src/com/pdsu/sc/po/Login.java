package com.pdsu.sc.po;

import java.util.List;

public class Login {
    private Integer loId;

    private String loUsername;

    private String loPassword;

    private Integer loRole;

    private Integer loTeam;
    
    private List<Roles> roles;

    public Integer getLoId() {
        return loId;
    }

    public void setLoId(Integer loId) {
        this.loId = loId;
    }

    public String getLoUsername() {
        return loUsername;
    }

    public void setLoUsername(String loUsername) {
        this.loUsername = loUsername == null ? null : loUsername.trim();
    }

    public String getLoPassword() {
        return loPassword;
    }

    public void setLoPassword(String loPassword) {
        this.loPassword = loPassword == null ? null : loPassword.trim();
    }

    public Integer getLoRole() {
        return loRole;
    }

    public void setLoRole(Integer loRole) {
        this.loRole = loRole;
    }

    public Integer getLoTeam() {
        return loTeam;
    }

    public void setLoTeam(Integer loTeam) {
        this.loTeam = loTeam;
    }

	public List<Roles> getRoles() {
		return roles;
	}

	public void setRoles(List<Roles> roles) {
		this.roles = roles;
	}
}