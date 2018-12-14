package com.pdsu.sc.po;

public class Enterprise extends EnterpriseKey {
    private String enBriefintroduction;

    private String enPhone;

    private String enRecruitment;

    private String enPicture;

    public String getEnBriefintroduction() {
        return enBriefintroduction;
    }

    public void setEnBriefintroduction(String enBriefintroduction) {
        this.enBriefintroduction = enBriefintroduction == null ? null : enBriefintroduction.trim();
    }

    public String getEnPhone() {
        return enPhone;
    }

    public void setEnPhone(String enPhone) {
        this.enPhone = enPhone == null ? null : enPhone.trim();
    }

    public String getEnRecruitment() {
        return enRecruitment;
    }

    public void setEnRecruitment(String enRecruitment) {
        this.enRecruitment = enRecruitment == null ? null : enRecruitment.trim();
    }

    public String getEnPicture() {
        return enPicture;
    }

    public void setEnPicture(String enPicture) {
        this.enPicture = enPicture == null ? null : enPicture.trim();
    }
}