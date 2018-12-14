package com.pdsu.sc.po;

public class Equip {
    private Integer id;

    private String eqName;

    private String eqUnit;

    private Integer eqAmout;

    private String eqNote;
    
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEqName() {
        return eqName;
    }

    public void setEqName(String eqName) {
        this.eqName = eqName == null ? null : eqName.trim();
    }

    public String getEqUnit() {
        return eqUnit;
    }

    public void setEqUnit(String eqUnit) {
        this.eqUnit = eqUnit == null ? null : eqUnit.trim();
    }

    public Integer getEqAmout() {
        return eqAmout;
    }

    public void setEqAmout(Integer eqAmout) {
        this.eqAmout = eqAmout;
    }

    public String getEqNote() {
        return eqNote;
    }

    public void setEqNote(String eqNote) {
        this.eqNote = eqNote == null ? null : eqNote.trim();
    }

	@Override
	public String toString() {
		return "Equip [id=" + id + ", eqName=" + eqName + ", eqUnit=" + eqUnit + ", eqAmout=" + eqAmout + ", eqNote="
				+ eqNote + "]";
	}
    
    
}