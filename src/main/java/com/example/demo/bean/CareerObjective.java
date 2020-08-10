package com.example.demo.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: 求职意向
 * @author: 拜无忧
 * @create: 2020-08-03
 */
public class CareerObjective {

    private Integer id;
    private Integer candidateid;
    private String jobCategories;//期望职位
    private String industryCategories;//期望行业
    private Integer workType;//求职类型，0全职，1兼职
    private String workCity;//工作城市
    private String expectedMonthlySalary;//薪资要求

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

    public String getJobCategories() {
        return jobCategories;
    }

    public void setJobCategories(String jobCategories) {
        this.jobCategories = jobCategories;
    }

    public String getIndustryCategories() {
        return industryCategories;
    }

    public void setIndustryCategories(String industryCategories) {
        this.industryCategories = industryCategories;
    }

    public Integer getWorkType() {
        return workType;
    }

    public void setWorkType(Integer workType) {
        this.workType = workType;
    }

    public String getWorkCity() {
        return workCity;
    }

    public void setWorkCity(String workCity) {
        this.workCity = workCity;
    }

    public String getExpectedMonthlySalary() {
        return expectedMonthlySalary;
    }

    public void setExpectedMonthlySalary(String expectedMonthlySalary) {
        this.expectedMonthlySalary = expectedMonthlySalary;
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
