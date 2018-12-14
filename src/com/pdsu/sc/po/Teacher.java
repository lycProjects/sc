package com.pdsu.sc.po;

public class Teacher {
    private Integer teId;

    private String teName;

    private String teUnit;

    private String tePhone;

    private String tePosition;

    private String teIdcard;

    public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(Integer teId, String teName, String teUnit, String tePhone, String tePosition, String teIdcard) {
		super();
		this.teId = teId;
		this.teName = teName;
		this.teUnit = teUnit;
		this.tePhone = tePhone;
		this.tePosition = tePosition;
		this.teIdcard = teIdcard;
	}

	@Override
	public String toString() {
		return "Teacher [teId=" + teId + ", teName=" + teName + ", teUnit=" + teUnit + ", tePhone=" + tePhone
				+ ", tePosition=" + tePosition + ", teIdcard=" + teIdcard + "]";
	}

	public Integer getTeId() {
        return teId;
    }

    public void setTeId(Integer teId) {
        this.teId = teId;
    }

    public String getTeName() {
        return teName;
    }

    public void setTeName(String teName) {
        this.teName = teName == null ? null : teName.trim();
    }

    public String getTeUnit() {
        return teUnit;
    }

    public void setTeUnit(String teUnit) {
        this.teUnit = teUnit == null ? null : teUnit.trim();
    }

    public String getTePhone() {
        return tePhone;
    }

    public void setTePhone(String tePhone) {
        this.tePhone = tePhone == null ? null : tePhone.trim();
    }

    public String getTePosition() {
        return tePosition;
    }

    public void setTePosition(String tePosition) {
        this.tePosition = tePosition == null ? null : tePosition.trim();
    }

    public String getTeIdcard() {
        return teIdcard;
    }

    public void setTeIdcard(String teIdcard) {
        this.teIdcard = teIdcard == null ? null : teIdcard.trim();
    }
}