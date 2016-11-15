/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CPAEXES")
public class CsExemption implements Serializable {

    @Id
    @Column(name = "DetailID")
    private Integer id;
    @Column(name = "regNo")
    private String regNo;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regNo", referencedColumnName = "RegNo", insertable = false, updatable = false)
    private CsRegistration csRegistration;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "regNo", referencedColumnName = "RegNo", insertable = false, updatable = false)
    private CictRegistration cictRegistration;
    @Column(name = "sect")
    private Integer section;
    @Column(name = "stream")
    private String stream;
    @Column(name = "subcode")
    private String paperCode;
    @Column(name = "flag")
    private String flaq;
    @Column(name = "altered")
    private String altered;
    @Column(name = "MRef")
    private String reference;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "DateExempted")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CsRegistration getCsRegistration() {
        return csRegistration;
    }

    public void setCsRegistration(CsRegistration csRegistration) {
        this.csRegistration = csRegistration;
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

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode;
    }

    public String getFlaq() {
        return flaq;
    }

    public void setFlaq(String flaq) {
        this.flaq = flaq;
    }

    public String getAltered() {
        return altered;
    }

    public void setAltered(String altered) {
        this.altered = altered;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
