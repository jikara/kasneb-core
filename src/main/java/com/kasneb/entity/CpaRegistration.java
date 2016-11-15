/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "cparegm")
public class CpaRegistration implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "RegNo")
    @TableGenerator(
            name = "empGen",
            table = "SEQUENCE",
            pkColumnName = "SEQ_NAME",
            valueColumnName = "SEQ_COUNT",
            pkColumnValue = "SEQ_GEN",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "empGen")
    private String regNo;
    @Transient
    private String registrationNumber;
    @Column(name = "Stream")
    @Enumerated(EnumType.STRING)
    private Stream stream;
    @Column(name = "Stream", insertable = false, updatable = false)
    private String stringStream;
    @Column(name = "RDate", updatable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date registered = new Date();
    @Column(name = "FexDate")
    private Integer firstExamDate;
    @Column(name = "LName")
    private String lastName;
    @Column(name = "FName")
    private String firstName;
    @Column(name = "OName1")
    private String otherName;
    @Column(name = "OName2")
    private String otherName2;
    @ManyToOne
    @JoinColumn(name = "Sex", referencedColumnName = "SexCode")
    private Sex sex;
    @Column(name = "Bdate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateOfBirth;
    @ManyToOne
    @JoinColumn(name = "Nation", referencedColumnName = "NationalityNo")
    private Nation nation;
    @Column(name = "IdNo")
    private String idNumber;
    @ManyToOne
    @JoinColumn(name = "Quali", referencedColumnName = "QualificationNo")
    private Qualification quali;
    @Column(name = "RRNoDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rrDate;
    @Column(name = "RRNo")
    private String rrNumber;
    @Column(name = "PReg")
    private String pReg;
    @Column(name = "IdNo2")
    private String idNo2;
    @Column(name = "Address1")
    private String address1;
    @Column(name = "Address2")
    private String address2;
    @Column(name = "Address3")
    private String address3;
    @Column(name = "Address4")
    private String address4;
    @Column(name = "Address5")
    private String address5;
    @Column(name = "EmailAddress")
    private String email;
    @Column(name = "Cellphone")
    private String cellphone;
    @Column(name = "Telephone")
    private String telephone;
    @ManyToOne
    @JoinColumn(name = "PExamination", referencedColumnName = "ExamCode")
    private Course previousCourse;
    @Column(name = "LearnAbout")
    private String learnAbout;
    @ManyToOne
    @JoinColumn(name = "LearnAboutCode", referencedColumnName = "LearnAboutCode")
    private LearnAbout learnt;
    @ManyToOne
    @JoinColumn(name = "Nationality", referencedColumnName = "NationalityNo")
    private Nation nationality;
    @ManyToOne
    @JoinColumn(name = "Qualification", referencedColumnName = "QualificationNo")
    private Qualification qualification;
    @OneToMany(mappedBy = "cpaRegistration", cascade = CascadeType.ALL)
    private List<Receipt> receipts;
    @OneToMany(mappedBy = "cpaRegistration", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<CpaStudentPaper> eligiblePapers;
    @OneToMany(mappedBy = "cpaRegistration")
    private List<CpaExemption> exemptions;
    @JsonManagedReference
    @OneToMany(mappedBy = "cpaRegistration")
    private List<ExamBooking> examBookings;
    @OneToOne(mappedBy = "cpaRegistration")
    @JsonManagedReference
    private CpaExamEntry cpaExamEntry;

    public CpaRegistration() {
    }

    public CpaRegistration(String regNo, Stream stream, Date registered, Integer firstExamDate, String lastName, String firstName, String otherName, String otherName2, Sex sex, Date dateOfBirth, Nation nation, String idNumber, Qualification quali, Date rrDate, String rrNumber, String pReg, String idNo2, String address1, String address2, String address3, String address4, String address5, String email, String cellphone, String telephone, Course previousCourse, String learnAbout, LearnAbout learnt, Nation nationality, Qualification qualification) {
        this.regNo = regNo;
        this.stream = stream;
        this.registered = registered;
        this.firstExamDate = firstExamDate;
        this.lastName = lastName;
        this.firstName = firstName;
        this.otherName = otherName;
        this.otherName2 = otherName2;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.nation = nation;
        this.idNumber = idNumber;
        this.quali = quali;
        this.rrDate = rrDate;
        this.rrNumber = rrNumber;
        this.pReg = pReg;
        this.idNo2 = idNo2;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.address5 = address5;
        this.email = email;
        this.cellphone = cellphone;
        this.telephone = telephone;
        this.previousCourse = previousCourse;
        this.learnAbout = learnAbout;
        this.learnt = learnt;
        this.nationality = nationality;
        this.qualification = qualification;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getRegistrationNumber() {
        String prefix = "NAC";
        if (getStringStream() != null) {
            if (getStringStream().startsWith("A")) {
                prefix = "NAC";
            } else {
                prefix = "NSC";
            }
        }
        registrationNumber = prefix + "/" + getRegNo();
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Stream getStream() {
        return stream;
    }

    public void setStream(Stream stream) {
        this.stream = stream;
    }

    public String getStringStream() {
        return stringStream;
    }

    public void setStringStream(String stringStream) {
        this.stringStream = stringStream;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Integer getFirstExamDate() {
        return firstExamDate;
    }

    public void setFirstExamDate(Integer firstExamDate) {
        this.firstExamDate = firstExamDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getOtherName2() {
        return otherName2;
    }

    public void setOtherName2(String otherName2) {
        this.otherName2 = otherName2;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    public Nation getNationality() {
        return nationality;
    }

    public void setNationality(Nation nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Date getRrDate() {
        return rrDate;
    }

    public void setRrDate(Date rrDate) {
        this.rrDate = rrDate;
    }

    public String getRrNumber() {
        return rrNumber;
    }

    public void setRrNumber(String rrNumber) {
        this.rrNumber = rrNumber;
    }

    public String getpReg() {
        return pReg;
    }

    public void setpReg(String pReg) {
        this.pReg = pReg;
    }

    public String getIdNo2() {
        return idNo2;
    }

    public void setIdNo2(String idNo2) {
        this.idNo2 = idNo2;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Course getPreviousCourse() {
        return previousCourse;
    }

    public void setPreviousCourse(Course previousCourse) {
        this.previousCourse = previousCourse;
    }

    public String getLearnAbout() {
        return learnAbout;
    }

    public void setLearnAbout(String learnAbout) {
        this.learnAbout = learnAbout;
    }

    public LearnAbout getLearnt() {
        return learnt;
    }

    public void setLearnt(LearnAbout learnt) {
        this.learnt = learnt;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        List<Receipt> e = new ArrayList<>();
        for (Receipt receipt : receipts) {
            receipt.setCpaRegistration(this);
            e.add(receipt);
        }
        this.receipts = e;
    }

    public List<CpaStudentPaper> getEligiblePapers() {
        return eligiblePapers;
    }

    public void setEligiblePapers(List<CpaStudentPaper> eligiblePapers) {
        List<CpaStudentPaper> e = new ArrayList<>();
        for (CpaStudentPaper paper : eligiblePapers) {
            paper.setCpaRegistration(this);
            e.add(paper);
        }
        this.eligiblePapers = e;
    }

    public List<CpaExemption> getExemptions() {
        return exemptions;
    }

    public void setExemptions(List<CpaExemption> exemptions) {
        this.exemptions = exemptions;
    }

    public List<ExamBooking> getExamBookings() {
        return examBookings;
    }

    public void setExamBookings(List<ExamBooking> examBookings) {
        this.examBookings = examBookings;
    }

    public CpaExamEntry getCpaExamEntry() {
        return cpaExamEntry;
    }

    public void setCpaExamEntry(CpaExamEntry cpaExamEntry) {
        this.cpaExamEntry = cpaExamEntry;
    }

}
