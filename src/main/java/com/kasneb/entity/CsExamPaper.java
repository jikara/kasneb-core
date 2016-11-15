/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.kasneb.entity.pk.CpaExamPaperPK;
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
@Table(name = "cpsmakt")
public class CsExamPaper implements Serializable {

    @EmbeddedId
    private CpaExamPaperPK cpaExamPaperPK;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regNo", referencedColumnName = "regno")
    private CsExamEntry csExamEntry;
    @ManyToOne
    @JoinColumn(name = "subcode", referencedColumnName = "SubjectCode")
    private CpaPaper cpaPaper;
    @Column(name = "sect")
    private Integer sectionId;
    @Column(name = "sectype")
    private String sectionType;

    public CpaExamPaperPK getCpaExamPaperPK() {
        return cpaExamPaperPK;
    }

    public void setCpaExamPaperPK(CpaExamPaperPK cpaExamPaperPK) {
        this.cpaExamPaperPK = cpaExamPaperPK;
    }

    public CsExamEntry getCsExamEntry() {
        return csExamEntry;
    }

    public void setCsExamEntry(CsExamEntry csExamEntry) {
        this.csExamEntry = csExamEntry;
    }

    public CpaPaper getCpaPaper() {
        return cpaPaper;
    }

    public void setCpaPaper(CpaPaper cpaPaper) {
        this.cpaPaper = cpaPaper;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionType() {
        return sectionType;
    }

    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }
}
