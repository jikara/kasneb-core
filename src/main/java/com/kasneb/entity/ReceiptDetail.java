
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.kasneb.entity.pk.ReceiptDetailPK;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CBRECDET")
public class ReceiptDetail implements Serializable {

    @EmbeddedId
    private ReceiptDetailPK receiptDetailPK;
    @JsonBackReference
    @ManyToOne(optional = false)
    @JoinColumn(name = "ReceiptNo", referencedColumnName = "ReceiptNo")
    private Receipt receipt;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Exam", referencedColumnName = "ExamCode")
    private Course course;
    @Column(name = "LastUser")
    private String lastUser;
    @Column(name = "LastMaintained")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "StudentName")
    private String studentName;
    @ManyToOne(optional = false)
    @JoinColumn(name = "Category", referencedColumnName = "CategoryCode")
    private ReceiptCategory category;
    @Column(name = "TransactionDesc")
    private String description;
    @Column(name = "Amount")
    private BigDecimal amount;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "RegNo")
    private CpaRegistration registration;
    @Column(name = "PostingCode")
    private String postingCode;
    @Column(name = "FullRegNo")
    private String fullRegNo;
    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency currency;

    public ReceiptDetail() {
    }

    public ReceiptDetail(ReceiptDetailPK receiptDetailPK, Receipt receipt, Course course, ReceiptCategory category, String description, BigDecimal amount, CpaRegistration registration, String postingCode, String fullRegNo, Currency currency) {
        this.receiptDetailPK = receiptDetailPK;
        this.receipt = receipt;
        this.course = course;
        this.category = category;
        this.description = description;
        this.amount = amount;
        this.registration = registration;
        this.postingCode = postingCode;
        this.fullRegNo = fullRegNo;
        this.currency = currency;
    }

    public ReceiptDetailPK getReceiptDetailPK() {
        return receiptDetailPK;
    }

    public void setReceiptDetailPK(ReceiptDetailPK receiptDetailPK) {
        this.receiptDetailPK = receiptDetailPK;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ReceiptCategory getCategory() {
        return category;
    }

    public void setCategory(ReceiptCategory category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public CpaRegistration getRegistration() {
        return registration;
    }

    public void setRegistration(CpaRegistration registration) {
        this.registration = registration;
    }

    public String getPostingCode() {
        return postingCode;
    }

    public void setPostingCode(String postingCode) {
        this.postingCode = postingCode;
    }

    public String getFullRegNo() {
        return fullRegNo;
    }

    public void setFullRegNo(String fullRegNo) {
        this.fullRegNo = fullRegNo;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
