package com.example.demo.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @program: venus
 * @description: 企业
 * @author: 拜无忧
 * @create: 2020-08-19
 */
public class Group {

    private Integer id;
    private String groupname;
    private String groupuser;
    private String groupphone;
    private Integer legalize;//认证：0认证,1未认证
    private Integer status;//状态：0启用,1禁用
    private Date contractStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date contractEndTime;
    private String remark;
    private Integer isdel;
    private Integer creator;
    private Date createtime;
    private Integer updator;
    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getGroupuser() {
        return groupuser;
    }

    public void setGroupuser(String groupuser) {
        this.groupuser = groupuser;
    }

    public String getGroupphone() {
        return groupphone;
    }

    public void setGroupphone(String groupphone) {
        this.groupphone = groupphone;
    }

    public Integer getLegalize() {
        return legalize;
    }

    public void setLegalize(Integer legalize) {
        this.legalize = legalize;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getContractStartTime() {
        return contractStartTime;
    }

    public void setContractStartTime(Date contractStartTime) {
        this.contractStartTime = contractStartTime;
    }

    public Date getContractEndTime() {
        return contractEndTime;
    }

    public void setContractEndTime(Date contractEndTime) {
        this.contractEndTime = contractEndTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUpdator() {
        return updator;
    }

    public void setUpdator(Integer updator) {
        this.updator = updator;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
