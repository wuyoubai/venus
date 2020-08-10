package com.example.demo.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: 专业技能
 * @author: 拜无忧
 * @create: 2020-08-03
 */
public class ProfessionalSkills {

    private Integer id;
    private Integer candidateid;
    private String skillName;//技能名称
    private Integer lengthOfUser;//使用时长(月)
    private Integer masteryDegree;// 掌握程度

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

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Integer getLengthOfUser() {
        return lengthOfUser;
    }

    public void setLengthOfUser(Integer lengthOfUser) {
        this.lengthOfUser = lengthOfUser;
    }

    public Integer getMasteryDegree() {
        return masteryDegree;
    }

    public void setMasteryDegree(Integer masteryDegree) {
        this.masteryDegree = masteryDegree;
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
