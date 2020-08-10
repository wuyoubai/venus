package com.example.demo.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: 自我评价
 * @author: 拜无忧
 * @create: 2020-08-03
 */
public class SelfEvaluation {

    private Integer id;
    private Integer candidateid;
    private String evaluation;

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

    public Integer getCandidateid() {
        return candidateid;
    }

    public void setCandidateid(Integer candidateid) {
        this.candidateid = candidateid;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
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
