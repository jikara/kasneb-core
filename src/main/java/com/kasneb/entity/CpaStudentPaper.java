/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kasneb.entity.pk.CpaExamPK;
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
@Table(name = "CPAEXAMS")  //for CPA and CPS only.Stores eliogible papers
public class CpaStudentPaper implements Serializable {

    @EmbeddedId
    private CpaExamPK cpaExamPK;
    @Column(name = "REGNO")
    private String regNo;
    @ManyToOne
    @JoinColumn(name = "REGNO", referencedColumnName = "RegNo", insertable = false, updatable = false)
    @JsonBackReference
    private CpaRegistration cpaRegistration;
    @ManyToOne
    @JoinColumn(name = "REGNO", referencedColumnName = "RegNo", insertable = false, updatable = false)
    @JsonBackReference
    private CsRegistration csRegistration;
    @ManyToOne
    @JoinColumn(name = "SUBJECTCODE", referencedColumnName = "SubjectCode")
    private CpaPaper paper;
    @Column(name = "MSECTION")
    private Integer section;
    @Column(name = "MPART")
    private Integer part;
    @Column(name = "MSTREAM")
    private String stream;

    public CpaStudentPaper() {
    }

    public CpaStudentPaper(CpaPaper paper, Integer section, Integer part, String stream) {
        this.paper = paper;
        this.section = section;
        this.part = part;
        this.stream = stream;
    }

    public CpaExamPK getCpaExamPK() {
        return cpaExamPK;
    }

    public void setCpaExamPK(CpaExamPK cpaExamPK) {
        this.cpaExamPK = cpaExamPK;
    }

    public CpaPaper getPaper() {
        return paper;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public CpaRegistration getCpaRegistration() {
        return cpaRegistration;
    }

    public void setCpaRegistration(CpaRegistration cpaRegistration) {
        this.cpaRegistration = cpaRegistration;
    }

    public CsRegistration getCsRegistration() {
        return csRegistration;
    }

    public void setCsRegistration(CsRegistration csRegistration) {
        this.csRegistration = csRegistration;
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

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
