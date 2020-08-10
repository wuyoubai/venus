package com.example.demo.bean;

import java.util.Date;

/**
 * @program: demo
 * @description: 语言能力
 * @author: 拜无忧
 * @create: 2020-08-03
 */
public class languageSkills {

    private Integer id;
    private Integer candidateid;
    private String language;
    private Integer LSProficiency;//听说能力，0一般，1良好，2熟练，3精通
    private Integer RWProficiency;//读写能力，0一般，1良好，2熟练，3精通

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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getLSProficiency() {
        return LSProficiency;
    }

    public void setLSProficiency(Integer LSProficiency) {
        this.LSProficiency = LSProficiency;
    }

    public Integer getRWProficiency() {
        return RWProficiency;
    }

    public void setRWProficiency(Integer RWProficiency) {
        this.RWProficiency = RWProficiency;
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
