package com.pdsu.sc.po;

public class IssusdProject extends IssusdProjectKey {
	//��ҵid
    private Integer enId;
    //����id
    private Integer tiId;
    //��˾����
    private String enName;
    //��Ŀ���
    private String ipBriefintroduction;
    //״̬id
    private Integer enProjectstate;
    //״̬����  1�ȴ����룬2�����У�3������
    private String enStatename;
    //�´�ʱ��
    private String enIssusdtime;
    //����ʱ��
    private String enProjectover;

    public Integer getEnId() {
        return enId;
    }

    public void setEnId(Integer enId) {
        this.enId = enId;
    }

    public Integer getTiId() {
        return tiId;
    }

    public void setTiId(Integer tiId) {
        this.tiId = tiId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName == null ? null : enName.trim();
    }

    public String getIpBriefintroduction() {
        return ipBriefintroduction;
    }

    public void setIpBriefintroduction(String ipBriefintroduction) {
        this.ipBriefintroduction = ipBriefintroduction == null ? null : ipBriefintroduction.trim();
    }

    public Integer getEnProjectstate() {
        return enProjectstate;
    }

    public void setEnProjectstate(Integer enProjectstate) {
        this.enProjectstate = enProjectstate;
    }

    public String getEnStatename() {
        return enStatename;
    }

    public void setEnStatename(String enStatename) {
        this.enStatename = enStatename == null ? null : enStatename.trim();
    }

    public String getEnIssusdtime() {
        return enIssusdtime;
    }

    public void setEnIssusdtime(String enIssusdtime) {
        this.enIssusdtime = enIssusdtime == null ? null : enIssusdtime.trim();
    }

    public String getEnProjectover() {
        return enProjectover;
    }

    public void setEnProjectover(String enProjectover) {
        this.enProjectover = enProjectover == null ? null : enProjectover.trim();
    }
}