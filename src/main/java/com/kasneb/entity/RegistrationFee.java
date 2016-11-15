/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CSRegFees")
public class RegistrationFee implements Serializable {

    @Id
    @Column(name = "DetailID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "ExaminationCode", referencedColumnName = "ExamCode")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency currency;
    @Column(name = "RegFee")
    private BigDecimal registrationFee;
    @Column(name = "LateRegFees")
    private BigDecimal lateRegistrationFee;
    @Column(name = "RegRenFees")
    private BigDecimal registrationRenewalFee;
    @Column(name = "RegReinst")
    private BigDecimal registrationReinstatementFee;
    @Column(name = "StudentIDCard")
    private BigDecimal studentIdFee;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Column(name = "LastEdited")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date lastEdited;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getRegistrationFee() {
        return registrationFee;
    }

    public void setRegistrationFee(BigDecimal registrationFee) {
        this.registrationFee = registrationFee;
    }

    public BigDecimal getLateRegistrationFee() {
        return lateRegistrationFee;
    }

    public void setLateRegistrationFee(BigDecimal lateRegistrationFee) {
        this.lateRegistrationFee = lateRegistrationFee;
    }

    public BigDecimal getRegistrationRenewalFee() {
        return registrationRenewalFee;
    }

    public void setRegistrationRenewalFee(BigDecimal registrationRenewalFee) {
        this.registrationRenewalFee = registrationRenewalFee;
    }

    public BigDecimal getRegistrationReinstatementFee() {
        return registrationReinstatementFee;
    }

    public void setRegistrationReinstatementFee(BigDecimal registrationReinstatementFee) {
        this.registrationReinstatementFee = registrationReinstatementFee;
    }

    public BigDecimal getStudentIdFee() {
        return studentIdFee;
    }

    public void setStudentIdFee(BigDecimal studentIdFee) {
        this.studentIdFee = studentIdFee;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }
}
