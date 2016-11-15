/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kasneb.entity.pk.CictExamPK;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CIPEXAMS")  //for CPA and CPS only.Stores eliogible papers
public class CictStudentPaper implements Serializable {

    @EmbeddedId
    private CictExamPK cictExamPK;
    @Column(name = "REGNO")
    private String regNo;
    @ManyToOne
    @JoinColumn(name = "REGNO", referencedColumnName = "RegNo", insertable = false, updatable = false)
    @JsonBackReference
    private CictRegistration cictRegistration;
    @ManyToOne
    @JoinColumn(name = "SUBJECTCODE", referencedColumnName = "SubjectCode")
    private CpaPaper paper;
    @Column(name = "MLEVEL")
    private Integer section;
    @Column(name = "MPART")
    private Integer part;
    private Boolean practical;

    public CictExamPK getCictExamPK() {
        return cictExamPK;
    }

    public void setCictExamPK(CictExamPK cictExamPK) {
        this.cictExamPK = cictExamPK;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public CictRegistration getCictRegistration() {
        return cictRegistration;
    }

    public void setCictRegistration(CictRegistration cictRegistration) {
        this.cictRegistration = cictRegistration;
    }

    public CpaPaper getPaper() {
        return paper;
    }

    public void setPaper(CpaPaper paper) {
        this.paper = paper;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public Boolean getPractical() {
        return practical;
    }

    public void setPractical(Boolean practical) {
        this.practical = practical;
    }

}
