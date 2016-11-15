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
@Table(name = "cicmakt")
public class CictExamPaper implements Serializable {

    @EmbeddedId
    private CpaExamPaperPK cpaExamPaperPK;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regNo", referencedColumnName = "regno")
    private CictExamEntry cictExamEntry;
    @ManyToOne
    @JoinColumn(name = "subcode", referencedColumnName = "SubjectCode")
    private CictPaper cictPaper;
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

    public CictExamEntry getCictExamEntry() {
        return cictExamEntry;
    }

    public void setCictExamEntry(CictExamEntry cictExamEntry) {
        this.cictExamEntry = cictExamEntry;
    }

    public CictPaper getCictPaper() {
        return cictPaper;
    }

    public void setCictPaper(CictPaper cictPaper) {
        this.cictPaper = cictPaper;
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
