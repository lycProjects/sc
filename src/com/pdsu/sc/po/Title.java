package com.pdsu.sc.po;

public class Title {
	//����id
    private Integer tiId;
    //�������ͣ�����һ�����������ͣ�1 �Ŷӽ��ܡ�2 ��˾���ܡ�3 �´���Ŀ
    private Integer tiType;
    //����ǰ��
    private String tiMentionedabove;
    //����
    private String tiAuther;
    //����id
    private Integer tiAutherid;
    //���µ�ַ
    private String tiAddressurl;
    ///����ʱ��
    private String tiReleasetime;

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public Integer getTiType() {
        return tiType;
    }

    public void setTiType(Integer tiType) {
        this.tiType = tiType;
    }

    public String getTiMentionedabove() {
        return tiMentionedabove;
    }

    public void setTiMentionedabove(String tiMentionedabove) {
        this.tiMentionedabove = tiMentionedabove == null ? null : tiMentionedabove.trim();
    }

    public String getTiAuther() {
        return tiAuther;
    }

    public void setTiAuther(String tiAuther) {
        this.tiAuther = tiAuther == null ? null : tiAuther.trim();
    }

    public Integer getTiAutherid() {
        return tiAutherid;
    }

    public void setTiAutherid(Integer tiAutherid) {
        this.tiAutherid = tiAutherid;
    }

    public String getTiAddressurl() {
        return tiAddressurl;
    }

    public void setTiAddressurl(String tiAddressurl) {
        this.tiAddressurl = tiAddressurl == null ? null : tiAddressurl.trim();
    }

    public String getTiReleasetime() {
        return tiReleasetime;
    }

    public void setTiReleasetime(String tiReleasetime) {
        this.tiReleasetime = tiReleasetime == null ? null : tiReleasetime.trim();
    }
}