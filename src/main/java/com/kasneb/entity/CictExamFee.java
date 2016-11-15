/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CSCPAExamFees")
public class CictExamFee implements Serializable {

    @Id
    @Column(name = "DetailID")
    private Integer id;
    @Column(name = "SectionCode")
    private Integer sectionId;
    @Column(name = "ExamFees")
    private BigDecimal sectionExamFee;
    @Column(name = "ExamFeesSub")
    private BigDecimal paperExamFee;
    @Column(name = "ExamFeesLate")
    private BigDecimal sectionLateExamFee;
    @Column(name = "ExamFeesSubLate")
    private BigDecimal paperLateExamFee;
    @Column(name = "ExemptionSub")
    private BigDecimal exemptionFee;
    @Column(name = "RemarkingFees")
    private BigDecimal remarkingFee;
    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency currency;
    @Column(name = "PriceList")
    private Boolean current;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public BigDecimal getSectionExamFee() {
        return sectionExamFee;
    }

    public void setSectionExamFee(BigDecimal sectionExamFee) {
        this.sectionExamFee = sectionExamFee;
    }

    public BigDecimal getPaperExamFee() {
        return paperExamFee;
    }

    public void setPaperExamFee(BigDecimal paperExamFee) {
        this.paperExamFee = paperExamFee;
    }

    public BigDecimal getSectionLateExamFee() {
        return sectionLateExamFee;
    }

    public void setSectionLateExamFee(BigDecimal sectionLateExamFee) {
        this.sectionLateExamFee = sectionLateExamFee;
    }

    public BigDecimal getPaperLateExamFee() {
        return paperLateExamFee;
    }

    public void setPaperLateExamFee(BigDecimal paperLateExamFee) {
        this.paperLateExamFee = paperLateExamFee;
    }

    public BigDecimal getExemptionFee() {
        return exemptionFee;
    }

    public void setExemptionFee(BigDecimal exemptionFee) {
        this.exemptionFee = exemptionFee;
    }

    public BigDecimal getRemarkingFee() {
        return remarkingFee;
    }

    public void setRemarkingFee(BigDecimal remarkingFee) {
        this.remarkingFee = remarkingFee;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

}
