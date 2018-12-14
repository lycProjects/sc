package com.pdsu.sc.po;

public class Demo {
    private Integer deId;

    private Integer deTeamid;

    private String deTeamname;

    private String deProjectname;

    private Integer deTitileid;

    private String dePictureaddress;

    private String deProjectteacher;

    private String deTime;

    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    public Integer getDeTeamid() {
        return deTeamid;
    }

    public void setDeTeamid(Integer deTeamid) {
        this.deTeamid = deTeamid;
    }

    public String getDeTeamname() {
        return deTeamname;
    }

    public void setDeTeamname(String deTeamname) {
        this.deTeamname = deTeamname == null ? null : deTeamname.trim();
    }

    public String getDeProjectname() {
        return deProjectname;
    }

    public void setDeProjectname(String deProjectname) {
        this.deProjectname = deProjectname == null ? null : deProjectname.trim();
    }

    public Integer getDeTitileid() {
        return deTitileid;
    }

    public void setDeTitileid(Integer deTitileid) {
        this.deTitileid = deTitileid;
    }

    public String getDePictureaddress() {
        return dePictureaddress;
    }

    public void setDePictureaddress(String dePictureaddress) {
        this.dePictureaddress = dePictureaddress == null ? null : dePictureaddress.trim();
    }

    public String getDeProjectteacher() {
        return deProjectteacher;
    }

    public void setDeProjectteacher(String deProjectteacher) {
        this.deProjectteacher = deProjectteacher == null ? null : deProjectteacher.trim();
    }

    public String getDeTime() {
        return deTime;
    }

    public void setDeTime(String deTime) {
        this.deTime = deTime == null ? null : deTime.trim();
    }
}