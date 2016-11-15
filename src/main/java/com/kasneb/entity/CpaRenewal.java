/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kasneb.entity.pk.CpaRenewalPK;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CPARENEW")
public class CpaRenewal implements Serializable {

    @EmbeddedId
    private CpaRenewalPK cpaRenewalPK;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regno", referencedColumnName = "RegNo")
    private CpaRegistration cpaRegistration;
    @Column(name = "start_date")
    private Integer startYear;
    @Column(name = "end_date")
    private Integer endYear;
    @ManyToOne
    @JoinColumn(name = "rerecno", referencedColumnName = "receiptNo")
    private Receipt receipt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "redate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date renewed;

    public CpaRenewalPK getCpaRenewalPK() {
        return cpaRenewalPK;
    }

    public void setCpaRenewalPK(CpaRenewalPK cpaRenewalPK) {
        this.cpaRenewalPK = cpaRenewalPK;
    }

    public CpaRegistration getCpaRegistration() {
        return cpaRegistration;
    }

    public void setCpaRegistration(CpaRegistration cpaRegistration) {
        this.cpaRegistration = cpaRegistration;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Date getRenewed() {
        return renewed;
    }

    public void setRenewed(Date renewed) {
        this.renewed = renewed;
    }
}
