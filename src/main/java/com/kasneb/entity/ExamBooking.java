/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "CSBookings") //For all courses
public class ExamBooking implements Serializable {

    @Id
    @Column(name = "DetailID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "Examination", referencedColumnName = "ExamCode")
    private Course course;
    @Column(name = "RegNo")
    private Integer regNo;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "RegNo", insertable = false, updatable = false)
    private CpaRegistration cpaRegistration;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "RegNo", insertable = false, updatable = false)
    private CsRegistration csRegistration;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "RegNo", referencedColumnName = "RegNo", insertable = false, updatable = false)
    private CictRegistration cictRegistration;
    @Column(name = "ExamCode")
    private String examCode;
    @Column(name = "ExamDescription")
    private String examDescription;
    @Column(name = "exyr")
    private Integer examYear;
    @Column(name = "exsit")
    private Integer examSitting;
    @ManyToOne
    @JoinColumn(name = "xrno", referencedColumnName = "ReceiptNo")
    private Receipt receipt;
    @Column(name = "LastUser")
    private String lastUser;
    @Column(name = "LastMaintained")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date created;
    @Column(name = "Processed")
    private Boolean processed;
    @ManyToOne
    @JoinColumn(name = "CentreCode", referencedColumnName = "ccode")
    private Centre centre;
    @Column(name = "CentreName")
    private String centreName;    

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

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
    }

    public Integer getExamYear() {
        return examYear;
    }

    public void setExamYear(Integer examYear) {
        this.examYear = examYear;
    }

    public Integer getExamSitting() {
        return examSitting;
    }

    public void setExamSitting(Integer examSitting) {
        this.examSitting = examSitting;
    }

    public Receipt getReceipt() {
        return receipt;
    }

    public void setReceipt(Receipt receipt) {
        this.receipt = receipt;
    }

    public String getLastUser() {
        return lastUser;
    }

    public void setLastUser(String lastUser) {
        this.lastUser = lastUser;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

}
