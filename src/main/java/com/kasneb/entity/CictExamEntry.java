/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "cpaentt")
public class CictExamEntry implements Serializable {

    @Id
    @Column(name = "regno")
    private Integer regNo;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regno", referencedColumnName = "RegNo", updatable = false, insertable = false)
    private CictRegistration cictRegistration;
    @Column(name = "exyr")
    private Integer year;
    @Column(name = "exsit")
    private Integer sittingId;
    @Column(name = "xrdate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    @OneToMany(mappedBy = "cictExamEntry")
    private List<CictExamPaper> cictExamPapers;

    public Integer getRegNo() {
        return regNo;
    }

    public void setRegNo(Integer regNo) {
        this.regNo = regNo;
    }

    public CictRegistration getCictRegistration() {
        return cictRegistration;
    }

    public void setCictRegistration(CictRegistration cictRegistration) {
        this.cictRegistration = cictRegistration;
    }

    public List<CictExamPaper> getCictExamPapers() {
        return cictExamPapers;
    }

    public void setCictExamPapers(List<CictExamPaper> cictExamPapers) {
        this.cictExamPapers = cictExamPapers;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSittingId() {
        return sittingId;
    }

    public void setSittingId(Integer sittingId) {
        this.sittingId = sittingId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
