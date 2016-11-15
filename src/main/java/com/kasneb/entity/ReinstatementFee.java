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
@Table(name = "CSReinstatementFees")
public class ReinstatementFee implements Serializable {

    @Id
    @Column(name = "DetailID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency currency;
    @ManyToOne
    @JoinColumn(name = "ExaminationCode", referencedColumnName = "ExamCode")
    private Course course;
    @Column(name = "ReInstatementFees")
    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

}
