/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CPASUBS")
public class CpaPaper implements Serializable {

    @Id
    @Column(name = "SubjectCode")
    private String code;
    @Column(name = "MStream")
    private String stream;
    @Column(name = "MSection")
    private Integer section;
    @Column(name = "MPart")
    private Integer part;
    @Column(name = "MSubject")
    private String name;
    @Column(name = "ExempFees")
    private BigDecimal exemptionFee;
    @Column(name = "ExamDay")
    private Integer examDay;
    @Column(name = "ExamDayPart")
    private Integer dayPart;
    @Column(name = "ExamDate")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date examDate;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getExemptionFee() {
        return exemptionFee;
    }

    public void setExemptionFee(BigDecimal exemptionFee) {
        this.exemptionFee = exemptionFee;
    }

    public Integer getExamDay() {
        return examDay;
    }

    public void setExamDay(Integer examDay) {
        this.examDay = examDay;
    }

    public Integer getDayPart() {
        return dayPart;
    }

    public void setDayPart(Integer dayPart) {
        this.dayPart = dayPart;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

}
