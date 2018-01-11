package com.liuxn.entity.raw.model;

import java.util.Date;

public class CmsUser {
    private Integer id;

    private String vcloginname;

    private String vcloginpwd;

    private Date datcreate;

    private Date datlasttime;

    private Date datupdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVcloginname() {
        return vcloginname;
    }

    public void setVcloginname(String vcloginname) {
        this.vcloginname = vcloginname == null ? null : vcloginname.trim();
    }

    public String getVcloginpwd() {
        return vcloginpwd;
    }

    public void setVcloginpwd(String vcloginpwd) {
        this.vcloginpwd = vcloginpwd == null ? null : vcloginpwd.trim();
    }

    public Date getDatcreate() {
        return datcreate;
    }

    public void setDatcreate(Date datcreate) {
        this.datcreate = datcreate;
    }

    public Date getDatlasttime() {
        return datlasttime;
    }

    public void setDatlasttime(Date datlasttime) {
        this.datlasttime = datlasttime;
    }

    public Date getDatupdate() {
        return datupdate;
    }

    public void setDatupdate(Date datupdate) {
        this.datupdate = datupdate;
    }

    @Override
    public String toString() {
        return "CmsUser{" +
                "id=" + id +
                ", vcloginname='" + vcloginname + '\'' +
                ", vcloginpwd='" + vcloginpwd + '\'' +
                ", datcreate=" + datcreate +
                ", datlasttime=" + datlasttime +
                ", datupdate=" + datupdate +
                '}';
    }
}