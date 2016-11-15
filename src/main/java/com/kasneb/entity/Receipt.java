/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
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
@Table(name = "CBRECEIPTS") //For all courses
public class Receipt implements Serializable {

    @Id
    @Column(name = "ReceiptNo")
    private String receiptNo;
    @ManyToOne
    @JoinColumn(name = "Exam", referencedColumnName = "ExamCode")
    private Course course;
    @Column(name = "ReceivedFrom")
    private String receivedFrom;
    @Column(name = "REGNO")
    private String regNo;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "regNo", insertable = false, updatable = false)
    private CpaRegistration cpaRegistration;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "regNo", insertable = false, updatable = false)
    private CsRegistration csRegistration;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "regNo", insertable = false, updatable = false)
    private CictRegistration cictRegistration;
    @Column(name = "FullRegNo")
    private String fullRegistrationNumber;
    @Column(name = "LastUser")
    private String lastUser;
    @Column(name = "MDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date mdate;
    @Column(name = "PaymentType")
    private String paymentType;
    @Column(name = "TotalAmount")
    private BigDecimal amount;
    @Column(name = "RefNo")
    private String referenceNumber;
    @ManyToOne
    @JoinColumn(name = "CurrencyCode", referencedColumnName = "CurrencyCode")
    private Currency currency;
    @Column(name = "Amount2")
    private BigDecimal amount2;
    @JsonManagedReference
    @OneToMany(mappedBy = "receipt", cascade = CascadeType.ALL)
    private Collection<ReceiptDetail> receiptDetails;

    public String getReceiptNo() {
        return receiptNo;
    }

    public void setReceiptNo(String receiptNo) {
        this.receiptNo = receiptNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getReceivedFrom() {
        return receivedFrom;
    }

    public void setReceivedFrom(String receivedFrom) {
        this.receivedFrom = receivedFrom;
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

    public CictRegistration getCictRegistration() {
        return cictRegistration;
    }

    public void setCictRegistration(CictRegistration cictRegistration) {
        this.cictRegistration = cictRegistration;
    }

    public String getFullRegistrationNumber() {
        return fullRegistrationNumber;
    }

    public void setFullRegistrationNumber(String fullRegistrationNumber) {
        this.fullRegistrationNumber = fullRegistrationNumber;
    }

    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }

    public Date getMdate() {
        return mdate;
    }

    public void setMdate(Date mdate) {
        this.mdate = new Date();
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getAmount2() {
        return amount2;
    }

    public void setAmount2(BigDecimal amount2) {
        this.amount2 = amount2;
    }

    public Collection<ReceiptDetail> getReceiptDetails() {
        return receiptDetails;
    }

    public void setReceiptDetails(Collection<ReceiptDetail> receiptDetails) {
        Collection<ReceiptDetail> r = new ArrayList<>();
        for (ReceiptDetail receiptDetail : receiptDetails) {
            receiptDetail.setReceipt(this);
            r.add(receiptDetail);
        }
        this.receiptDetails = r;
    }

}
